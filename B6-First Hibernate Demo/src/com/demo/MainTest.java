package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction ts = session.beginTransaction();

		User user1 = new User();
		user1.setName("Rohan");
		user1.setCity("Mumbai");
		user1.setSalary(40000);

		session.save(user1); // insert query

		ts.commit();

		System.out.println("Record inserted successfully..");

	}

}
