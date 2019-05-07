package com.dao;

import com.hibernate.Hibernate;
import com.model.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BaseDaoImpl implements BaseDao {
		
			public static String regCustomer(Users user) {
				//Session session = Hibernate.getSession();
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");;
				SessionFactory sf = cfg.buildSessionFactory();
				Session session = sf.openSession();
				Transaction transaction = session.beginTransaction();
				String username = (String) session.save(user);
				//session.save(user);
				transaction.commit();
				session.close();
				return username;
			}
		/*************************************************************/
			public Users register(Users user) {
				Session session = Hibernate.getSession();
				try
				{
					Transaction tx = session.beginTransaction();
					tx.commit();
				} 
				catch (Exception exception) 
				{
					System.out.println("Exception Occured While reading user data: " + exception.getMessage());
				}
				return user;
				}
		public boolean forgot(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}
		public boolean login(String username, String password) {
			// TODO Auto-generated method stub
			return false;
		}

	
	
}
