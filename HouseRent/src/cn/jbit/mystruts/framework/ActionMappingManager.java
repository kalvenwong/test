package cn.jbit.mystruts.framework;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ActionMappingManager {

	private static Map<String, ActionMapping> actionMappings = new HashMap<String, ActionMapping>();

	public void init(String configureFileName) {
		try {
			if (configureFileName == null || configureFileName.isEmpty()) {
				throw new Exception("configureFileName为空");
			}
			InputStream is = this.getClass().getResourceAsStream(
					"/" + configureFileName);
			Document doc = new SAXReader().read(is);
			Element root = doc.getRootElement();
			Iterator<Element> actionsIt = root.elements("actions").iterator();
			Element actions = actionsIt.next();
			for (Iterator<Element> actionIt = actions.elementIterator("action"); actionIt
					.hasNext();) {
				Element action = actionIt.next();
				ActionMapping mapping = new ActionMapping();
				mapping.setName(action.attributeValue("name"));
				mapping.setClassName(action.attributeValue("class"));
				for (Iterator<Element> resultIt = action
						.elementIterator("result"); resultIt.hasNext();) {
					Element resultElement = resultIt.next();
					String name = resultElement.attributeValue("name");
					String result=resultElement.getText();
					if (name == null || "".equals(name)) {
						name = "success";
					}
					mapping.addResult(name, result);
				}
				actionMappings.put(mapping.getName(), mapping);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ActionMappingManager(String[] configureFileNames) {
		for (String configureFileName : configureFileNames) {
			init(configureFileName);
		}
	}
	public ActionMapping getActionMappingByName(String actionName)
			throws Exception {
		if (actionName == null || actionName.isEmpty()) {
			return null;
		}
		ActionMapping mapping = this.actionMappings.get(actionName);
		if (mapping == null) {
			throw new Exception("mapping为空:[" + actionName + " ]");
		}
		return mapping;
	}
}