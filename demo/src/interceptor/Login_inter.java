package interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import controller.MyAction;

public class Login_inter extends AbstractInterceptor {


	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		
		/*MyAction m = (MyAction) arg0.getAction();
		Map session = arg0.getInvocationContext().getSession();*/
		HttpServletRequest req = ServletActionContext.getRequest();
		String username = req.getParameter("username");
		if(username!=null&&username.trim().endsWith("r")){
			return arg0.invoke();
		}
		else{
			
			return "login";
		}
	}

}
