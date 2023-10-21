package com.distributedsystems.pedidos.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_ITEM_PEDIDO")
public class ItemPedido implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_ITEM")
    private Long codItem;

    @Column(name = "QTD_ITEM")
    private int qtdItem;

    @Column(name = "COD_PRODUTO")
    private Long codProduto;

    public ItemPedido() {
    }

    public ItemPedido(int qtdItem, Long codProduto) {
        this.qtdItem = qtdItem;
        this.codProduto = codProduto;
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

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return Objects.equals(codItem, that.codItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codItem);
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "codItem=" + codItem +
                ", qtdItem=" + qtdItem +
                ", codProduto=" + codProduto +
                '}';
    }
}
