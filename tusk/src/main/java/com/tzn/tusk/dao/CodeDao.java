package com.tzn.tusk.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzn.tusk.entity.Code;

@Component
public class CodeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Code getCode(String name)
	{
		Session session = sessionFactory.getCurrentSession();
		
		Query<Code> q = session.createQuery("from Code where cname = '" + name + "'");
		Code c = q.uniqueResult();
		
		return c;
	}
}
