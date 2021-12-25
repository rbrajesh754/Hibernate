package com.hormex2.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;
	
	static {
		//try {
		Configuration configuration = new Configuration().configure();
		sessionFactory = configuration.buildSessionFactory();
/*		}catch(Throwable e) {
			e.printStackTrace();
			throw e;
		}*/
		
	}
	public static SessionFactory getSesstionFactory() {
		return sessionFactory;
	}
	public static void CloseSessionFactory() {
		if(sessionFactory!=null) {
			sessionFactory.close();
		}
	}

}