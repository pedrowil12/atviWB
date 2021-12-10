package com.atviPw.funcoes;

import java.util.Comparator;

import com.atviPw.model.clienteModel;


public class comparador implements Comparator<clienteModel>{

	    public int compare(clienteModel c1, clienteModel c2) {
	        c1.setConsumoTotal();
	        c2.setConsumoTotal();
	        return c1.getConsumoTotal().compareTo(c2.getConsumoTotal());
	    }

}