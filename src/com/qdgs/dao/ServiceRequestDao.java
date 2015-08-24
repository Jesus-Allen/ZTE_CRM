package com.qdgs.dao;

import java.util.List;

import com.qdgs.bean.ServiceRequest;


public interface ServiceRequestDao {
	List<ServiceRequest> getByUid(int uid);
	Integer save(ServiceRequest ds);
}
