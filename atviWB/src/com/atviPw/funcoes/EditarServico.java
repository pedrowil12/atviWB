package com.atviPw.funcoes;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.servicoModel;

public class EditarServico extends Editar {
	private servicoModel servico;


	public EditarServico(servicoModel servico) {
	        this.servico = servico;
	    }
	
	
	@Override
	public void editar() {
		System.out.println("Editar Servi�o");
		boolean operacao = true;
		while (operacao) {
	        System.out.println("Editar:\n");
			System.out.println("1 - Nome");
			System.out.println("2 - Pre�o");
	        System.out.print("Qual t�pico gostaria de editar? ");

	        Inputar inputar = new Inputar();
			int funcao = inputar.numeroInteiro();
			
			switch (funcao) {
            case 1:
                Inputar nome = new Inputar();
                System.out.print("Insira o novo nome: ");
                String nomeEdit = nome.texto();
                servico.nome = nomeEdit;
                System.out.println("Sucesso ao editar nome!\n");
                break;
            case 2:
                Inputar preco = new Inputar();
                System.out.print("Insira o novo pre�o do produto: ");
                double precoEdit = preco.numeroDouble();
                servico.valor = precoEdit;
                System.out.println("Sucesso ao editar o pre�o!\n");
                break;
			
			}
		}
	}
}
