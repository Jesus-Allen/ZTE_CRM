package com.qdgs.controllergqy;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.service.UserInfoService;

public class CheckUserEmailAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
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
		String userEmail=request.getParameter("userEmail");
		if(userInfoService.isExistEmail(userEmail)==true){
			json.put("valid",true);

		}
		else{
			json.put("valid",false);
		}
		  out.print(json);
		}
	public void doActionNoSelf() throws Exception{
		JSONObject json = new JSONObject();
	    PrintWriter out=response.getWriter();
	    response.setContentType("application/json");
		String userEmail=request.getParameter("userEmail");
		if(userInfoService.isExistEmailNoSelf(userEmail)==true){
			json.put("valid",true);

		}
		else{
			json.put("valid",false);
		}
		  out.print(json);
	}
}
