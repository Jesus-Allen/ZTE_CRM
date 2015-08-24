package com.qdgs.dao;

import java.util.List;

import com.qdgs.bean.UserInfo;



public interface UserInfoDao {
	UserInfo get(Integer id);
	Integer save(UserInfo userInfo);
    void delete(Integer id);
    
    void delete(UserInfo userInfo);
    void update(UserInfo userInfo);
    List<UserInfo> getPassByUserNameAndUserPwd(UserInfo userInfo);
    List<UserInfo> getPassByUserNameAndUserPwdAndId(int id,String userName,String userPwd);
    UserInfo getUserByUserName(String name);
    UserInfo getUserByEmail(String email);
    UserInfo getUserByTel(String tel);
    UserInfo getUserByUserId(int userId);

    UserInfo getMaxUserId();
    int getSize();
    List findByPage(final String hql, 
    		final int offset, final int pageSize);
}
