package entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;

@Entity
public class Marcas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MARCA")
    private BigInteger idMarca;
    @Basic
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "marcasByIdMarca")
    private Collection<Modelos> modelosByIdMarca;

    public BigInteger getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(BigInteger idMarca) {
        this.idMarca = idMarca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marcas marcas = (Marcas) o;

        if (idMarca != null ? !idMarca.equals(marcas.idMarca) : marcas.idMarca != null) return false;
        if (nome != null ? !nome.equals(marcas.nome) : marcas.nome != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMarca != null ? idMarca.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }

    public Collection<Modelos> getModelosByIdMarca() {
        return modelosByIdMarca;
    }

    public void setModelosByIdMarca(Collection<Modelos> modelosByIdMarca) {
        this.modelosByIdMarca = modelosByIdMarca;
    }
}
