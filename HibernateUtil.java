/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import softcons.lab7.model.Hull;


public class HibernateUtil {
private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;
    
public static void createSessionFactory() {
    sessionFactory=new Configuration().configure().buildSessionFactory();
		//creating session object  
		Session session=sessionFactory.openSession(); 
//Configuration configuration = new Configuration();
//configuration.configure().addAnnotatedClass(softcons.lab7.model.Hull.class);
//        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//        sessionFactory = configuration.buildSessionFactory(serviceRegistry);

}

public static SessionFactory getSessionFactory(){
	return sessionFactory;
}

}

