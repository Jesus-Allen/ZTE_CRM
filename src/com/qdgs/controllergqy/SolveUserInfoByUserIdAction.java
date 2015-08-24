package com.qdgs.controllergqy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.service.UserInfoService;

public class SolveUserInfoByUserIdAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware{
	private HttpServletResponse response;
	private InputStream inputStream;
	private HttpServletRequest request;
	private UserInfoService userInfoService;
	private UserInfoDao userInfoDao;
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
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
	public InputStream getResult(){
		return inputStream;
	}
	public String delete() throws Exception{
		String id=request.getParameter("userId");
		userInfoDao.delete(Integer.parseInt(id));
		inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		return "success";
		
	}
}
