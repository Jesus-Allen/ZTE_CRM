package com.qdgs.controllergqy.admin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.global.FenYeService;
import com.qdgs.service.UserInfoService;

public class UserInfoAction extends ActionSupport  implements ServletResponseAware,ServletRequestAware {
	private HttpServletResponse response;
	private HttpServletRequest request;
	private UserInfoService userInfoService;
	private UserInfoDao userInfoDao;
	private UserInfo userInfo;
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
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	public String show()
			throws Exception{
		int totalRecord=userInfoService.getSize();
		int lastCurrentPage=0;//最后一页也码数
		int pageNo=5;
		int index=0;//第一条记录索引
		int firstPage=0;
		int pageSize=10;//每页显示数量
		int currentPage=1;
		String requestCurrentPage=request.getParameter("currentPage");
		String html="admin_user_index.html";
		ArrayList pageList=(ArrayList) FenYeService.pageList(totalRecord, lastCurrentPage, pageNo, index, firstPage, pageSize, currentPage, html, requestCurrentPage).get("pageList");
		index=(int) FenYeService.pageList(totalRecord, lastCurrentPage, pageNo, index, firstPage, pageSize, currentPage, html, requestCurrentPage).get("index");
		request.setAttribute("userInfo",  userInfoService.findByPage("from UserInfo", index, pageSize));
		request.setAttribute("pageList", pageList);
		return "success";
    }
	public String edit()
			throws Exception{
		      ActionContext ctx = ActionContext.getContext();
		       String userId=request.getParameter("userId");
		       UserInfo userInfo=userInfoDao.getUserByUserId(Integer.parseInt(userId));
		       request.setAttribute("userInfo", userInfo);
		        ctx.getSession().put("a", userInfo);//此userInfo用于更新去重
			   return "success";
    }
	public String add()
			throws Exception{
		        return "success";
    }
	public String addaction(){
	UserInfo  userInfo=new UserInfo();
    String id=request.getParameter("id");
    System.out.println("id"+id);
	String userName=request.getParameter("userName");
	String userPwd=request.getParameter("userPwd");
	String name=request.getParameter("name");
	String userSex=request.getParameter("sex");
	String userLinkMan=request.getParameter("userLinkMan");
	String userEmail=request.getParameter("userEmail");
	String userTel=request.getParameter("userTel");
	String userUnit=request.getParameter("userUnit");
	String userUrl=request.getParameter("userUrl");
	String state=request.getParameter("state");
    String head="1.gif";
    String time=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
	userInfo.setId(Integer.parseInt(id));
	userInfo.setUserName(userName);
	userInfo.setUserPwd(userPwd);
	userInfo.setName(name);
	userInfo.setUserSex(userSex);
	userInfo.setUserLinkMan(userLinkMan);
	userInfo.setUserEmail(userEmail);
	userInfo.setUserTel(userTel);
	userInfo.setUserUnit(userUnit);
	userInfo.setUserUrl(userUrl);
	userInfo.setHead(head);
	userInfo.setRegTime(time);
	userInfo.setState(state);

	if(userInfoService.regist(userInfo)==true){
	
		return "success";
	}

	return "error";    }

}
