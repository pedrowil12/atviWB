package com.atviPw.funcoes;

import java.util.Collections;
import java.util.List;

import com.atviPw.model.clienteModel;

public class clientesMaisConsumos extends Listar{
	
    private List<clienteModel> clientes;
    private retornar retornar;

    public clientesMaisConsumos(List<clienteModel> clientes) {
        this.clientes = clientes;
    }

    @Override
	public void listar() {
        Collections.sort(clientes, new comparador());
        Collections.reverse(clientes);
        if (clientes.size() > 5) {
            for (int i = 0; i < 5; ++i) {
                System.out.println("\nCliente nº " + i+1);
                this.retornar = new retornarCliente(clientes.get(i));
                retornar.retorna();
            }
        } else {
            int x = 1;
            for(clienteModel cliente : clientes) {
                System.out.println("\nCliente nº" + x);
                this.retornar= new retornarCliente(cliente);
                retornar.retorna();
                x+=1;
            }
        }
    
    }
}
