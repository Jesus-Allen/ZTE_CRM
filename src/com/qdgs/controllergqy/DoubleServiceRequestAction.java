package com.qdgs.controllergqy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.DoubleServiceRequest;
import com.qdgs.bean.ServiceRequest;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.DoubleServiceRequestDao;
import com.qdgs.dao.ServiceRequestDao;

public class DoubleServiceRequestAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware{
	private HttpServletResponse response;
	private HttpServletRequest request;
	private DoubleServiceRequestDao doubleServiceRequestDao;
	private ServiceRequestDao serviceRequestDao;
	private InputStream inputStream;
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
	public DoubleServiceRequestDao getDoubleServiceRequestDao() {
		return doubleServiceRequestDao;
	}
	public void setDoubleServiceRequestDao(
			DoubleServiceRequestDao doubleServiceRequestDao) {
		this.doubleServiceRequestDao = doubleServiceRequestDao;
	}
	public ServiceRequestDao getServiceRequestDao() {
		return serviceRequestDao;
	}
	public void setServiceRequestDao(ServiceRequestDao serviceRequestDao) {
		this.serviceRequestDao = serviceRequestDao;
	}
	
	public InputStream getResult(){
		return inputStream;
	}
	public String show()
			throws Exception{
		ActionContext ctx = ActionContext.getContext();
		UserInfo userInfo=(UserInfo) ctx.getSession().get("users");
		int uid=userInfo.getUserId();
		List<ServiceRequest> serviceRequestList=serviceRequestDao.getByUid(uid);
		List<DoubleServiceRequest> doubleServiceRequestList=doubleServiceRequestDao.getByUid(uid);
		request.setAttribute("doubleServiceRequestList", doubleServiceRequestList);
		request.setAttribute("serviceRequestList", serviceRequestList);
		return "success";
	}
	public String apply()
			throws Exception{
		DoubleServiceRequest doubleServiceRequest=new DoubleServiceRequest();
		String solve="no";
		String kind=request.getParameter("kind");
		ActionContext ctx = ActionContext.getContext();
		UserInfo userInfo=(UserInfo) ctx.getSession().get("users");
		int uid=userInfo.getUserId();
		doubleServiceRequest.setKind(kind);
		doubleServiceRequest.setSolve(solve);
		doubleServiceRequest.setUid(uid);
		
		if(doubleServiceRequestDao.save(doubleServiceRequest)>0){
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		return "success";
	}
}
