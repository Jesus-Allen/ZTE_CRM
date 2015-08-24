package com.qdgs.controllergqy;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class lanAction extends ActionSupport {
	//public String lan(){
	public String execute(){
		//ActionContext actionContext = ActionContext.getContext();
		//Map<String, Object> session = actionContext.getSession();
		//HttpServletRequest request = ServletActionContext.getRequest();
		
		//session.put("request_locale",request.getAttribute("request_locale"));
		return SUCCESS;
	}
}
