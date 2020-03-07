package com.uid.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	
private static SessionFactory sessionfactory;
	
	static {
		Configuration configure = new Configuration().configure();
		sessionfactory = configure.buildSessionFactory();
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	
	public static void closeSessionfactory()
	{
		if(sessionfactory!=null)
		{
			sessionfactory.close();
		}
	}

}
