package com.distributedsystems.pedidos.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_PRODUTO")
    private Long codProduto;

    @Column(name = "DES_PRODUTO ")
    private String desProduto;

    @Column(name = "VLR_PRODUTO")
    private Double vlrProduto ;

    @Column(name = "QTD_ESTOQUE")
    private int qtdEstoque;

    @Version
    @Column(name = "COD_VRS")
    private int cod_vrs;

    public Produto() {
    }

    public Produto(String desProduto, Double vlrProduto, int qtdEstoque, int cod_vrs) {
        this.desProduto = desProduto;
        this.vlrProduto = vlrProduto;
        this.qtdEstoque = qtdEstoque;
        this.cod_vrs = cod_vrs;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public int getCod_vrs() {
        return cod_vrs;
    }

    public void setCod_vrs(int cod_vrs) {
        this.cod_vrs = cod_vrs;
    }

    public String getDesProduto() {
        return desProduto;
    }

    public void setDesProduto(String desProduto) {
        this.desProduto = desProduto;
    }

    public Double getVlrProduto() {
        return vlrProduto;
    }

    public void setVlrProduto(Double vlrProduto) {
        this.vlrProduto = vlrProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codProduto == produto.codProduto && Objects.equals(desProduto, produto.desProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codProduto, desProduto);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codProduto=" + codProduto +
                ", desProduto='" + desProduto + '\'' +
                ", vlrProduto=" + vlrProduto +
                ", qtdEstoque=" + qtdEstoque +
                '}';
    }
}
