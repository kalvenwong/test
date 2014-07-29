package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyTimeInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		long currentTime=System.currentTimeMillis();
		String result=invocation.invoke();
		long countTime=System.currentTimeMillis()-currentTime;
		System.out.println("拦截器用时:"+countTime+"ms");
		return result;
	}

}
