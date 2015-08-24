package com.qdgs.dao;

import java.util.List;

import com.qdgs.bean.Question;


public interface QuestionDao {
	Integer save(Question question);
	Question get(Integer id);
    void delete(Integer id);
    void delete(Question question);
    void update(Question question);
    List<Question> findAll();
    int getSize();
    List findByPage(final String hql, 
    		final int offset, final int pageSize);
}
