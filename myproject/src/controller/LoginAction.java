package controller;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
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
	public void validate() {
		if(username==null || username.trim().equals("")){
			String a[]= {getText("uname")};
			this.addFieldError("usernamenull", getText("login.no.null", a));
		}
		if(password==null||password.trim().equals("")){
			String a[]={getText("upass")};
			this.addFieldError("passwordnull",getText("login.no.null",a));
		}
	}
	
}
