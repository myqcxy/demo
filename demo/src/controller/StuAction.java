package controller;

import com.opensymphony.xwork2.ActionSupport;

import dao.StuDAO;
import dao.StuDAOImp;

public class StuAction extends ActionSupport {
	String [][] stus;
	long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String[][] getStus() {
		return stus;
	}

	public void setStus(String[][] stus) {
		this.stus = stus;
	}
	public String list() throws Exception{
		StuDAO stuDAO = new StuDAOImp();
		stus = stuDAO.list();
		return SUCCESS;
	}
	public String del() throws Exception{
		StuDAO stuDAO = new StuDAOImp();
		boolean isSuc = stuDAO.del(id);
		return isSuc?SUCCESS:ERROR;
	}
}
