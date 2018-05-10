package controller;

import com.opensymphony.xwork2.ActionSupport;

import bean.Stu;
import dao.StuDAO;
import dao.StuDAOImp;

public class LoginCheck extends ActionSupport {
	String username;
	String pass;
	Stu stu;
	public Stu getStu() {
		return stu;
	}
	public void setStu(Stu stu) {
		this.stu = stu;
	}
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
	
	public String add() throws Exception{
		StuDAO check = new StuDAOImp();
		
		boolean isRight=check.add(stu);
		
		return isRight ? SUCCESS:ERROR;
	}
	@Override
	public String execute() throws Exception {
		StuDAO check = new StuDAOImp();
		
		boolean isRight=check.check(username, pass);
		
		return isRight ? SUCCESS:ERROR;
	}
}
