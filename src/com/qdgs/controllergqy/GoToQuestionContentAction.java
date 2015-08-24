package com.qdgs.controllergqy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.service.QuestionService;

public class GoToQuestionContentAction extends ActionSupport implements ServletResponseAware,ServletRequestAware{
	//处理用户请求
		private QuestionService questionServiceImpl;
		private HttpServletResponse response;
		private HttpServletRequest request;
		public QuestionService getQuestionServiceImpl() {
			return questionServiceImpl;
		}
		public void setQuestionServiceImpl(QuestionService questionServiceImpl) {
			this.questionServiceImpl = questionServiceImpl;
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
	    public String execute()
			throws Exception{
	    	String id=request.getParameter("qid");
	    	int qid=Integer.parseInt(id);
	         request.setAttribute("question",questionServiceImpl.findById(qid) );
		    return "success";
	    }
			
}
