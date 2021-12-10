package com.atviPw.funcoes;

import java.util.List;
import com.atviPw.inOut.Inputar;
import com.atviPw.model.produtoModel;


public class BuscarProduto extends Buscar {

	 private List<produtoModel> produtos;
		private retornar retornar;

	    public BuscarProduto(List<produtoModel> produtos) {
	        this.produtos = produtos;
	    }

		@Override
		public void buscar() {
	        System.out.println("Procurar produto");
	        System.out.print("Insira o nome do produto: ");
	        produtoModel produto = null;
	        Inputar inputar = new Inputar();
	        String nome = inputar.texto();
	        
	        
	        for (produtoModel pro : produtos) {
	            if (pro.getNome().equals(nome)) {
	                produto = pro;
	                retornar = new retornarProduto(produto);
	                retornar.retorna();
	                
	            
	            
	            System.out.println("\n1 - Editar");
		        System.out.println("2 - Deletar");
                System.out.println("3 - Cancelar");
                System.out.print("\n Operação desejada: ");
                Inputar novoInput = new Inputar();
                int operacao = novoInput.numeroInteiro();
                switch (operacao) {
                    case 1:
                        Editar edicaoProduto = new EditarProduto(pro);
                        edicaoProduto.editar();
                        break;
                    case 2:
                        produtos.remove(pro);
                        System.out.println("\n Remoção realizada!");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\n Operação não identificada!\n");
                }
                break;
	            
	            
	        }	}
	        if (produto  == null) System.out.println("Produto não encontrado!");
	
		}
		
}
