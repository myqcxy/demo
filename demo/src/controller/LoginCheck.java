package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;

public class LoginCheck extends ActionSupport {
	String username;
	String pass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public void validate() {
		StuDAO check = new StuDAOImp();
		try {
			if(!check.check(username, pass)){
				addFieldError("stu.username","用户名或者密码不正确");	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
}
