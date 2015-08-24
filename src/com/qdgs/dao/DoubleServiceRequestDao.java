package com.qdgs.dao;

import java.util.List;

import com.qdgs.bean.DoubleServiceRequest;

public interface DoubleServiceRequestDao {
	List<DoubleServiceRequest> getByUid(int uid);
	Integer save(DoubleServiceRequest ds);
}
