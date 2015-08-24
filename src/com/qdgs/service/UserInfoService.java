package com.qdgs.service;

import java.util.ArrayList;
import java.util.List;

import com.qdgs.bean.UserInfo;

public interface UserInfoService {
boolean regist(UserInfo userInfo);
boolean isValidLogin(UserInfo userInfo);
boolean isValidAdminLogin(String userName,String userPwd);
UserInfo getMaxUserId();
UserInfo getUserByName(UserInfo userInfo);
boolean isExist(String username);
boolean isExistNoSelf(String username);
boolean isExistEmail(String useremail);
boolean isExistEmailNoSelf(String useremail);
boolean isExistTelNoSelf(String usertel);
boolean isExistTel(String usertel);
boolean isGetUserByUserName(String userName);
int getSize();
List findByPage(final String hql, 
		final int offset, final int pageSize);
String getRand();
void sendEmail(String rand,String email);


}
