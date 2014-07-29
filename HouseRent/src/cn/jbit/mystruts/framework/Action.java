package cn.jbit.mystruts.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	public static String SUCCESS = "success";
	public static String INPUT = "input";
	public static String ERROR = "error";
	
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception;
}