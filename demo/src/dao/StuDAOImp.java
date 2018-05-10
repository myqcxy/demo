package dao;

import java.sql.*;
import java.util.*;

import bean.Stu;

public class StuDAOImp implements StuDAO {
	String url = "jdbc:hsqldb:hsql://localhost";
	String driver = "org.hsqldb.jdbcDriver";
	String user = "sa";
	String pass = "";
	
	@Override
	public boolean check(String username ,String passwd) throws Exception {
		Class.forName(driver);
		String sql = "select * from stu where username =? and pass=?";
		boolean isHave = false;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, username);
				pstmt.setString(2, passwd);
			try (ResultSet rs = pstmt.executeQuery();) {
				isHave = rs.next();
			}
		}
		return isHave;
	}
	
@Override
public boolean add(Stu stu) throws Exception {
	 boolean isSuc=false;
	    Class.forName(driver);
	    String sql = "insert into stuinfo(username,id,class,java,age) values(?,?,?,?,?)";
	    try (Connection con = DriverManager.getConnection(url, user, pass);
	        PreparedStatement pstmt = con.prepareStatement(sql);) {
	      pstmt.setString(1,stu.getUsername());
	      pstmt.setLong(2,stu.getId());
	      pstmt.setString(3,stu.getCla());
	      pstmt.setFloat(4, stu.getJava());   
	      pstmt.setShort(5, stu.getAge());   
	      
	      int row=pstmt.executeUpdate();
	      isSuc=row>0;
	    }
	    return isSuc;
}

@Override
public String[][] list() throws Exception{
	
    Class.forName(driver);
    String [][] stus;
    String sql = "select * from stuinfo";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        Statement pstmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);) {
      try(ResultSet rs = pstmt.executeQuery(sql);){
      rs.last();
      int rows = rs.getRow();
    	
      stus = new String[rows][5];
      rs.beforeFirst();
      int i = 0;
      while(rs.next()){
    	  
    	  stus[i][0] = rs.getLong("id")+  "";
    	  stus[i][1] = rs.getString("username");
    	  stus[i][2] = rs.getString("class");
    	  stus[i][3] = rs.getShort("age")+  "";
    	  stus[i][4] = rs.getFloat("java")+  "";
    	  System.out.println(stus[i][1]);
    	  i++;
      }
      }
    }
	return stus;
}

@Override
public boolean del(long id) throws Exception {
	boolean isSuc=false;
    Class.forName(driver);
    String sql = "delete from stuinfo where id=?";
    try (Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pstmt = con.prepareStatement(sql);) {
      pstmt.setLong(1,id);
      int row=pstmt.executeUpdate();
      isSuc=row>0;
    }
    return isSuc;
}



}
