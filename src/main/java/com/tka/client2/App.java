package com.tka.client2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setEname("Raj Pawar");
		Employee e2 = new Employee();
		e2.setEname("Swapnil Puri");
		Employee e3 = new Employee();
		e3.setEname("Ankita Bhagwat");

		List<Employee> all = new ArrayList<Employee>();
		all.add(e1);
		all.add(e2);
		all.add(e3);
		Department d1 = new Department();
		d1.setDept_name("IT DEV");
		d1.setAllemp(all);
		session.save(d1);
		txn.commit();
		System.out.println("All Data Saved Sucessfully......!");
		session.close();
	}

}
