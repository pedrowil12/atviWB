package com.atviPw.model;

import java.util.ArrayList;
import java.util.List;


public class empresaModel {
	private List<clienteModel> clientes;
	private List<produtoModel> produtos;
	private List<servicoModel> servicos;
	private List<consumoModel> consumos;
	public empresaModel() {
		this.clientes = new ArrayList<>();
		this.produtos = new ArrayList<>();
		this.servicos = new ArrayList<>();
		this.consumos = new ArrayList<consumoModel>();
	}
	public List<clienteModel> getClientes() {
		return clientes;
	}
	public List<produtoModel> getProdutos() {
		return produtos;
	}
	public List<servicoModel> getServicos() {
		return servicos;
	}
	public List<consumoModel> getConsumos() {
		return consumos;
	}
}
