package com.qdgs.action.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qdgs.bean.UserInfo;

public class AdminInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		Map session = invocation.getInvocationContext().getSession();
		UserInfo userInfo=(UserInfo)session.get("admin");
		
		if(userInfo!=null){
			return invocation.invoke();
		}
		else{
			return "adminlogin";
		}

}
}
