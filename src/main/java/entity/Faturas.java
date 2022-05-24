package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

@Entity
public class Faturas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_VENDA")
    private BigInteger idVenda;
    @Basic
    @Column(name = "DATA")
    private Date data;
    @Basic
    @Column(name = "VALORCOMIVA")
    private BigDecimal valorcomiva;
    @Basic
    @Column(name = "VALORSEMIVA")
    private BigDecimal valorsemiva;

    public BigInteger getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(BigInteger idVenda) {
        this.idVenda = idVenda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorcomiva() {
        return valorcomiva;
    }

    public void setValorcomiva(BigDecimal valorcomiva) {
        this.valorcomiva = valorcomiva;
    }

    public BigDecimal getValorsemiva() {
        return valorsemiva;
    }

    public void setValorsemiva(BigDecimal valorsemiva) {
        this.valorsemiva = valorsemiva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faturas faturas = (Faturas) o;

        if (idVenda != null ? !idVenda.equals(faturas.idVenda) : faturas.idVenda != null) return false;
        if (data != null ? !data.equals(faturas.data) : faturas.data != null) return false;
        if (valorcomiva != null ? !valorcomiva.equals(faturas.valorcomiva) : faturas.valorcomiva != null) return false;
        if (valorsemiva != null ? !valorsemiva.equals(faturas.valorsemiva) : faturas.valorsemiva != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVenda != null ? idVenda.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (valorcomiva != null ? valorcomiva.hashCode() : 0);
        result = 31 * result + (valorsemiva != null ? valorsemiva.hashCode() : 0);
        return result;
    }
}
