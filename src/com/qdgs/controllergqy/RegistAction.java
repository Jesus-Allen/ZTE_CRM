package com.qdgs.controllergqy;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.service.UserInfoService;

public class RegistAction extends ActionSupport{
	//spring自动装填策略,userInfoService对应bean中id
	private UserInfoDao userInfoDao;
    private UserInfoService userInfoService;
	//private UserInfo userInfo;
	private HttpServletRequest request = ServletActionContext.getRequest();
	
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public UserInfoService getUserInfoService() {
		return userInfoService;
	}
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
//	public UserInfo getUserInfo() {
//		return userInfo;
//	}
//	public void setUserInfo(UserInfo userInfo) {
//		this.userInfo = userInfo;
//	}
	
	
	//处理用户请求
			public String execute()
				throws Exception
				
			{   
				UserInfo  userInfo=new UserInfo();
			    String id=request.getParameter("userId");
				String userName=request.getParameter("userName");
				String userPwd=request.getParameter("userPwd");
				String name=request.getParameter("name");
				String userSex=request.getParameter("sex");
				String userLinkMan=request.getParameter("userLinkMan");
				String userEmail=request.getParameter("userEmail");
				String userTel=request.getParameter("userTel");
				String userUnit=request.getParameter("userUnit");
				String userUrl=request.getParameter("userUrl");
				String userCountry=request.getParameter("userCountry");
				String userProvince=request.getParameter("userProvince");
				String userCity=request.getParameter("userCity");
				String userPost=request.getParameter("userPost");
				String userAddress=request.getParameter("userAddress");
				String userProduct=request.getParameter("userProduct");
				String userProductType=request.getParameter("userProductType");
				String userProductId=request.getParameter("userProductId");
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
				userInfo.setUserCountry(userCountry);
				userInfo.setUserProvince(userProvince);
				userInfo.setUserCity(userCity);
				userInfo.setUserPost(userPost);
				userInfo.setUserAddress(userAddress);
				userInfo.setUserProduct(userProduct);
				userInfo.setUserProductId(userProductId);
				userInfo.setUserProductType(userProductType);
				userInfo.setHead(head);
				userInfo.setRegTime(time);
				userInfo.setState("yes");
			
				if(userInfoService.regist(userInfo)==true){
					System.out.println("1");
					return "success";
				}
				System.out.println("2");
				return "error";
			}
			//space更新用户信息
			public String update() throws Exception{
				 //创建ActionContext实例
				ActionContext ctx = ActionContext.getContext();
				UserInfo  userInfo=(UserInfo)ctx.getSession().get("users");
				String head=request.getParameter("head");
				String name=request.getParameter("name");
				String userSex=request.getParameter("sex");
				String userUnit=request.getParameter("userUnit");
				String userUrl=request.getParameter("userUrl");
				String userCity=request.getParameter("userCity");
				String userPost=request.getParameter("userPost");
				String userAddress=request.getParameter("userAddress");
				userInfo.setHead(head);
				userInfo.setUserName(name);
				userInfo.setUserSex(userSex);
				userInfo.setUserCity(userCity);
				userInfo.setUserPost(userPost);
				userInfo.setUserUnit(userUnit);
				userInfo.setUserUrl(userUrl);
				userInfo.setUserAddress(userAddress);
				userInfoDao.update(userInfo);
				ctx.getSession().put("users", userInfo);
				return "success";
				
				
			}
}
