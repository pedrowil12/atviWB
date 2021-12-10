package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.clienteModel;

public class listCliente extends Listar {

	private List<clienteModel> clientes;

	public listCliente(List<clienteModel>clientes) {
		this.clientes = clientes;
	}
	
	
	@Override
	public void listar() {
		Inputar inputar = new Inputar();
		System.out.println("1 - Lista de todos os clientes:");
		System.out.println("\n2 - Listar TOP 5 clientes que mais consumiram em valor");
		System.out.println("3 - Listar TOP 10 clientes que mais consumiram em quantidade de produtos");
		System.out.println("4 - Listar TOP 10 clientes que menos consumiram em quantidade de produtos");
		System.out.print("\n0 - Sair\n");
		int operacao = inputar.numeroInteiro();
		switch (operacao) {
		case 1: 
			for (clienteModel cliente : clientes) {
				System.out.println("Nome: " + cliente.nome);
				System.out.println("Nome Social: " + cliente.nomeSocial);
				System.out.println("CPF: " + cliente.getCpf().getNumero());
		        System.out.println("Sexo: " + cliente.getGenero());
				System.out.println("--------------------------------------");
			}
			break;
		
		case 2:
			Listar top5 = new clientesMaisConsumos(clientes);
			top5.listar();
			return;
			
		case 3: 
			Listar top10 = new _10ClientesProdutos(clientes);
			top10.listar();
			return;
		case 4: 
			Listar top10Menos = new _10ClientesMenosProd(clientes);
			top10Menos.listar();
			return;
			
		}
		
		
	}
}
