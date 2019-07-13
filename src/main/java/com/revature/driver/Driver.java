package com.revature.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.util.SessionFactoryUtil;

public class Driver {
	
	private static SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	public static void main(String[] args) {
		Session sess = sf.openSession();
		sess.close();
		System.out.println("everything is fine");
		sf.close();
	}

}
