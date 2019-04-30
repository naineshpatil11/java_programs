package com.web;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main(String[] args) 
	{
		Alien al = new Alien();
		al.setAid(104);
		al.setAname("Nainesh");
		al.setColor("Blue");
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		org.hibernate.Transaction ts = session.beginTransaction();
		session.save(al);
		ts.commit();
		
	}
}
