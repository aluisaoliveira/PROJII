package entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Clientes {
    @Basic
    @Column(name = "ID_CLIENTE")
    private BigInteger idCliente;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "NIF")
    private String nif;
    @Basic
    @Column(name = "NOME")
    private String nome;
    @Basic
    @Column(name = "NUMTELEFONE")
    private String numtelefone;
    @Basic
    @Column(name = "RUA")
    private String rua;
    @Basic
    @Column(name = "NRPORTA")
    private BigInteger nrporta;
    @Basic
    @Column(name = "CODPOSTAL")
    private String codpostal;

    public BigInteger getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(BigInteger idCliente) {
        this.idCliente = idCliente;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumtelefone() {
        return numtelefone;
    }

    public void setNumtelefone(String numtelefone) {
        this.numtelefone = numtelefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public BigInteger getNrporta() {
        return nrporta;
    }

    public void setNrporta(BigInteger nrporta) {
        this.nrporta = nrporta;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientes clientes = (Clientes) o;

        if (idCliente != null ? !idCliente.equals(clientes.idCliente) : clientes.idCliente != null) return false;
        if (nif != null ? !nif.equals(clientes.nif) : clientes.nif != null) return false;
        if (nome != null ? !nome.equals(clientes.nome) : clientes.nome != null) return false;
        if (numtelefone != null ? !numtelefone.equals(clientes.numtelefone) : clientes.numtelefone != null)
            return false;
        if (rua != null ? !rua.equals(clientes.rua) : clientes.rua != null) return false;
        if (nrporta != null ? !nrporta.equals(clientes.nrporta) : clientes.nrporta != null) return false;
        if (codpostal != null ? !codpostal.equals(clientes.codpostal) : clientes.codpostal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCliente != null ? idCliente.hashCode() : 0;
        result = 31 * result + (nif != null ? nif.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (numtelefone != null ? numtelefone.hashCode() : 0);
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + (nrporta != null ? nrporta.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        return result;
    }
}
