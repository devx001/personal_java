package co.com.filebuilder.builder;

import java.util.List;
import java.util.Map;

public abstract class FileBuilder {
	
	protected String strFile;
	protected Map<String, Object> mapAttributes;
	
	public abstract <T extends Object> String buildFileList(List<T> object) throws Exception;
	public abstract String buildFileObject(Object object) throws Exception;

}
