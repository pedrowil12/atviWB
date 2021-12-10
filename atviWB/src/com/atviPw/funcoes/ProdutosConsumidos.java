package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.model.produtoConsumoModel;

public class ProdutosConsumidos extends Listar {
	  private List<produtoConsumoModel> produtosConsumidos;

	    public ProdutosConsumidos(List<produtoConsumoModel> produtosConsumidos) {
	        this.produtosConsumidos = produtosConsumidos;
	    }

	    public void listar() {
	        System.out.println("Lista de todos os produtos:");
			for (produtoConsumoModel produtoConsumido : produtosConsumidos) {
				System.out.println("Produto: " + produtoConsumido.getNome());
	            System.out.println("Preço: " + produtoConsumido.getValor());
			}
	    }
}
