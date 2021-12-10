package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.servicoModel;

public class BuscarServico extends Buscar{
	 private List<servicoModel> servicos;
		private retornar retornar;

	    public BuscarServico(List<servicoModel> servicos) {
	        this.servicos = servicos;
	    }

		@Override
		public void buscar() {
	        System.out.println("Procurar serviço");
	        System.out.print("Insira o nome do serviço: ");
	        servicoModel servico = null;
	        Inputar inputar = new Inputar();
	        String nome = inputar.texto();
	        
	        
	        for (servicoModel ser : servicos) {
	            if (ser.getNome().equals(nome)) {
	                servico = ser;
	                retornar = new retornarServico(servico);
	                retornar.retorna();
	            
	            System.out.println("\n1 - Editar");
		        System.out.println("2 - Deletar");
                System.out.println("3 - Cancelar");
                System.out.print("\n Operação desejada: ");
                Inputar novoInput = new Inputar();
                int operacao = novoInput.numeroInteiro();
                switch (operacao) {
                    case 1:
                        Editar edicaoServico = new EditarServico(ser);
                        edicaoServico.editar();
                        break;
                    case 2:
                        servicos.remove(ser);
                        System.out.println("\n Remoção realizada!");
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("\n Operação não identificada!\n");
                }
                break;
	            }}
	        if (servico  == null) System.out.println("Servico não encontrado!");
	
	}
}
		
