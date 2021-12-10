package com.atviPw.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class clienteModel {
	public String nome;
	public String nomeSocial;
	public String genero;
	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public cpfModel cpf;
	private List<rgModel> rgs;
	private LocalDate dataCadastro;
	private List<telefoneModel> telefones;
	private List<produtoModel> produtosCliente;
	private List<servicoModel> servicosCliente;
	private List<consumoModel> listaConsumo;

	private Double consumoTotal;
	
	public List<consumoModel> getListaConsumo() {
		return listaConsumo;
	}


	public void setListaConsumo(List<consumoModel> listaConsumo) {
		this.listaConsumo = listaConsumo;
	}


	public void setConsumoTotal() {
		Double t = 0.0;
		for (consumoModel consumo : listaConsumo) {
			t += consumo.getValorTotal();
		}
		this.consumoTotal = t;
	}
	public Double getConsumoTotal() {
		return consumoTotal;
	}
	public int compareTo(clienteModel clientee) {
		if (this.consumoTotal > clientee.getConsumoTotal()) { 
  			return -1; 
  		} if (this.consumoTotal < clientee.getConsumoTotal()) {
			return 1;
		  } 
  		return 0; 
	}


	
	public clienteModel (String nome, String nomeSocial, cpfModel cpf, String genero) {
		this.nome= nome;
		this.nomeSocial = nomeSocial;
		this.cpf = cpf;
		this.genero = genero;
		this.rgs = new ArrayList<>();
		this.dataCadastro = LocalDate.now();
		this.telefones = new ArrayList<>();
		this.produtosCliente = new ArrayList<>();
		this.servicosCliente = new ArrayList<>();
	}
	
	
	public cpfModel getCpf() {
		return cpf;
	}
	public List<rgModel> getRgs() {
		return rgs;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public List<telefoneModel> getTelefones() {
		return telefones;
	}
	public List<produtoModel> getProdutosCliente() {
		return produtosCliente;
	}
	public List<servicoModel> getServicosCliente() {
		return servicosCliente;
	}


	public void setCpf(cpfModel cpf) {
		this.cpf = cpf;
	}

}
