package bean;

public class MyUsers {
	public User[] getUsers(){
		User u1 = new User();
		u1.setUsername("zhangsan");
		u1.setPass("123");
		User u2 = new User();
		u2.setPass("1234");
		u2.setUsername("lisi");
		User[] users = new User[2];
		users[0] = u1;
		users[1] = u2;
		return users;
	}
}
