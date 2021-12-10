package com.atviPw.funcoes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.atviPw.model.clienteModel;
import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoModel;

public class _10ClientesMenosProd extends Listar{
	private List<clienteModel> clientes;

    public _10ClientesMenosProd(List<clienteModel> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void listar() {
    	
    	   Map<Integer, clienteModel> ax = new HashMap<Integer, clienteModel>();
    	
    	   for (clienteModel cliente : clientes) {
    		   int ProdutosTotal = 0;
    		   List<consumoModel> consumos = cliente.getListaConsumo();
    		   for(consumoModel consumo: consumos) {
    			   List<produtoModel> produtos = consumo.getConsumoProdutos();
    			   ProdutosTotal += produtos.size();
    		   }
    		   if(ProdutosTotal!= 0) {
    			   ax.put(ProdutosTotal, cliente);
    		   }
    	   }
    	   
    	   
    	   int x = 1;
    	   if(ax.size() <= 10) {
    		   for (Entry <Integer, clienteModel> entry : ax.entrySet()) {
    			   Integer chave = entry.getKey();
    			   Object value = entry.getValue().nome;
    			   System.out.println("\nCliente Nº " + x);
    	           System.out.println("\nNome: " + value);
    	           System.out.println("Consumo total de produtos: " + chave);
    	           x++;
    		   }
    	   }else {
    		   for (Entry<Integer, clienteModel> entry: ax.entrySet()) {
    			   Integer chave = entry.getKey();
    			   Object value = entry.getValue().nome;
    			   System.out.println("\nCliente nº " + x);
                   System.out.println("\nNome: " + value);
                   System.out.println("Consumo total de produtos: " + chave);
                   x++;
                   if (x > 10) {
                       break;
                   }
    		   }
    	   }
    }
}
