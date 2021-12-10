package com.atviPw.model;

public class telefoneModel {

	private String ddd;
	private String numero;
	public telefoneModel(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}
}
