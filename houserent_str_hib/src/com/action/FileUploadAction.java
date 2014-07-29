package com.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.StrutsUtil;

import antlr.Utils;

import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport {

	private String savePath;
	private File pic;
	private String picContentType;
	private String picFileName;

	private File[] pics;
	private String[] picsContentType;
	private String[] picsFileName;

	public String pic() {
		try {
			FileUtils.copyFile(pic,
					new File(getSavePath() + "\\" + picFileName));
			return "upload_success";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "upload_fail";
		}
	}

	public String pics() {
		try {
			for (int i = 0; i < pics.length; i++) {
				FileUtils.copyFile(pics[i], new File(getSavePath() + "\\"
						+ picsFileName[i]));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "upload_fail";
		}
		return "upload_success";
	}

	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath(savePath);
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public File getPic() {
		return pic;
	}

	public void setPic(File pic) {
		this.pic = pic;
	}

	public String getPicContentType() {
		return picContentType;
	}

	public void setPicContentType(String picContentType) {
		this.picContentType = picContentType;
	}

	public String getPicFileName() {
		return picFileName;
	}

	public void setPicFileName(String picFileName) {
		this.picFileName = picFileName;
	}

	public File[] getPics() {
		return pics;
	}

	public void setPics(File[] pics) {
		this.pics = pics;
	}

	public String[] getPicsContentType() {
		return picsContentType;
	}

	public void setPicsContentType(String[] picsContentType) {
		this.picsContentType = picsContentType;
	}

	public String[] getPicsFileName() {
		return picsFileName;
	}

	public void setPicsFileName(String[] picsFileName) {
		this.picsFileName = picsFileName;
	}
}
