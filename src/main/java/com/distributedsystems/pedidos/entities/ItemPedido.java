package com.distributedsystems.pedidos.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "itens_pedidos")
public class ItemPedido implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ITEM")
    private Long codItem;

    @Column(name = "QTD_ITEM")
    private int qtdItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto.codProduto")
    private Produto produto;

    public ItemPedido() {
    }

    public ItemPedido(int qtdItem, Produto produto) {
        this.qtdItem = qtdItem;
        this.produto = produto;
    }

    public Long getCodItem() {
        return codItem;
    }

    public void setCodItem(Long codItem) {
        this.codItem = codItem;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return codItem == that.codItem && qtdItem == that.qtdItem && Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codItem, qtdItem, produto);
    }

    @Override
    public String toString() {
        return "ItensPedidos{" +
                "codItem=" + codItem +
                ", qtdItem=" + qtdItem +
                ", produto=" + produto +
                '}';
    }
}
