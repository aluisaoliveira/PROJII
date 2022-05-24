package entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;

@Entity
public class Tipoprodutos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TIPOPRODUTO")
    private BigInteger idTipoproduto;
    @Basic
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(mappedBy = "tipoprodutosByIdTipoproduto")
    private Collection<Produtos> produtosByIdTipoproduto;

    public BigInteger getIdTipoproduto() {
        return idTipoproduto;
    }

    public void setIdTipoproduto(BigInteger idTipoproduto) {
        this.idTipoproduto = idTipoproduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tipoprodutos that = (Tipoprodutos) o;

        if (idTipoproduto != null ? !idTipoproduto.equals(that.idTipoproduto) : that.idTipoproduto != null)
            return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipoproduto != null ? idTipoproduto.hashCode() : 0;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }

    public Collection<Produtos> getProdutosByIdTipoproduto() {
        return produtosByIdTipoproduto;
    }

    public void setProdutosByIdTipoproduto(Collection<Produtos> produtosByIdTipoproduto) {
        this.produtosByIdTipoproduto = produtosByIdTipoproduto;
    }
}
