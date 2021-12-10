package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.inOut.Inputar;
import com.atviPw.model.FservModel;
import com.atviPw.model.MservModel;
import com.atviPw.model.servicoModel;

public class CadastrarServico extends Cadastro{
	private List<servicoModel> servicos;
	private Inputar inputar;
	
	public CadastrarServico(List<servicoModel> servicos) {
		this.servicos = servicos;
		this.inputar = new Inputar();
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Cadastro de serviços");
		System.out.println("Informe o nome do serviço:");
		String nome = inputar.texto();
		System.out.println("Informe o preço do serviço: R$ ");
		Double valor = inputar.numeroDouble();
		System.out.print("\nCategoria:\n\n1 - Masculino\n2 - Feminino\n");
		int categoria = inputar.numeroInteiro();
		switch (categoria) {
			case 1:
				servicoModel servicoF = new FservModel(nome, valor);
				this.servicos.add(servicoF);
				break;
			case 2:
				servicoModel servicoM = new MservModel(nome, valor);
				this.servicos.add(servicoM);
				break;
			
			default:
				System.out.println("\nOperação inválida!\n");
		}
	}
}
