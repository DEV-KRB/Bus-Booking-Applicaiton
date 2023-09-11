package com.leafco.bookbus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.leafco.bookbus.entity.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Autowired
	SessionFactory sessionFactory; 
	
	@Override
	public List<Admin> showAdmins() {
		
		//start session
		Session session = sessionFactory.getCurrentSession();
		
		//run the query
		Query <Admin> theQuery = session.createQuery("from Admin", Admin.class);
		
		//execute query
		List<Admin> admins = theQuery.getResultList();
		
		return admins;
	}

	@Override
	public void saveAdmin(Admin theAdmin) {
		
		//current session
		Session session = sessionFactory.getCurrentSession();
		
		//query
		session.saveOrUpdate(theAdmin);
	}

	@Override
	public Admin getAdmin(int theId) {
		
		//current session
		Session session = sessionFactory.getCurrentSession();
		
		Admin theAdmin = session.get(Admin.class, theId);
		
		return theAdmin;
	}

}
