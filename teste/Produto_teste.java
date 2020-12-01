package br.com.teste;


import br.com.DAO.ProdutoDAO;
import br.com.model.TiposC;
import br.com.model.Produtos;


public class Produto_teste {

	
	
	
	public static void main (String[] args) {
	
	
	ProdutoDAO dao = new ProdutoDAO();
	/*
	
	//SALVAR
	TiposC tiposc = new TiposC();
	tiposc.setId(2);
	
	Produtos produto = new Produtos();
	produto.setDescricao("Fanta-Uva");
	produto.setQtd(5);
	produto.setValor(4.50);
	produto.setTipoc(tiposc);
	
	dao.save(produto);
	*/
	
	/*
	//BUSCAR
	Produtos produtos = dao.findById(1);
	
	System.out.println("Descrição: "+produtos.getDescricao());
	System.out.println("Quantidade: "+produtos.getQtd());
	System.out.println("Valor: "+produtos.getValor());
	System.out.println("Categoria: "+produtos.getTipoc().getDescricao());
	*/


	/*
	//LISTAR
	for(Produtos P: dao.findAll()) {
		System.out.println("=============================");
		System.out.println("ID: "+P.getId());
		System.out.println("Descrição: "+P.getDescricao());
		System.out.println("Quantidade: "+P.getQtd());
		System.out.println("Valor: "+P.getValor());
		
		
	}
	*/
	
	
	
	}
	
	
	
	
}
