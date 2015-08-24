package com.qdgs.controllergqy;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import net.sf.json.JSONObject;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.service.UserInfoService;

public class CheckUserNameAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	private HttpServletResponse response;
	private HttpServletRequest request;
	private UserInfoService userInfoService;
    private UserInfoDao userInfoDao;
	

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response=response;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	public void doAction() throws Exception{
		JSONObject json = new JSONObject();
	    PrintWriter out=response.getWriter();
	    response.setContentType("application/json");
		String userName=request.getParameter("userName");
		if(userInfoService.isExist(userName)==true){
			json.put("valid",true);

		}
		else{
			json.put("valid",false);
		}
		  out.print(json);
		}
	public void doActionNoSelf() throws Exception{
		JSONObject json = new JSONObject();
		 ActionContext ctx = ActionContext.getContext();
	    PrintWriter out=response.getWriter();
	    response.setContentType("application/json");
		String userName=request.getParameter("userName");
		String userNameb=(String)ctx.getSession().get("a");
		System.out.print("userName:"+userName+"userNameb:"+userNameb);
		if(userInfoService.isExist(userName)==true || userName.equals(userNameb)) {
			
			json.put("valid",true);

		}
		else{
			json.put("valid",false);
		}
		  out.print(json);
		}

	
}
