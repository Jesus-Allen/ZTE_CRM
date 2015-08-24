package com.qdgs.dao;

import java.util.List;

import com.qdgs.bean.Doc;

public interface DocDao {
	Integer save(Doc doc);
	int getSize();
	List findByPage(final String hql, 
    		final int offset, final int pageSize);
	void delete(Doc doc);
	void delete(String docId);
	Doc get(String docId);
	List<Doc> findAll();
	void update(Doc doc);
}
