package com.qdgs.serviceimpl;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.global.SendMail;
import com.qdgs.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService{
    private UserInfoDao userInfoDao;
  
	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public boolean isGetUserByUserName(String userName) {
		// TODO Auto-generated method stub
		if(userInfoDao.getUserByUserName(userName)==null){
			return false;
		}
		return true;
	}
	@Override
	public boolean regist(UserInfo userInfo) {
		// TODO Auto-generated method stub
		//调用dao组件方法实现业务逻辑
		int result=userInfoDao.save(userInfo);
		System.out.println("result:"+result);
		if(result>0)
			return true;
		return false;
	}

	@Override
	public UserInfo getMaxUserId() {
		// TODO Auto-generated method stub
		return userInfoDao.getMaxUserId();
	}
	@Override
	public UserInfo getUserByName(UserInfo userInfo) {
		// TODO Auto-generated method stub
		UserInfo userinfo=userInfoDao.getUserByUserName(userInfo.getUserName());
		if(userinfo!=null){
			return userinfo;
		}
		return null;
	}
	@Override
	public boolean isExist(String username) {
		// TODO Auto-generated method stub
		//true代表不存在
		if(userInfoDao.getUserByUserName(username)==null){
			return true;
		}
	    //false代表存在
		return false;
	}
	@Override
	public boolean isExistEmail(String useremail) {
		// TODO Auto-generated method stub
		if(userInfoDao.getUserByEmail(useremail)==null)
			return true;
		return false;
	}
	@Override
	public boolean isExistTel(String usertel) {
		// TODO Auto-generated method stub
		if(userInfoDao.getUserByTel(usertel)==null)
			return true;
		return false;
	}
	@Override
	public boolean isExistNoSelf(String username) {
		// TODO Auto-generated method stub
		

		if(userInfoDao.getUserByUserName(username)==null){
			return true;
		}
	    //false代表存在
		return false;
	}
	@Override
	public boolean isExistEmailNoSelf(String useremail) {
		// TODO Auto-generated method stub
		if(userInfoDao.getUserByEmail(useremail)==null )
			return true;
		return false;
	}
	@Override
	public boolean isExistTelNoSelf(String usertel) {
		// TODO Auto-generated method stub
		if(userInfoDao.getUserByTel(usertel)==null )
			return true;
		return false;
	}
	@Override
	public boolean isValidLogin(UserInfo userInfo) {
		// TODO Auto-generated method stub
		//创建ActionContext实例
		
		boolean isCorrectLogin=false;
		if(userInfoDao.getPassByUserNameAndUserPwd(userInfo).size()>=1 && userInfoDao.getPassByUserNameAndUserPwd(userInfo).get(0).getState().equals("yes")){
			isCorrectLogin=true;
			
			
		}
		return isCorrectLogin;
	}
	
	@Override
	public boolean isValidAdminLogin(String userName,String userPwd) {
		// TODO Auto-generated method stub
		boolean isCorrectLogin=false;
	
		
		 
		 
		if(userInfoDao.getUserByUserName(userName)==null){
			return isCorrectLogin;
		}else{
			Integer id=userInfoDao.getUserByUserName(userName).getId();
		    if(userInfoDao.getPassByUserNameAndUserPwdAndId(8,userName,userPwd).size()>=1 && userInfoDao.getPassByUserNameAndUserPwdAndId(8,userName,userPwd).get(0).getState().equals("yes")){
		    	isCorrectLogin=true;
		    }
		    return isCorrectLogin;
		}
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size=userInfoDao.getSize();
		return size;
	}
	@Override
	public List findByPage(String hql, int offset, int pageSize) {
		// TODO Auto-generated method stub
		List list=userInfoDao.findByPage(hql, offset, pageSize);
		return list;
	}
	@Override
	public String getRand() {
		// TODO Auto-generated method stub
		 Random random=new Random();
         StringBuffer sbRan=new StringBuffer();
		    for(int i=0;i<4;i++){
		    	String ranNum=String.valueOf(random.nextInt(10));
		    	sbRan.append(ranNum);}
		    return sbRan.toString();
	}
	@Override
	public void sendEmail(String rand,String email) {
		// TODO Auto-generated method stub
	     SendMail sendMailService=new  SendMail();
		 String attachfile1=null;
		 String subject="您在中兴技术支持修改密码 的 验证码";
   	     String bodyashtml= rand;
   	     String host="smtp.163.com";
      	 String user="18251901682";
      	 String password="aibeihoudeshang";
      	 String from="18251901682@163.com";
		sendMailService.setHost(host);
		sendMailService.setUser(user);
		sendMailService.setPass(password);
		sendMailService.setSubject(subject);
		sendMailService.setTo(email);
		sendMailService.setFrom(from);
		sendMailService.setBodyAsHTML(bodyashtml);
		sendMailService.addAttachFromFile(attachfile1, "a");
		try {
			sendMailService.send();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	


}
