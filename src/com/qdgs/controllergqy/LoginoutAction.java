package com.qdgs.controllergqy;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginoutAction extends ActionSupport{
	public String execute()
			throws Exception
		{
		//����ActionContextʵ��
		//ActionContext ctx = ActionContext.getContext();
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.removeAttribute("users");
		return "success";
		}
}
