package br.com.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.Connection.Connection;
import br.com.model.Produtos;

public class ProdutoDAO {
	
	public Produtos save(Produtos produto) {
		
		EntityManager em = new Connection().getConnection();
		
		try {
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
			
		
		return produto;
		
	}
	
		public Produtos findById(Integer id) {
		
		EntityManager em = new Connection().getConnection();
		
		Produtos produtos = null;
		
		try {
			produtos = em.find(Produtos.class, id);
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			em.close();
			
		}
		return produtos;
		
	}
		
		public List<Produtos> findAll(){
			EntityManager em = new Connection().getConnection();
			
			List<Produtos> produtos = null;
					
			try {
				produtos = em.createQuery("from Produtos").getResultList();
			} catch (Exception e) {
				System.err.println(e);
			}finally {
				em.close();
			}
			
			return produtos;
			
		}

}
