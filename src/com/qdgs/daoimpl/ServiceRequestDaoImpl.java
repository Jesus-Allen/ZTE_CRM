package com.qdgs.daoimpl;

import java.util.List;

import com.qdgs.bean.DoubleServiceRequest;
import com.qdgs.bean.ServiceRequest;
import com.qdgs.dao.ServiceRequestDao;
import com.qdgs.global.QdgsHibernateDaoSupport;

public class ServiceRequestDaoImpl extends QdgsHibernateDaoSupport implements ServiceRequestDao{

	@Override
	public List<ServiceRequest> getByUid(int uid) {
		// TODO Auto-generated method stub
		List<ServiceRequest> list=(List<ServiceRequest>)getHibernateTemplate().find("from ServiceRequest a where a.uid=? ",uid);
		//System.out.println("listÊÇ"+list);
		if(list!=null && list.size()>=1){
			return list;
		}
		return null;
	}

	@Override
	public Integer save(ServiceRequest ds) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(ds);
	}

}
