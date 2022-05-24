package entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Produtos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PRODUTO")
    private BigInteger idProduto;
    @Basic
    @Column(name = "QTDSTOCK")
    private BigInteger qtdstock;
    @Basic
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic
    @Column(name = "ID_TIPOPRODUTO")
    private BigInteger idTipoproduto;
    @Basic
    @Column(name = "ID_MODELO")
    private BigInteger idModelo;

    public BigInteger getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BigInteger idProduto) {
        this.idProduto = idProduto;
    }

    public BigInteger getQtdstock() {
        return qtdstock;
    }

    public void setQtdstock(BigInteger qtdstock) {
        this.qtdstock = qtdstock;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigInteger getIdTipoproduto() {
        return idTipoproduto;
    }

    public void setIdTipoproduto(BigInteger idTipoproduto) {
        this.idTipoproduto = idTipoproduto;
    }

    public BigInteger getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(BigInteger idModelo) {
        this.idModelo = idModelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produtos produtos = (Produtos) o;

        if (idProduto != null ? !idProduto.equals(produtos.idProduto) : produtos.idProduto != null) return false;
        if (qtdstock != null ? !qtdstock.equals(produtos.qtdstock) : produtos.qtdstock != null) return false;
        if (descricao != null ? !descricao.equals(produtos.descricao) : produtos.descricao != null) return false;
        if (idTipoproduto != null ? !idTipoproduto.equals(produtos.idTipoproduto) : produtos.idTipoproduto != null)
            return false;
        if (idModelo != null ? !idModelo.equals(produtos.idModelo) : produtos.idModelo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProduto != null ? idProduto.hashCode() : 0;
        result = 31 * result + (qtdstock != null ? qtdstock.hashCode() : 0);
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (idTipoproduto != null ? idTipoproduto.hashCode() : 0);
        result = 31 * result + (idModelo != null ? idModelo.hashCode() : 0);
        return result;
    }
}
