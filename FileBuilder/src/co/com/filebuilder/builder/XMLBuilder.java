package co.com.filebuilder.builder;

import java.util.List;
import java.util.Map;

import co.com.filebuilder.utils.ClassUtils;

public class XMLBuilder extends FileBuilder{

	@Override
	public <T extends Object> String buildFileList(List<T> object) throws Exception {
		String name = object.get(0).getClass().getSimpleName()+"s";
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<");
		strBuilder.append(name);
		strBuilder.append(">");
		for (Object objectItem : object) {
			strBuilder.append(buildFileObject(objectItem));
		}
		strBuilder.append("</");
		strBuilder.append(name);
		strBuilder.append(">");
		return strBuilder.toString();
	}

	@Override
	public String buildFileObject(Object object) throws Exception {
		mapAttributes = ClassUtils.getAttributes(object);
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("<");
		strBuilder.append(object.getClass().getSimpleName());
		strBuilder.append(">");
		for (Map.Entry<String, Object> entry : mapAttributes.entrySet()){
			strBuilder.append("<"+entry.getKey()+">");
			if(entry.getValue()!=null) {
				strBuilder.append(entry.getValue());
			}
			strBuilder.append("</"+entry.getKey()+">");
		}
		strBuilder.append("</");
		strBuilder.append(object.getClass().getSimpleName());
		strBuilder.append(">");
		return strBuilder.toString();
	}


}
