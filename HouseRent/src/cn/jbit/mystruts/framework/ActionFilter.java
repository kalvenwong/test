package cn.jbit.mystruts.framework;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.mystruts.framework.Action;

public class ActionFilter implements Filter {

	private FilterConfig config;
	private ActionMappingManager mappingManager;
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		String conStr=config.getInitParameter("config");
		//可以包含多个配置文件
		String[] configFiles=null;
		if(conStr==null||conStr.isEmpty()){
			configFiles=new String[]{"mystruts.xml"};
		}
		//拆分配置文件名称字符串
		configFiles=conStr.split(",");
		this.mappingManager=new ActionMappingManager(configFiles);
		
		//将请求转换成HttpServletRequest
		HttpServletRequest hsr=(HttpServletRequest)request;
		HttpServletResponse hsp=(HttpServletResponse)response;
		
		try {
			ActionMapping mapping = this.getActionMapping(hsr);
			Action action = ActionManager.createAction(mapping.getClassName());
			//得到结果的逻辑名
			String resultName = action.execute(hsr, hsp);
			//根据结果逻辑名返回实际跳转的视图名，也就是跳转的页面路径
			String result = mapping.getResult(resultName);
			if (result == null) {
				hsp.sendError(404, "没有配置Action的result元素");
				return;
			}
			//页面跳转
			hsr.getRequestDispatcher(result).forward(hsr, hsp);
			//hsp.sendRedirect(result);
		} catch (Exception e) {
			hsp.sendError(500, "出项异常情况，请耐心等待");
			e.printStackTrace();
		}
	}

	public void init(FilterConfig conf) throws ServletException {
		// TODO Auto-generated method stub
		this.config=conf;
		
	}
	
	public ActionMapping getActionMapping(ServletRequest request)
			throws Exception {
		//获取请求的路径
		String uri = ((HttpServletRequest)request).getRequestURI();
		String contextPath = ((HttpServletRequest)request).getContextPath();
		String actionPath = uri.substring(contextPath.length());
		String actionName = actionPath
				.substring(1, actionPath.lastIndexOf('.')).trim();
		ActionMapping mapping = null;
		try {
			mapping = mappingManager.getActionMappingByName(actionName);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return mapping;
	}
/*	
	public Action getAction(ServletRequest request) {
		// 获取请求的uri
		String uri = ((HttpServletRequest)request).getRequestURI();
		// 获取上下文路径
		String contextPath = ((HttpServletRequest)request).getContextPath();
		// 截取上下文路径以后的部分
		String actionPath = uri.substring(contextPath.length());
		// 获取Action 名称
		String actionName = actionPath
				.substring(1, actionPath.lastIndexOf('.')).trim();
		Action action = null;
		// 添加新功能时在这里添加
		if ("login".equals(actionName)) {
			action = new LoginAction();
		}
		return action;
	}*/
}
