package com.atviPw.model;


public class produtoModel implements Comparable<produtoModel>{
	public String nome;
	public String categoria;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double valor;
	
	public produtoModel(String nome, Double valor, String categoria) {
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}

	@Override
	public int compareTo(produtoModel o) {
		// TODO Auto-generated method stub
		return 0;
	}
}