package com.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.Dao.*;
import com.model.*;

@Repository
public class UserDaoImpl implements UserDao {
	 
	SessionFactory sessionFac;
	
	public void insertUser(User user)
	{
		Session session=sessionFac.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();
	}
public UserDaoImpl(SessionFactory sessionFactory)
{
	super();
	sessionFac=sessionFactory;
}
}
