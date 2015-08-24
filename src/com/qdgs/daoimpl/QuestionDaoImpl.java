package com.qdgs.daoimpl;

import java.util.List;





import org.hibernate.Query;

import com.qdgs.bean.Question;
import com.qdgs.dao.QuestionDao;
import com.qdgs.global.QdgsHibernateDaoSupport;

public class QuestionDaoImpl extends QdgsHibernateDaoSupport implements QuestionDao{

	@Override
	public Integer save(Question question) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(question);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(id);
	}

	@Override
	public void delete(Question question) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(question);
	}

	@Override
	public void update(Question question) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(question);
	}

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return (List<Question>)getHibernateTemplate()
				.find("from Question");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		String hql ="select count(*) from Question";
		Number count = (Number)getHibernateTemplate().find(hql).listIterator().next();
	    return count.intValue();
		 
		
	}

	@Override
	public Question get(Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate()
				.get(Question.class,id);
	}

}
