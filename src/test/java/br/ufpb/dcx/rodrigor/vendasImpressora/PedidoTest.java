package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void getTotalPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(new Produto("sapato","Sapato",10.0),2);
        pedido.adicionarProduto(new Produto("meia","Meia",3.0),3);
        assertEquals(new BigDecimal(29.0),pedido.getTotalPedido());


    }
}