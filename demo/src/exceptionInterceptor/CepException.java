package exceptionInterceptor;

import java.io.IOException;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class CepException extends ActionSupport{


	@Override
	public String execute() throws Exception {
		if(Math.random()>0.5)
			throw new SQLException();
			else
				throw new IOException();
	}
	
}
