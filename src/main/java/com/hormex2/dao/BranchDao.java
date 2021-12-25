package com.hormex2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hormex2.entities.Branch;
import com.hormex2.helper.SessionFactoryRegistry;

public class BranchDao {

	public Branch getBranch(int branchNo) {
		//Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Branch branch = null;
		 
		//configuration = new Configuration().configure(); obj created multiple time
		//sessionFactory = configuration.buildSessionFactory();
		
		//only one time obj and conection pooling 
		sessionFactory = new SessionFactoryRegistry().getSesstionFactory();

		session = sessionFactory.openSession();
		
		branch = session.get(Branch.class, branchNo);
		
		return branch;
		
	}
}
