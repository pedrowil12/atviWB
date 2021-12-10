package com.atviPw.funcoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.clienteModel;
import com.atviPw.model.cpfModel;

public class EditarCliente extends Editar {

	private clienteModel cliente;


	public EditarCliente(clienteModel cliente) {
	        this.cliente = cliente;
	    }
	
	
	@Override
	public void editar() {
		System.out.println("Editar cliente");
		boolean operacao = true;
		while (operacao) {
	        System.out.println("Editar:\n");
			System.out.println("1 - Nome");
			System.out.println("2 - Nome Social");
			System.out.println("3 - CPF");
			System.out.println("5 - Telefone");
	        System.out.println("6 - Sair");
	        System.out.print("Qual tópico gostaria de editar? ");

	        Inputar inputar = new Inputar();
			int funcao = inputar.numeroInteiro();
			
			switch (funcao) {
            case 1:
                Inputar nome = new Inputar();
                System.out.print("Insira o novo nome: ");
                String nomeEdit = nome.texto();
                cliente.nome = nomeEdit;
                System.out.println("Sucesso ao editar nome!\n");
                break;
            case 2:
                Inputar nomeSocial = new Inputar();
                System.out.print("Insira o novo nome social: ");
                String nomeSocialEdit = nomeSocial.texto();
                cliente.nomeSocial = nomeSocialEdit;
                System.out.println("Sucesso ao editar nome social!\n");
                break;
            case 3:
                inputar = new Inputar();
                System.out.print("CPF: ");
                String numero = inputar.texto();
                System.out.print("Informe a data de emissão do cpf, no padrão dd/mm/yyyy: ");
                String data = inputar.texto();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataEmissao = LocalDate.parse(data, formato);
                cpfModel cpf = new cpfModel(dataEmissao, numero);
                cliente.setCpf(cpf);
                System.out.println("Sucesso ao editar CPF!");
                break;
                
            case 6:
                operacao = false;
                break;
            default:
                System.out.println("Operação inválida!");
	}
		}

}
	
}
