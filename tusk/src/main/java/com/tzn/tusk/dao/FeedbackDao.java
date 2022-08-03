package com.tzn.tusk.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tzn.tusk.entity.Feedback;

@Component
public class FeedbackDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addFeedback(Feedback fb)
	{
		System.out.println("in addFeedback..." + fb);
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(fb);
	}
	
	@Transactional
	public List<Feedback> getFeedbacks()
	{
		Session session = sessionFactory.getCurrentSession();
		Query<Feedback> q = session.createQuery("from Feedback");    //HQL
		List<Feedback> f = (List<Feedback>) q.list();
		
		return f;
	}

}
