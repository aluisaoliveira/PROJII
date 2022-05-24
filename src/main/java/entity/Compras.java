package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
public class Compras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_COMPRA")
    private BigInteger idCompra;
    @Basic
    @Column(name = "DATA")
    private Date data;
    @Basic
    @Column(name = "QTD")
    private BigInteger qtd;
    @Basic
    @Column(name = "VALOR")
    private BigDecimal valor;
    @Basic
    @Column(name = "ID_UTILIZADOR")
    private BigInteger idUtilizador;
    @Basic
    @Column(name = "ID_FORNECEDOR")
    private BigInteger idFornecedor;

    public BigInteger getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(BigInteger idCompra) {
        this.idCompra = idCompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    public BigInteger getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(BigInteger idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public BigInteger getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(BigInteger idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compras compras = (Compras) o;

        if (idCompra != null ? !idCompra.equals(compras.idCompra) : compras.idCompra != null) return false;
        if (data != null ? !data.equals(compras.data) : compras.data != null) return false;
        if (qtd != null ? !qtd.equals(compras.qtd) : compras.qtd != null) return false;
        if (valor != null ? !valor.equals(compras.valor) : compras.valor != null) return false;
        if (idUtilizador != null ? !idUtilizador.equals(compras.idUtilizador) : compras.idUtilizador != null)
            return false;
        if (idFornecedor != null ? !idFornecedor.equals(compras.idFornecedor) : compras.idFornecedor != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompra != null ? idCompra.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (qtd != null ? qtd.hashCode() : 0);
        result = 31 * result + (valor != null ? valor.hashCode() : 0);
        result = 31 * result + (idUtilizador != null ? idUtilizador.hashCode() : 0);
        result = 31 * result + (idFornecedor != null ? idFornecedor.hashCode() : 0);
        return result;
    }
}
