package com.hormex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hormex2.entities.Address;
import com.hormex2.helper.SessionFactoryRegistry;

public class AddressDao {
	public Address getAdres(int addressNo) {
		//Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Address address = null;
		
		sessionFactory = new SessionFactoryRegistry().getSesstionFactory();
		//configuration =new Configuration().configure();
		//sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		
		address = session.get(Address.class, addressNo);
		
		return address;
	}

}
