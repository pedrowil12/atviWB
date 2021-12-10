package com.atviPw.funcoes;

import com.atviPw.model.produtoModel;

public class retornarProduto implements retornar {
	produtoModel produto;
	
	public retornarProduto (produtoModel produto) {
		this.produto = produto;
	}
	
	@Override
	public void retorna() {
		System.out.println("Nome: " + produto.nome);
		System.out.println("Preço: " + produto.valor);
	}
}
