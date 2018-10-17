package co.com.filebuilder.director;

import java.util.List;

import co.com.filebuilder.builder.FileBuilder;

public class FileDirector {
	
	private FileBuilder fileBuilder;
	
	
	public FileDirector(FileBuilder fileBuilder){
		this.fileBuilder = fileBuilder;
	}
	
    public String constructFileObject(Object object) throws Exception{
    	return fileBuilder.buildFileObject(object);
    }
    
    public <T extends Object> String constructFileList(List<T> object) throws Exception {
    	return fileBuilder.buildFileList(object);
    }

}
