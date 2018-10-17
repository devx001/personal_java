package co.com.filebuilder.builder;

import java.util.List;
import java.util.Map;

import co.com.filebuilder.utils.ClassUtils;

public class JSONBuilder extends FileBuilder{
	
	@Override
	public <T extends Object> String buildFileList(List<T> object) throws Exception {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("[");
		for (Object objectItem : object) {
			strBuilder.append(buildFileObject(objectItem));
			strBuilder.append(", ");
		}
		strBuilder = new StringBuilder(strBuilder.substring(0, strBuilder.length() - 2));
		strBuilder.append("]");
		return strBuilder.toString();
	}

	@Override
	public String buildFileObject(Object object) throws Exception{
		mapAttributes = ClassUtils.getAttributes(object);
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("{");
		for (Map.Entry<String, Object> entry : mapAttributes.entrySet()){
			if(entry.getValue() == null || ClassUtils.isNumeric(entry.getValue().toString())) {
				strBuilder.append("\""+entry.getKey()+"\": "+entry.getValue()+", ");
			}else {
				strBuilder.append("\""+entry.getKey()+"\": \""+entry.getValue()+"\", ");
			}
		}
		strBuilder = new StringBuilder(strBuilder.substring(0, strBuilder.length() - 2));
		strBuilder.append("}");
		return strBuilder.toString();
	}


}
