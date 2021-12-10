package com.atviPw.model;

public class produtoConsumoModel {
	 private String nome;
	  private Double valor;

	  public produtoConsumoModel(String nome, Double valor) {
	    this.nome = nome;
	    this.valor = valor;
	  }

	  public String getNome() {
	    return nome;
	  }

		public Double getValor() {
			return valor;
		}
}
