package entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

@Entity
public class Vendas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_VENDA")
    private BigInteger idVenda;
    @Basic
    @Column(name = "VALORTOTAL")
    private BigDecimal valortotal;
    @Basic
    @Column(name = "QUANTIDADE")
    private BigInteger quantidade;
    @Basic
    @Column(name = "NIF")
    private String nif;
    @Basic
    @Column(name = "ID_UTILIZADOR")
    private BigInteger idUtilizador;
    @OneToOne(mappedBy = "vendasByIdVenda")
    private Faturas faturasByIdVenda;
    @OneToMany(mappedBy = "vendasByIdVenda")
    private Collection<LinhaVendas> linhaVendasByIdVenda;
    @ManyToOne
    @JoinColumn(name = "NIF", referencedColumnName = "NIF", nullable = false)
    private Clientes clientesByNif;
    @ManyToOne
    @JoinColumn(name = "ID_UTILIZADOR", referencedColumnName = "ID_UTILIZADOR", nullable = false)
    private Utilizadores utilizadoresByIdUtilizador;

    public BigInteger getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(BigInteger idVenda) {
        this.idVenda = idVenda;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public BigInteger getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(BigInteger idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vendas vendas = (Vendas) o;

        if (idVenda != null ? !idVenda.equals(vendas.idVenda) : vendas.idVenda != null) return false;
        if (valortotal != null ? !valortotal.equals(vendas.valortotal) : vendas.valortotal != null) return false;
        if (quantidade != null ? !quantidade.equals(vendas.quantidade) : vendas.quantidade != null) return false;
        if (nif != null ? !nif.equals(vendas.nif) : vendas.nif != null) return false;
        if (idUtilizador != null ? !idUtilizador.equals(vendas.idUtilizador) : vendas.idUtilizador != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idVenda != null ? idVenda.hashCode() : 0;
        result = 31 * result + (valortotal != null ? valortotal.hashCode() : 0);
        result = 31 * result + (quantidade != null ? quantidade.hashCode() : 0);
        result = 31 * result + (nif != null ? nif.hashCode() : 0);
        result = 31 * result + (idUtilizador != null ? idUtilizador.hashCode() : 0);
        return result;
    }

    public Faturas getFaturasByIdVenda() {
        return faturasByIdVenda;
    }

    public void setFaturasByIdVenda(Faturas faturasByIdVenda) {
        this.faturasByIdVenda = faturasByIdVenda;
    }

    public Collection<LinhaVendas> getLinhaVendasByIdVenda() {
        return linhaVendasByIdVenda;
    }

    public void setLinhaVendasByIdVenda(Collection<LinhaVendas> linhaVendasByIdVenda) {
        this.linhaVendasByIdVenda = linhaVendasByIdVenda;
    }

    public Clientes getClientesByNif() {
        return clientesByNif;
    }

    public void setClientesByNif(Clientes clientesByNif) {
        this.clientesByNif = clientesByNif;
    }

    public Utilizadores getUtilizadoresByIdUtilizador() {
        return utilizadoresByIdUtilizador;
    }

    public void setUtilizadoresByIdUtilizador(Utilizadores utilizadoresByIdUtilizador) {
        this.utilizadoresByIdUtilizador = utilizadoresByIdUtilizador;
    }
}
