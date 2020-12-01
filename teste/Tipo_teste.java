package br.com.teste;

import br.com.DAO.GenericDAO;
import br.com.model.TiposC;
import br.com.model.Produtos;

public class Tipo_teste {
	
	public static void main(String[] args) {
		
		GenericDAO dao = new GenericDAO();
		
		TiposC c = new TiposC();



		


		
		//SALVAR
		//c.setDescricao("Bebidas");
		//c = dao.save(c);
		//System.out.println("ID: "+c.getId());
		//System.out.println("Descrição: " + c.getDescricao());
		 
		
		//ATUALIZAR
		//c.setId(2);
		//c.setDescricao("Bebidas 1");
		//dao.update(c);
		

		//BUSCAR
		//Tipos c = dao.findByid(6);
		//System.out.println("Descrição: "+c.getDescricao());
		
		
		//LISTA
		//for(Tipos c: dao.findAll()) {
		//	System.out.println("ID: "+c.getId());
		//	System.out.println("Descrição: "+c.getDescricao());
		//}
		
		
		//REMOVER
		//dao.remove(5);
		
		
	}

}
