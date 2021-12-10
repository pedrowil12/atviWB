package com.atviPw.funcoes;

import com.atviPw.model.servicoModel;

public class retornarServico implements retornar {

	servicoModel servico;
	
	public retornarServico (servicoModel servico) {
		this.servico = servico;
	}
	
	@Override 
	public void retorna() {
		System.out.println("Nome: " + servico.nome);
		System.out.println("Preço: " + servico.valor);
	}
}
