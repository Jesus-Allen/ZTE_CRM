package com.qdgs.controllergqy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.global.IpTest;
import com.qdgs.service.UserInfoService;

public class UserInfoAction extends ActionSupport  implements SessionAware,ServletResponseAware,ServletRequestAware{
    private Map session;
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
	public void setSession(Map session) {
		// TODO Auto-generated method stub
		this.session=session;
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
	public String findpass() throws Exception{
		String code=request.getParameter("code");
		String passWord=request.getParameter("passWord");
		String userName=request.getParameter("userName");
		String rand=(String) session.get("rand");
		//System.out.print("rand:"+rand+",code:"+code);
		if(rand.equals(code)){
			if(userInfoService.isExist(userName)==true){
				inputStream=new ByteArrayInputStream("用户名不存在".getBytes("UTF-8"));
			}
			else{
				if(userInfoService.isGetUserByUserName(userName)==false){
					inputStream=new ByteArrayInputStream("该用户名对应邮箱不存在，请重新注册".getBytes("UTF-8"));
				}else{
					UserInfo user=userInfoDao.getUserByUserName(userName);
					user.setUserPwd(passWord);
					
					userInfoDao.update(user);
					inputStream=new ByteArrayInputStream("密码修改成功".getBytes("UTF-8"));
				}
			}
		}else{
			inputStream=new ByteArrayInputStream("验证码错误".getBytes("UTF-8"));
		}
		return "success";
		
	}

	public String sendemail() throws Exception{
		String userName=request.getParameter("userName");
		//System.out.println("rand:"+userInfoService.getRand()+",email"+userInfoDao.getUserByUserName(userName).getUserEmail());
		
		String rand=userInfoService.getRand();
		
		if(userInfoService.isExist(userName)==true){
			inputStream=new ByteArrayInputStream("用户名不存在".getBytes("UTF-8"));
		}else{
			if(userInfoService.isGetUserByUserName(userName)==false){
				inputStream=new ByteArrayInputStream("该用户名对应邮箱不存在，请重新注册".getBytes("UTF-8"));
			}else{
				if(IpTest.isConnected()==false){
					 inputStream=new ByteArrayInputStream("网络未连接，请仔细检查".getBytes("UTF-8"));
				}else{

				    userInfoService.sendEmail(rand, userInfoDao.getUserByUserName(userName).getUserEmail());
				    session.put("rand", rand);
				    inputStream=new ByteArrayInputStream("请登邮箱查收，若未收到邮件请重新发送".getBytes("UTF-8"));
				}
				
			    }
			
		}
	
		return "success";
	}
	
}
