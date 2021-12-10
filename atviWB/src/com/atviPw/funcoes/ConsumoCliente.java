package com.atviPw.funcoes;

import java.util.ArrayList;
import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.clienteModel;
import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoModel;

public class ConsumoCliente extends Cadastro{
	

	private List<consumoModel> consumos = new ArrayList<consumoModel>();
	private List<clienteModel> clientes;
	private List<produtoModel> produtosConsumidos = new ArrayList<produtoModel>();
	private List<produtoModel> todosProdutos;
	private Inputar inputar;
	
	public ConsumoCliente(List<consumoModel> consumos, List<clienteModel> clientes, List<produtoModel> todosProdutos) {
		this.consumos = consumos;
		this.clientes = clientes;
		this.todosProdutos = todosProdutos;
		this.inputar = new Inputar();
	}

	@Override
	public void cadastrar() {
		Double valorTotal = 0.0;
		String cpf = null;
		clienteModel cliente = null;

		System.out.println("\n Registro de consumo");
		
					System.out.println("\nInforme");
					System.out.print("\nCPF do cliente: ");
					inputar = new Inputar();
					cpf = inputar.texto();

		if (cpf != "") {
			for (clienteModel c : clientes) {
				if (cpf.equals(c.getCpf().getNumero())) {
					cliente = c;
					retornar retornoCliente = new retornarCliente(cliente);
					retornoCliente.retorna();
					break;
				}
			}
		} if (cliente == null) {
			System.out.println("\n Cliente não encontrado!");
			return;
		}

		System.out.println("\n Registro de Consumo");
		boolean exec = true;
		while (exec) {
			Inputar entradaNome = new Inputar();
			System.out.println("\nInforme");
			System.out.print("\nNome do produto: ");
			String NomeProduto = entradaNome.texto();
			boolean flag = true;
			for (produtoModel prod : todosProdutos) {
				if (NomeProduto == prod.nome) {
					this.produtosConsumidos.add(prod);
					flag = false;
					retornar impressaoProd = new retornarProduto(prod);
					impressaoProd.retorna();
					System.out.println("\n "+ prod.nome + " adicionado com sucesso!");
				}
			}
			if (flag) {
				System.out.println("\n Não foi possível encontrar o produto!");
			}
		}

		for (produtoModel produtoConsumido : produtosConsumidos) {
			valorTotal +=  produtoConsumido.getValor();
		}

		
		consumoModel novoConsumo = new consumoModel(produtosConsumidos, valorTotal, cliente);
		cliente.getListaConsumo().add(novoConsumo);
		cliente.setConsumoTotal();;
		this.consumos.add(novoConsumo);
		
		System.out.println("\n Cadastrado!");
		System.out.print("\n Cliente: " + cliente.nome);
		System.out.print("\n CPF: " + cliente.getCpf().getNumero());
		System.out.println("\n Valor total: R$ " + valorTotal);
		
		for(produtoModel prod : novoConsumo.getConsumoProdutos()) {
			System.out.print("\n" + prod.getNome());
			System.out.println("\nPreço: R$ " + prod.getValor());
		}
	}
}
