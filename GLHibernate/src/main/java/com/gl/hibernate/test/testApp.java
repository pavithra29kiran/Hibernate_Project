package com.gl.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class testApp {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/gl/hibernate/resource/hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
	}

}
