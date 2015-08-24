package com.qdgs.service;

import java.util.List;

import com.qdgs.bean.Question;

public interface QuestionService {
	int getSize();
    List findByPage(final String hql, 
    		final int offset, final int pageSize);
    Question findById(int id);
}
