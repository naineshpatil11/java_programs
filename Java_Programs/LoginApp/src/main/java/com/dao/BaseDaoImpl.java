package com.dao;

import com.hibernate.Hibernate;
import com.model.Users;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BaseDaoImpl implements BaseDao {
		public boolean login(String username, String password) {
			Session session = Hibernate.getSession();
			if (session != null) {
				try {
					Users user = (Users) session.get(Users.class, username);
					if (password.equals(user.getPassword())) {
						System.out.println("User: " + user.toString());
						return true;
						}
					} catch (Exception exception) {
						System.out.println("Exception occured while reading user data " + exception.getMessage());
						return false;
					}
				} else {
					System.out.println("***DB Server Down.....***");
				}
				return false;
			}
		/************************************************************/
			public static String regCustomer(Users user) {
				Session session = Hibernate.getSession();
				Transaction transaction = session.beginTransaction();
				String username = (String) session.save(user);
				session.save(user);
				transaction.commit();
				session.close();
				return username;
			}
		/*************************************************************/
			public Users register(Users user) {
				Session session = Hibernate.getSession();
				try
				{
					@SuppressWarnings("unused")
					String username = (String) session.save(user);
					session.beginTransaction().commit();	
				} 
				catch (Exception exception) 
				{
					System.out.println("Exception Occured While reading user data: " + exception.getMessage());
				}
				return user;
				}

		/**********************************************************************/
			public boolean forgot(String username, String password) {
				Session session = Hibernate.getSession();
				if (session != null) {
					try {
						Users user = (Users) session.get(Users.class, username);
						user.setPassword(password);
						String userName = (String) session.save(user);
						session.beginTransaction().commit();	
						
							return true;
						}
					 catch (Exception exception) {
						// TODO: handle exception
						System.out.println("Exception occured while reading user data " + exception.getMessage());
						return false;
					}
				} 
				return false;
			
			}
			
		
	
	
}
