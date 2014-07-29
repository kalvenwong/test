package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session=invocation.getInvocationContext().getSession();
		if(!session.containsKey("user")){
			return "loginuser";
		}else{
			return invocation.invoke();
		}
	}

}
