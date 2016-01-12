package com.example.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.User;

public class UserDao {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> getUserList() {
		return this.sessionFactory.getCurrentSession()
				.createSQLQuery("select * from user").addEntity(User.class).list();
	}
}
