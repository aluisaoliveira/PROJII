package entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;

@Entity
public class Modelos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MODELO")
    private BigInteger idModelo;
    @Basic
    @Column(name = "NOME")
    private String nome;
    @Basic
    @Column(name = "ID_MARCA")
    private BigInteger idMarca;
    @OneToMany(mappedBy = "modelosByIdModelo")
    private Collection<Produtos> produtosByIdModelo;

    public BigInteger getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(BigInteger idModelo) {
        this.idModelo = idModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigInteger getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(BigInteger idMarca) {
        this.idMarca = idMarca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Modelos modelos = (Modelos) o;

        if (idModelo != null ? !idModelo.equals(modelos.idModelo) : modelos.idModelo != null) return false;
        if (nome != null ? !nome.equals(modelos.nome) : modelos.nome != null) return false;
        if (idMarca != null ? !idMarca.equals(modelos.idMarca) : modelos.idMarca != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idModelo != null ? idModelo.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (idMarca != null ? idMarca.hashCode() : 0);
        return result;
    }

    public Collection<Produtos> getProdutosByIdModelo() {
        return produtosByIdModelo;
    }

    public void setProdutosByIdModelo(Collection<Produtos> produtosByIdModelo) {
        this.produtosByIdModelo = produtosByIdModelo;
    }
}
