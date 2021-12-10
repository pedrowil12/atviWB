package com.atviPw.model;

public abstract class servicoModel {
	
		public Double valor;
		
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
		
		public String getCategoria() {
			return categoria;
		}
		
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
}
