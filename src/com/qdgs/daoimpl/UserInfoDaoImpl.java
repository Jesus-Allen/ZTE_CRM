package com.qdgs.daoimpl;


import java.util.List;

import org.hibernate.Session;

import com.qdgs.bean.UserInfo;
import com.qdgs.dao.UserInfoDao;
import com.qdgs.global.QdgsHibernateDaoSupport;

public class UserInfoDaoImpl extends QdgsHibernateDaoSupport implements UserInfoDao {

	@Override
	public Integer save(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(userInfo);
	}
	@Override
	public void update(UserInfo userInfo) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(userInfo);
	}

	@Override
	public void delete(UserInfo userInfo) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(userInfo);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(id));
	}
	@Override
	public List<UserInfo> getPassByUserNameAndUserPwd(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return (List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.userName=? and userinfo.userPwd=?",userInfo.getUserName(),userInfo.getUserPwd());
	}
	@Override
	public List<UserInfo> getPassByUserNameAndUserPwdAndId(int id,String userName,String userPwd) {
		// TODO Auto-generated method stub
		
		return (List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.id=? and userinfo.userName=? and userinfo.userPwd=?",id,userName,userPwd);
	}
	@Override
	public UserInfo getMaxUserId() {
		// TODO Auto-generated method stub select max(id) from
	   List<UserInfo>  ui=(List<UserInfo>)getHibernateTemplate().find("from UserInfo where userId=(select max(userId) from UserInfo)");
	   if(ui!=null && ui.size()>=1){
		   return ui.get(0);
	   }
	   return null;
	}
	@Override
	public UserInfo getUserByUserName(String name) {
		// TODO Auto-generated method stub
		System.out.print("1...........................................................");
		List<UserInfo> list=(List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.userName=? ",name);
		//System.out.println("list是"+list);
		System.out.print("2...........................................................");
	//	System.out.println("list.get(0):"+list.get(0).getUserName());
		if(list!=null && list.size()>=1){
			System.out.println("list.get(0):"+list.get(0).getUserName());
			return list.get(0);	
			
		}
		return null;

	}
	@Override
	public UserInfo getUserByEmail(String email) {
		// TODO Auto-generated method stub
		List<UserInfo> list=(List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.userEmail=? ",email);
		//System.out.println("list是"+list);
		if(list!=null && list.size()>=1){
			return list.get(0);
		}
		return null;
	}
	@Override
	public UserInfo getUserByTel(String tel) {
		// TODO Auto-generated method stub
		List<UserInfo> list=(List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.userTel=? ",tel);
		//System.out.println("list是"+list);
		if(list!=null && list.size()>=1){
			return list.get(0);
		}
		return null;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		String hql ="select count(*) from UserInfo";
		Number count = (Number)getHibernateTemplate().find(hql).listIterator().next();
	    return count.intValue();
	}
	@Override
	public UserInfo get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(UserInfo.class,id);
	}
	@Override
	public UserInfo getUserByUserId(int userId) {
		// TODO Auto-generated method stub
		List<UserInfo> list=(List<UserInfo>)getHibernateTemplate().find("from UserInfo userinfo where userinfo.userId=? ",userId);
		//System.out.println("list是"+list);
		if(list!=null && list.size()>=1){
			return list.get(0);
		}
		return null;
	}
	

}
