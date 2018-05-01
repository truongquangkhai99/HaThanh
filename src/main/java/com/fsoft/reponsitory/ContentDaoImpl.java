package com.fsoft.reponsitory;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fsoft.entities.Content;

@Repository
public class ContentDaoImpl implements ContentDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> getListContent(int pageNumber, int pageSize) {
		Session session = sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery("{call Pagination_Content(:pageNumber,:pageSize) }");
		query.addEntity(Content.class);
		query.setParameter("pageNumber", pageNumber);
		query.setParameter("pageSize", pageSize);
		List<Object[]> rows = query.list();
		return rows;
	}

}
