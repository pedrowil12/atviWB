package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.model.servicoModel;

public class listarServicos extends Listar {

	private List<servicoModel> servicos;

	public listarServicos(List<servicoModel> servicos) {
		this.servicos = servicos;
	}
	
	
	@Override
	public void listar() {
		System.out.println("Lista de todos os serviço:");
		for (servicoModel servico : servicos) {
			System.out.println("Nome: " + servico.nome);
			System.out.println("Preço: " + servico.valor);
			System.out.println("Destinado a pessoas do sexo: " + servico.categoria);
			System.out.println("--------------------------------------");
		}
	}
}
