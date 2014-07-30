package com.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private int txtNumber;
	private Date timeDate;
	

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public int getTxtNumber() {
		return txtNumber;
	}

	public void setTxtNumber(int txtNumber) {
		this.txtNumber = txtNumber;
	}

	public Date getTimeDate() {
		return timeDate;
	}

	public void setTimeDate(Date timeDate) {
		this.timeDate = timeDate;
	}
}
