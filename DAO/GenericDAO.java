package br.com.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.Connection.Connection;
import br.com.model.TiposC;

public class GenericDAO {
	
	public TiposC save(TiposC tipos) {
		
		EntityManager em = new Connection().getConnection();
		
		try {
			
			em.getTransaction().begin();
			em.persist(tipos);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
		return tipos;
	}
	
	public TiposC update(TiposC categoria) {
		
		EntityManager em = new Connection().getConnection();
		
		try {
			
			em.getTransaction().begin();
			
			if(categoria.getId() == null) {
				
				em.persist(categoria);
				
			}else {
				
				em.merge(categoria);
				
			}
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
		return categoria;
	}
	
	public TiposC findByid(Integer id) {
		
		EntityManager em = new Connection().getConnection();
		TiposC categoria = null;
		
		try {
			
			categoria = em.find(TiposC.class, id);
			
		} catch (Exception e) {
			
			System.err.println(e);
			em.getTransaction().rollback();
			
		}finally {
			
			em.close();
			
		}
		
		
		return categoria;
		
	}
	
	public List<TiposC> findAll(){
		EntityManager em = new Connection().getConnection();
		List<TiposC> categorias = null;
		
		try {
			
			categorias = em.createQuery("from Produtos c").getResultList();
			
		} catch (Exception e) {
			
			System.err.println(e);
			
		}finally {
			
			em.close();
			
		}
		
		return categorias;
		
	}
	
	public TiposC remove(Integer id) {		
		EntityManager em = new Connection().getConnection();
		TiposC categoria = null;
		
		try {
			
			categoria = em.find(TiposC.class, id);
			em.getTransaction().begin();
			em.remove(categoria);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.err.println(e);
			
		}finally {
			
			em.getTransaction().rollback();
			
		}
		
		return categoria;
		
	}
	
	

}
