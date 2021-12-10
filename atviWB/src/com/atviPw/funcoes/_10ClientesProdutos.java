package com.atviPw.funcoes;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.atviPw.model.clienteModel;
import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoModel;

public class _10ClientesProdutos extends Listar{
	private List<clienteModel> clientes;
	
	public _10ClientesProdutos(List<clienteModel> clientes) {
		this.clientes = clientes;
	}

	@Override
	public void listar() {
		
		Map<clienteModel, Integer> ax = new HashMap<clienteModel, Integer>();
		
		for(clienteModel cliente : clientes) {
			int ProdutosTotal = 0;
			List<consumoModel> consumos = cliente.getListaConsumo();
			for (consumoModel consumo : consumos) {
				List<produtoModel> produtos = consumo.getConsumoProdutos();
				ProdutosTotal += produtos.size();
			}
			
			ax.put(cliente, ProdutosTotal);
		}
		
		Map<clienteModel, Integer> reverse = new TreeMap <clienteModel, Integer>(Collections.reverseOrder());
		reverse.putAll(ax);
		
		int x = 1;
		
		if(ax.size() <= 10) {
			for (Entry<clienteModel, Integer> entry: ax.entrySet()) {
				String chave = entry.getKey().nome;
				Object value = entry.getValue();
				 System.out.println("\nCliente nº " + x);
		            System.out.println("\nNome: " + chave);
		            System.out.println("\nValor dos consumos: " + value);
		            x++;
			}
		}else {
			for (Entry<clienteModel, Integer> entry:ax.entrySet()) {
				String chave = entry.getKey().nome;
				Object value = entry.getValue();
				 System.out.println("\nCliente nº " + x);
		            System.out.println("\nNome: " + chave);
		            System.out.println("\nValor dos consumos: " + value);
		            x++;
		            if(x>10) {
		            	break;
		            }
			}
		}
	}
}
