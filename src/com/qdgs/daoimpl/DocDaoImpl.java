package com.qdgs.daoimpl;

import java.util.List;

import com.qdgs.bean.Doc;
import com.qdgs.bean.LoginTest;
import com.qdgs.bean.UserInfo;
import com.qdgs.dao.DocDao;
import com.qdgs.global.QdgsHibernateDaoSupport;

public class DocDaoImpl extends QdgsHibernateDaoSupport implements DocDao {

	@Override
	public Integer save(Doc doc) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate().save(doc);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		String hql ="select count(*) from Doc";
		Number count = (Number)getHibernateTemplate().find(hql).listIterator().next();
	    return count.intValue();
	}

	@Override
	public void delete(Doc doc) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(doc);
	}

	@Override
	public void delete(String docId) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(get(docId));
	}

	@Override
	public Doc get(String docId) {
		// TODO Auto-generated method stub
		List<Doc> list=(List<Doc>)getHibernateTemplate().find("from Doc doc where doc.docId=? ",docId);
		//System.out.println("listÊÇ"+list);
		if(list!=null && list.size()>=1){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void update(Doc doc) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(doc);
	}

	@Override
	public List<Doc> findAll() {
		// TODO Auto-generated method stub
		return (List<Doc>)getHibernateTemplate()
				.find("from Doc");
		
	}

}
