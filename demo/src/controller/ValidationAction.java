package controller;

import java.util.Date;
import java.util.GregorianCalendar;

import com.opensymphony.xwork2.ActionSupport;

public class ValidationAction extends ActionSupport {
	String username;
	String pass;
	short age;
	Date test_jquery;
	public Date getTest_jquery() {
		return test_jquery;
	}
	public void setTest_jquery(Date test_jquery) {
		this.test_jquery = test_jquery;
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
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public Date getMaxdate(){
		return new GregorianCalendar(2020,0,1).getTime();
	}
	public Date getMindate(){
		return new GregorianCalendar(2000,0,1).getTime();
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();
	}
	
}
