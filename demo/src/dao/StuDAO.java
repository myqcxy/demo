package dao;

import java.util.List;

import bean.Stu;

public interface StuDAO {
   boolean check(String username,String pass) throws Exception;
   boolean add(Stu stu)throws Exception;
   String [][] list()throws Exception;
   boolean del(long id)throws Exception;
}
