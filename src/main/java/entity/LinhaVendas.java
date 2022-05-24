package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "LINHA_VENDAS", schema = "ANA", catalog = "")
public class LinhaVendas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_LINHAVENDA")
    private BigInteger idLinhavenda;
    @Basic
    @Column(name = "QTD")
    private BigInteger qtd;
    @Basic
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Basic
    @Column(name = "ID_PRODUTO")
    private BigInteger idProduto;
    @Basic
    @Column(name = "ID_VENDA")
    private BigInteger idVenda;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", nullable = false)
    private Produtos produtosByIdProduto;

    public BigInteger getIdLinhavenda() {
        return idLinhavenda;
    }

    public void setIdLinhavenda(BigInteger idLinhavenda) {
        this.idLinhavenda = idLinhavenda;
    }

    public BigInteger getQtd() {
        return qtd;
    }

    public void setQtd(BigInteger qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigInteger getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BigInteger idProduto) {
        this.idProduto = idProduto;
    }

    public BigInteger getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(BigInteger idVenda) {
        this.idVenda = idVenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinhaVendas that = (LinhaVendas) o;

        if (idLinhavenda != null ? !idLinhavenda.equals(that.idLinhavenda) : that.idLinhavenda != null) return false;
        if (qtd != null ? !qtd.equals(that.qtd) : that.qtd != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (idProduto != null ? !idProduto.equals(that.idProduto) : that.idProduto != null) return false;
        if (idVenda != null ? !idVenda.equals(that.idVenda) : that.idVenda != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLinhavenda != null ? idLinhavenda.hashCode() : 0;
        result = 31 * result + (qtd != null ? qtd.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (idProduto != null ? idProduto.hashCode() : 0);
        result = 31 * result + (idVenda != null ? idVenda.hashCode() : 0);
        return result;
    }

    public Produtos getProdutosByIdProduto() {
        return produtosByIdProduto;
    }

    public void setProdutosByIdProduto(Produtos produtosByIdProduto) {
        this.produtosByIdProduto = produtosByIdProduto;
    }
}
