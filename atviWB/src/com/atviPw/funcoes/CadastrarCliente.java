package com.atviPw.funcoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.clienteModel;
import com.atviPw.model.cpfModel;

public class CadastrarCliente extends Cadastro{
	
	private List<clienteModel> clientes;
	private Inputar inputar;
	
	public CadastrarCliente(List<clienteModel> clientes) {
		this.clientes = clientes;
		this.inputar = new Inputar();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro de cliente");
		System.out.println("Informe o nome do cliente:");
		String nome = inputar.texto();
		System.out.println("Informe o nome social do cliente:");
		String nomeSocial = inputar.texto();
		System.out.println("Informe o cpf do cliente:");
		String valor = inputar.texto();
		System.out.println("Informe a data de emissão do cpf, no padrão dd/mm/yyyy:");
		String data = inputar.texto();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String g = "";
		boolean exec = true;
		while (exec) {
			System.out.println("\nSexo: ");
			System.out.print("\n1 - Masculino\n2 - Feminino\n3 - Prefiro não dizer\n");
			int operacao = inputar.numeroInteiro();
			switch (operacao) {
				case 1:
					g = "Masculino";
					exec = false;
					break;
				case 2:
					g = "Feminino";
					exec = false;
					break;
				case 3:
					g = "Outro";
					exec = false;
					break;
				default:
					break;
			}
		}
		String genero = g;
		LocalDate dataEmissao = LocalDate.parse(data, formato);
		cpfModel cpf = new cpfModel(dataEmissao, valor);
		clienteModel cliente = new clienteModel(nome, nomeSocial, cpf, genero);
		this.clientes.add(cliente);
	}
	
}
