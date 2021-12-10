package com.atviPw.model;


public class produtoConsumidoModel implements Comparable<produtoConsumidoModel> {
	  public Integer consumoQtde;
	    public String nome;

	    public produtoConsumidoModel(Integer consumoQtde, String nome) {
	        this.consumoQtde = consumoQtde;
	        this.nome = nome;
	    }

	    @Override
	    public int compareTo(produtoConsumidoModel prod) {
	        return prod.consumoQtde.compareTo(this.consumoQtde);
	    }
}
