package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.produtoConsumoModel;


public class ConsumoProdutos extends Cadastro{
    private List<produtoConsumoModel> produtosConsumidos;
	private Inputar inputar;

    public ConsumoProdutos(List<produtoConsumoModel> produtosConsumidos) {
		this.produtosConsumidos = produtosConsumidos;
		this.inputar = new Inputar();
	}

	@Override
	public void cadastrar() {
		System.out.println("\nAdicione o produto: ");
		System.out.print("\nProduto: ");
		inputar = new Inputar();
		String produto = inputar.texto();
		System.out.print("Preço: ");
		inputar = new Inputar();
		Double preco = inputar.numeroDouble();
		produtoConsumoModel prod = new produtoConsumoModel(produto, preco);
		this.produtosConsumidos.add(prod);
		System.out.println("\nâœ… Produto adicionado!\n");
	}
}
