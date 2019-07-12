package com.revature.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SessionFactoryUtil {
	
	private static SessionFactory sf;
	
	static {
		Configuration configuration = new Configuration().configure();
		//TODO need to update the environment through jenkins
		configuration.setProperty("hibernate.connection.username", System.getenv(""));
		configuration.setProperty("hibernate.connection.password", System.getenv(""));
		// need to update the ending 
		configuration.setProperty("hibernate.connection.url", 
				"jdbc:postgresql://" + System.getenv("") + ":5432/nick_1905java?");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		sf = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}


}
