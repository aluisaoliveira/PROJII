package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "LINHA_COMPRAS", schema = "ANA", catalog = "")
public class LinhaCompras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_LINHACOMPRA")
    private BigInteger idLinhacompra;
    @Basic
    @Column(name = "QTD")
    private BigInteger qtd;
    @Basic
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Basic
    @Column(name = "ID_COMPRA")
    private BigInteger idCompra;
    @Basic
    @Column(name = "ID_PRODUTO")
    private BigInteger idProduto;
    @ManyToOne
    @JoinColumn(name = "ID_COMPRA", referencedColumnName = "ID_COMPRA", nullable = false)
    private Compras comprasByIdCompra;
    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", nullable = false)
    private Produtos produtosByIdProduto;

    public BigInteger getIdLinhacompra() {
        return idLinhacompra;
    }

    public void setIdLinhacompra(BigInteger idLinhacompra) {
        this.idLinhacompra = idLinhacompra;
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

    public BigInteger getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(BigInteger idCompra) {
        this.idCompra = idCompra;
    }

    public BigInteger getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(BigInteger idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinhaCompras that = (LinhaCompras) o;

        if (idLinhacompra != null ? !idLinhacompra.equals(that.idLinhacompra) : that.idLinhacompra != null)
            return false;
        if (qtd != null ? !qtd.equals(that.qtd) : that.qtd != null) return false;
        if (valor != null ? !valor.equals(that.valor) : that.valor != null) return false;
        if (idCompra != null ? !idCompra.equals(that.idCompra) : that.idCompra != null) return false;
        if (idProduto != null ? !idProduto.equals(that.idProduto) : that.idProduto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLinhacompra != null ? idLinhacompra.hashCode() : 0;
        result = 31 * result + (qtd != null ? qtd.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (idCompra != null ? idCompra.hashCode() : 0);
        result = 31 * result + (idProduto != null ? idProduto.hashCode() : 0);
        return result;
    }

    public Compras getComprasByIdCompra() {
        return comprasByIdCompra;
    }

    public void setComprasByIdCompra(Compras comprasByIdCompra) {
        this.comprasByIdCompra = comprasByIdCompra;
    }

    public Produtos getProdutosByIdProduto() {
        return produtosByIdProduto;
    }

    public void setProdutosByIdProduto(Produtos produtosByIdProduto) {
        this.produtosByIdProduto = produtosByIdProduto;
    }
}
