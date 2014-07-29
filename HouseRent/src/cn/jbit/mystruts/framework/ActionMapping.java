package cn.jbit.mystruts.framework;

import java.util.HashMap;
import java.util.Map;

public class ActionMapping {

	private String name;
	private String className;
	private Map<String, String> resultMap = new HashMap<String, String>();

	public String getResult(String name) {
		return resultMap.get(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void addResult(String name, String result) {
		this.resultMap.put(name, result);
	}
}