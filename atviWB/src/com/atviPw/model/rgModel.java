package com.atviPw.model;

import java.time.LocalDate;

public class rgModel {
	private LocalDate dataEmissao;
	private String numero;

	public rgModel(LocalDate dataEmissao, String numero) {
		this.dataEmissao = dataEmissao;
		this.numero = numero;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public String getNumero() {
		return numero;
	}
}
