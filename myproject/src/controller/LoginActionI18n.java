package controller;

import com.opensymphony.xwork2.ActionSupport;

public class LoginActionI18n extends ActionSupport {
	String username;
	String password;

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	@Override
	public void validate() {
		if(username==null||username.trim().equals("")){
			String a[] = {getText("uname")};
			this.addActionError("usernamenull");
		}
		if(password==null||password.trim().equals("")){
			String a[] = {getText("upass")};
			this.addActionError("passwordnull");
		}
	}
	
}
