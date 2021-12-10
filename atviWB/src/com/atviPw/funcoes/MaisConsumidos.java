package com.atviPw.funcoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoConsumidoModel;
import com.atviPw.model.produtoModel;

public class MaisConsumidos extends Listar{
	private List<produtoModel> produtos;
	private List<consumoModel> consumos;
	
	public MaisConsumidos (List<produtoModel> produtos, List<consumoModel> consumos) {
		this.produtos = produtos;
		this.consumos = consumos;
	}
	
	@Override
    public void listar() {
        Map<produtoModel, Integer> ax = new HashMap<produtoModel, Integer>();
        
        for (produtoModel produto : produtos) {
        	int total = 0;
        	ax.put(produto, total);
        }
        
        for (consumoModel consumo : consumos ) {
        	List<produtoModel> produtos = consumo.getConsumoProdutos();
        	for(produtoModel produto: produtos) {
        		ax.merge(produto, 1, (x,y) -> x+y);
        	}
        }
        
        Set<produtoModel> chaveProdt = ax.keySet();
        List<produtoConsumidoModel> consumosProdutos = new ArrayList<produtoConsumidoModel>();
        
        for (produtoModel produto : chaveProdt) {
        	int consumo = ax.get(produto);
        	produtoConsumidoModel prodCons = new produtoConsumidoModel(consumo, produto.nome);
        	consumosProdutos.add(prodCons);
        }
        
        Collections.sort(consumosProdutos);
        
        int x = 1;
        if(consumosProdutos.size() <= 10) {
        	for(produtoConsumidoModel pcm : consumosProdutos){
        		 System.out.println("\nProduto nº " + x);
                 System.out.println("\nProduto: " + pcm.nome);
                 System.out.println("Produtos consumidos Total: " + pcm.consumoQtde);
                 x++;
        	}
        }else {
        	for(produtoConsumidoModel pcm : consumosProdutos){
       		 System.out.println("\nProduto nº " + x);
                System.out.println("\nProduto: " + pcm.nome);
                System.out.println("Produtos consumidos Total: " + pcm.consumoQtde);
                x++;
                if(x > 10) {
                	break;
                	}
                }
        }
	}
	
}
