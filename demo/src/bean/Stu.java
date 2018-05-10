package bean;

import static java.lang.System.out;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.ActionSupport;

public class Stu extends ActionSupport{
	private long id;
	private String username,cla;
	short age;
	private float java;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public float getJava() {
		return java;
	}

	public void setJava(float java) {
		this.java = java;
	}

	@Override public String toString(){
		ResourceBundle bundle
		  =ResourceBundle.getBundle("demo.msg");
		 String info=bundle.getString("stu.info");		  
	     String res=MessageFormat
				  .format(info,id,username);
		return res;
	}
}
