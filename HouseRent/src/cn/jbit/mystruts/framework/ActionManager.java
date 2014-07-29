package cn.jbit.mystruts.framework;

public class ActionManager {

	public static Action createAction(String className) {
		try {
			return (Action) loadClass(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}


	public static Class loadClass(String className) {
		Class clazz = null;
		try {
			clazz = Thread.currentThread().getContextClassLoader().loadClass(
					className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (clazz == null) {
			try {
				clazz = Class.forName(className);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clazz;
	}
}
