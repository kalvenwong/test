package com.action;

import java.util.Locale;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LanguageAction extends ActionSupport {
	
	public String chinese() {
		ActionContext.getContext().setLocale(Locale.SIMPLIFIED_CHINESE);
		ServletActionContext
				.getRequest()
				.getSession()
				.setAttribute("WW_TRANS_I18N_LOCALE", Locale.SIMPLIFIED_CHINESE);
		return SUCCESS;
	}

	public String twchinese() {
		ActionContext.getContext().setLocale(Locale.TAIWAN);
		ServletActionContext
				.getRequest()
				.getSession()
				.setAttribute("WW_TRANS_I18N_LOCALE", Locale.TAIWAN);
		return SUCCESS;
	}
	
	public String englise(){
		ActionContext.getContext().setLocale(Locale.US);
		ServletActionContext.getRequest().getSession().setAttribute("WW_TRANS_I18N_LOCALE",Locale.US);
		return SUCCESS;
		}
	
}
