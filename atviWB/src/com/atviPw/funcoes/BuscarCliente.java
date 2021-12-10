package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.clienteModel;

public class BuscarCliente extends Buscar {

	 private List<clienteModel> clientes;
		private retornar retornar;

	    public BuscarCliente(List<clienteModel> clientes) {
	        this.clientes = clientes;
	    }

		@Override
		public void buscar() {
	        System.out.println("Procurar cliente");
	        System.out.print("Insira o CPF: ");
	        clienteModel cliente = null;
	        Inputar inputar = new Inputar();
	        String cpf = inputar.texto();
	        
	        
	        for (clienteModel cli : clientes) {
	            if (cli.getCpf().getNumero().equals(cpf)) {
	                cliente = cli;
	                retornar = new retornarCliente(cliente);
	                retornar.retorna();

	                System.out.println("\n1 - Editar");
			        System.out.println("2 - Deletar");
	                System.out.println("3 - Cancelar");
	                System.out.print("\n Operação desejada: ");
	                Inputar novoInput = new Inputar();
	                int operacao = novoInput.numeroInteiro();
	                switch (operacao) {
	                    case 1:
	                        Editar edicaoCliente = new EditarCliente(cli);
	                        edicaoCliente.editar();
	                        break;
	                    case 2:
	                        clientes.remove(cli);
	                        System.out.println("\n Remoção realizada!");
	                        break;
	                    case 3:
	                        break;
	                    default:
	                        System.out.println("\n Operação não identificada!\n");
	                }
	                break;
	                
	            	}
	        }
	        if (cliente  == null) System.out.println("Cliente não encontrado!");
	
		}
		
}
