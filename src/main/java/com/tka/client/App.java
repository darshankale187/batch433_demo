package com.tka.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Passport.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		Passport p1 = new Passport();
		p1.setPassport_no("IND1234Raj");

		Person perobj = new Person();
		perobj.setPname("Raj Pawar");
		perobj.setPassport(p1);

		session.save(perobj);
		txn.commit();
		System.out.println("Person and Passport added sucessfully in DB");
		session.close();
	}

}
