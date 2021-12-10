package com.atviPw.model;

import java.time.LocalDate;
import java.util.List;

public class consumoModel {
	
	private clienteModel cliente;
	private List<produtoModel> consumoProdutos;
	
	
	private String nomeCliente;
	private cpfModel cpfCliente;
    private Double valorTotal;
    private LocalDate dataConsumo;
 

    public consumoModel(List<produtoConsumoModel> produtosConsumidos, Double valorTotal,
        String nomeCliente, cpfModel cpfCliente) {
        this.valorTotal = valorTotal;
        this.nomeCliente = nomeCliente;
        this.dataConsumo = LocalDate.now();
        this.cpfCliente = cpfCliente;
    }


    public consumoModel(List<produtoModel> consumoProdutos, Double valorTotal,  clienteModel cliente){
        this.consumoProdutos = consumoProdutos;
        this.valorTotal = valorTotal;
        this.dataConsumo = LocalDate.now();
        this.cliente = cliente;
    }
    
    public clienteModel getCliente() {
        return cliente;
    }

    public List<produtoModel> getConsumoProdutos() {
        return consumoProdutos;
    }

    public void setConsumoProdutos(List<produtoModel> consumoProdutos) {
        this.consumoProdutos = consumoProdutos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataConsumo() {
        return dataConsumo;
    }

    public void setDataConsumo(LocalDate dataConsumo) {
        this.dataConsumo = dataConsumo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public cpfModel getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(cpfModel cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    

}
