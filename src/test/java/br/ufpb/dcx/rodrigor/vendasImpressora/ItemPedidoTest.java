package br.ufpb.dcx.rodrigor.vendasImpressora;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ItemPedidoTest {

    @Test
    void getTotalItem() {

        ItemPedido item = new ItemPedido(new Produto("qq","qualquer",10.0));
        assertEquals(new BigDecimal(10.0),item.getTotalItem());

    }
}