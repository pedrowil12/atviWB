package com.atviPw.funcoes;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.produtoModel;

public class EditarProduto extends Editar {
	private produtoModel produto;


	public EditarProduto(produtoModel produto) {
	        this.produto = produto;
	    }
	
	
	@Override
	public void editar() {
		System.out.println("Editar produto");
		boolean operacao = true;
		while (operacao) {
	        System.out.println("Editar:\n");
			System.out.println("1 - Nome");
			System.out.println("2 - Preço");
	        System.out.print("Qual tópico gostaria de editar? ");

	        Inputar inputar = new Inputar();
			int funcao = inputar.numeroInteiro();
			
			switch (funcao) {
            case 1:
                Inputar nome = new Inputar();
                System.out.print("Insira o novo nome: ");
                String nomeEdit = nome.texto();
                produto.nome = nomeEdit;
                System.out.println("Sucesso ao editar nome!\n");
                break;
            case 2:
                Inputar preco = new Inputar();
                System.out.print("Insira o novo preço do produto: ");
                double precoEdit = preco.numeroDouble();
                produto.valor = precoEdit;
                System.out.println("Sucesso ao editar o preço!\n");
                break;
			
			}
		}
	}
	
}