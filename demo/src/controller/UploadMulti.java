package controller;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadMulti extends ActionSupport {
	File [] upload;
	String [] uploadContenType;
	String [] uploadFileName;
	public File[] getUpload() {
		return upload;
	}
	public void setUpload(File[] upload) {
		this.upload = upload;
	}
	public String[] getUploadContenType() {
		return uploadContenType;
	}
	public void setUploadContenType(String[] uploadContenType) {
		this.uploadContenType = uploadContenType;
	}
	public String[] getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String[] uoloadFileName) {
		this.uploadFileName = uoloadFileName;
	}
	@Override
	public String execute() throws Exception {
		IOUtils io = new IOUtils("/upload");
		io.filesCopy(upload, uploadFileName);
		return SUCCESS;
	}
	
}
