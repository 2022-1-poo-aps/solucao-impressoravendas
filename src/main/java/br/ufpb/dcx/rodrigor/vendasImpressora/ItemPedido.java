package br.ufpb.dcx.rodrigor.vendasImpressora;

import java.math.BigDecimal;

public class ItemPedido {


    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public BigDecimal getTotalItem(){
        return this.produto.getValor().multiply(new BigDecimal(quantidade));
    }

    public ItemPedido(Produto produto){
        this(produto,1);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void incrementar() {
        this.quantidade++;
    }

    public void incrementar(int quant){
        this.quantidade+=quant;
    }
}
