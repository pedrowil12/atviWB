package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoModel;

public class listarProdutos extends Listar {
	private List<produtoModel> produtos;
	private List<consumoModel> consumos;
	
	public listarProdutos(List<produtoModel> produtos, List<consumoModel> consumos) {
		this.produtos = produtos;
		this.consumos = consumos;
	}
	public listarProdutos(List<produtoModel> produtos) {
		this.produtos = produtos;
	}
	
	@Override
	public void listar() {
		
		Inputar inputar = new Inputar();
		System.out.println("\n1 - Listar todos os produtos");
		System.out.println("2 - Listar produtos mais consumidos");
		System.out.print("\n0 - Sair\n");
		int operacao = inputar.numeroInteiro();
		switch (operacao) {
		case 1 :
			System.out.println("Lista de todos os produtos:");
			for (produtoModel produto : produtos) {
				System.out.println("Nome: " + produto.nome);
				System.out.println("Preço: " + produto.valor);
				System.out.println("Destinado a pessoas do sexo: " + produto.categoria);
				System.out.println("--------------------------------------");
			}
			break;
			
		case 2: 
			Listar maisConsumidos = new MaisConsumidos(produtos, consumos);
			maisConsumidos.listar();
			return;
		}
		
		
	}
}
