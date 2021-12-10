package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.produtoModel;

public class CadastrarProdutos extends Cadastro{

	
	private List<produtoModel> produtos;
	private Inputar inputar;
	
	public CadastrarProdutos(List<produtoModel> produtos) {
		this.produtos = produtos;
		this.inputar = new Inputar();
	}
	
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro de produto");
		System.out.println("Informe o nome do produto:");
		String nome = inputar.texto();
		System.out.println("Informe o preço do produto: R$ ");
		Double valor = inputar.numeroDouble();
		System.out.print("\nCategoria\n\n1 - Unisex\n2 - Feminino\n3 - Masculino");
		Inputar entradaCategoria = new Inputar();
		System.out.print("\n");
		int c = entradaCategoria.numeroInteiro();
		String categoria = "";

		switch (c) {
			case 1:
				categoria = "Unisex";
				break;
			case 2:
				categoria = "Feminino";
				break;
			case 3:
				categoria = "Unisex";
				break;
			default:
				System.out.println("\nOperação inválida.");
		}
		
		produtoModel produto = new produtoModel(nome, valor, categoria);
		this.produtos.add(produto);
	}

}
