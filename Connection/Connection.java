package br.com.Connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Connection {
	
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");
	
	
	public EntityManager getConnection() {
	return emf.createEntityManager();
	}
	
}
