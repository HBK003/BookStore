package com.sample.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.model.User;
@Repository("sampleDAO")
public class SampleDAOImpl implements SampleDAO {
	@Autowired 
	private SessionFactory sessionFactory;   
	@Override
	public void register(User user ) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
	@Override
	public User login(User user) {
		Session session = sessionFactory.getCurrentSession();
		User user2 = (User) session.get(User.class, user.getEmail());
		if(user2 != null && user2.getPassword() == user.getPassword()) {
			return user2;
		}
		return null;
	}
}
