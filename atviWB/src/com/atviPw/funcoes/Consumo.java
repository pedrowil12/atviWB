package com.atviPw.funcoes;

import java.util.List;

import com.atviPw.model.consumoModel;
import com.atviPw.model.produtoModel;;

public class Consumo extends Listar{
	private List<consumoModel> consumos;

    public Consumo(List<consumoModel> consumos) {
        this.consumos = consumos;
    }

    @Override
    public void listar() {

        System.out.println("\nConsumos:");
        int x = 1;
        for (consumoModel consumo : consumos) {
            System.out.println("\nVenda nº " + x);
            x += 1;
            System.out.print("\nCliente: " + consumo.getCliente().nome);
            System.out.print("\nValor: R$ " + consumo.getValorTotal());
            System.out.println("\nData: " + consumo.getDataConsumo());
            for (produtoModel prodConsumo : consumo.getConsumoProdutos()) {
                System.out.print("\nProduto: " + prodConsumo.getNome());
                System.out.println("\nPreço: R$ " + prodConsumo.getValor());
            }
        }
    }
}
