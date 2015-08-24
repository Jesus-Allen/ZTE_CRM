package com.qdgs.serviceimpl;

import java.util.List;

import com.qdgs.bean.Question;
import com.qdgs.dao.QuestionDao;
import com.qdgs.service.QuestionService;

public class QuestionServiceImpl implements QuestionService{
private QuestionDao questionDao;


public QuestionDao getQuestionDao() {
	return questionDao;
}

public void setQuestionDao(QuestionDao questionDao) {
	this.questionDao = questionDao;
}

@Override
public int getSize() {
	// TODO Auto-generated method stub
	int size=questionDao.getSize();
	return size;
}

@Override
public List findByPage(String hql, int offset, int pageSize) {
	// TODO Auto-generated method stub
	List list=questionDao.findByPage(hql, offset, pageSize);
	return list;
}

@Override
public Question findById(int id) {
	// TODO Auto-generated method stub
	return questionDao.get(id);
}

}
