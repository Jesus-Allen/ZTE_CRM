package com.qdgs.controllergqy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.DoubleServiceRequest;
import com.qdgs.bean.ServiceRequest;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.ServiceRequestDao;


public class ServiceRequestAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware{
	private HttpServletResponse response;
	private HttpServletRequest request;
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
	public InputStream getResult(){
		return inputStream;
	}
	public ServiceRequestDao getServiceRequestDao() {
		return serviceRequestDao;
	}
	public void setServiceRequestDao(ServiceRequestDao serviceRequestDao) {
		this.serviceRequestDao = serviceRequestDao;
	}
	
	public String apply()
			throws Exception{
		ServiceRequest serviceRequest=new ServiceRequest();
		String solve="no";
		String kind=request.getParameter("kindb");
		ActionContext ctx = ActionContext.getContext();
		UserInfo userInfo=(UserInfo) ctx.getSession().get("users");
		int uid=userInfo.getUserId();
		serviceRequest.setKind(kind);
		serviceRequest.setSolve(solve);
		serviceRequest.setUid(uid);
		
		if(serviceRequestDao.save(serviceRequest)>0){
			inputStream=new ByteArrayInputStream("1".getBytes("UTF-8"));
		}else{
			inputStream=new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		return "success";
	}
}
