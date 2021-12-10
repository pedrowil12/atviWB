package com.atviPw.funcoes;

import com.atviPw.model.clienteModel;
import com.atviPw.model.telefoneModel;

public class retornarCliente implements retornar{
	clienteModel cliente;
    
    public retornarCliente(clienteModel cliente) {
        this.cliente = cliente;
    }

	@Override
	public void retorna() {
		 System.out.println("Nome: " + cliente.nome);
	        System.out.println("Nome social: " + cliente.nomeSocial);
	        System.out.println("CPF: " + cliente.getCpf().getNumero());
	        for(telefoneModel telefone : cliente.getTelefones()) {
	            System.out.println("🔸 Telefone: " + '(' + telefone.getDdd() + ')' + ' ' + telefone.getNumero());
	        }
	        /*if (cliente.getConsumoTotal() == null) {
	            System.out.println("🔹 Consumo total: R$ 0.00"); 
	        } else {
	            System.out.println("🔹 Consumo total: R$ " + cliente.getConsumoTotal()); 
	        }*/
	}
}
