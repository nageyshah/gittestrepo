
package com.example.gittest.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			return configuration.buildSessionFactory(
					new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void testFunctionAddedforGIT() {

		Integer addedforGITLP;

		for (int i = 0; i < 5; i++) {
			// added as a function from laptop..
		}

	}
	
	public void testFunctionAddedforGITVB() {

		Double addedforGITVB;

		while(true) {
			
			System.out.println("you forgot to add this code and while was false");
			// added as a function from laptop..
		}

	}

}
