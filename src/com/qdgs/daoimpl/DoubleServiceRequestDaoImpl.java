package com.qdgs.daoimpl;

import java.util.List;

import com.qdgs.bean.DoubleServiceRequest;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.DoubleServiceRequestDao;
import com.qdgs.global.QdgsHibernateDaoSupport;

public class DoubleServiceRequestDaoImpl extends QdgsHibernateDaoSupport implements DoubleServiceRequestDao{

	@Override
	public List<DoubleServiceRequest> getByUid(int uid) {
		// TODO Auto-generated method stub
		List<DoubleServiceRequest> list=(List<DoubleServiceRequest>)getHibernateTemplate().find("from DoubleServiceRequest a where a.uid=? ",uid);
		//System.out.println("listÊÇ"+list);
		if(list!=null && list.size()>=1){
			return list;
		}
		return null;
	}

	@Override
	public Integer save(DoubleServiceRequest ds) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(ds);
	}
   
}
