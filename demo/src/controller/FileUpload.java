package controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport {
	File file;
	String fileContentType;
	String fileFileName;
	@Override
	public String execute() throws Exception {
		String realpath = ServletActionContext.getServletContext().getRealPath("/upload");
		File f = new File(realpath);
		if(!f.exists()){ f.mkdir();}
		FileUtils.copyFile(file, new File(f,fileFileName));
		return SUCCESS;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
    
}
