package com.atviPw;


import com.atviPw.funcoes.Buscar;
import com.atviPw.funcoes.BuscarCliente;
import com.atviPw.funcoes.CadastrarCliente;
import com.atviPw.funcoes.CadastrarProdutos;
import com.atviPw.funcoes.CadastrarServico;
import com.atviPw.funcoes.Cadastro;
import com.atviPw.funcoes.Consumo;
import com.atviPw.funcoes.ConsumoCliente;
import com.atviPw.funcoes.Listar;
import com.atviPw.funcoes.listCliente;
import com.atviPw.funcoes.listarProdutos;
import com.atviPw.funcoes.listarServicos;
import com.atviPw.inOut.Inputar;
import com.atviPw.model.empresaModel;

public class atviPw {

	public static void main(String[] args) {
		System.out.println("Bem-vindo ao cadastro de clientes");
		empresaModel empresa = new empresaModel();
		boolean execucao = true;
		while (execucao) {
			System.out.println("\nQual operação você deseja fazer:");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Buscar");
			System.out.println("0 - Sair\n");

			Inputar inputar = new Inputar();
			int operacao = inputar.numeroInteiro();

			switch (operacao) {
			case 0:
				execucao = false;
				System.out.println("Até mais, obrigado!\n");
				break;
			case 1:
				System.out.println("\nQual operação você deseja fazer:");
				System.out.println("1 - Cadastrar Cliente");
				System.out.println("2 - Cadastrar Produto");
				System.out.println("3 - Cadastrar Serviço");
				System.out.println("4 - Cadastrar Consumo");
				System.out.println("0 - Sair\n");
				
				Inputar inputar1 = new Inputar();
				int operacao1 = inputar1.numeroInteiro();
				switch (operacao1) {
				case 0:
					execucao = false;
					System.out.println("Até mais, obrigado!\n");
					break;
				case 1:
					Cadastro cadastro = new CadastrarCliente(empresa.getClientes());
					cadastro.cadastrar();
					break;
					
				case 2:
					Cadastro cadastroProduto= new CadastrarProdutos(empresa.getProdutos());
					cadastroProduto.cadastrar();
					break;
					
				case 3: 
					Cadastro cadastroServico = new CadastrarServico(empresa.getServicos());
					cadastroServico.cadastrar();
					break;
					
				case 4: 
					Cadastro cadastroConsumos = new ConsumoCliente(empresa.getConsumos(), empresa.getClientes(), empresa.getProdutos());
					cadastroConsumos.cadastrar();
					break;
					
				default:
					System.out.println("\nOperação não identificada.");
				}	
				
				break;
				
			case 2:
				System.out.println("\nQual operação você deseja fazer:");
				System.out.println("1 - Listar todos Clientes");
				System.out.println("2 - Listar todos Produtos");
				System.out.println("3 - Listar todos Serviços");
				System.out.println("4 - Listar todos Consumos");
				System.out.println("0 - Sair\n");
				
				Inputar inputar2 = new Inputar();
				int operacao2 = inputar2.numeroInteiro();
				switch (operacao2) {
				case 0:
					execucao = false;
					System.out.println("Até mais, obrigado!\n");
					break;
				case 1:
					Listar listar = new listCliente(empresa.getClientes());
					listar.listar();
					break;
					
				case 2:
					Listar listarProdutos = new listarProdutos(empresa.getProdutos());
					listarProdutos.listar();
					break;
					
				case 3: 
					Listar listarServico = new listarServicos(empresa.getServicos());
					listarServico.listar();
					break;
					
				case 4: 
					Listar listarConsumos = new Consumo(empresa.getConsumos());
					listarConsumos.listar();
					break;	
				default:
					System.out.println("Operação não identificada.");
				}	
				break;
				
			case 3:
				System.out.println("\nQual operação você deseja fazer:");
				System.out.println("1 - Buscar Cliente");
				System.out.println("2 - Buscar Produto");
				System.out.println("3 - Buscar Serviço");
				System.out.println("0 - Sair\n");
				
				Inputar inputar3 = new Inputar();
				int operacao3 = inputar3.numeroInteiro();
				switch (operacao3) {
				case 0:
					execucao = false;
					System.out.println("Até mais, obrigado!\n");
					break;
				case 1:
					Buscar busca = new BuscarCliente(empresa.getClientes());
					busca.buscar();
					break;
					
				case 2:
					Listar listarProduto = new listarProdutos(empresa.getProdutos());
					listarProduto.listar();
					break;
					
				case 3: 
					Listar listarServico = new listarServicos(empresa.getServicos());
					listarServico.listar();
					break;
					
				default:
					System.out.println("Operação não identificada.");
				}	
				break;
				
				
				
				
				
			default:
				System.out.println("Operação não identificada.");
			}
		}
	}

}
