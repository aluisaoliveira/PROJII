package entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Fornecedores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_FORNECEDOR")
    private BigInteger idFornecedor;
    @Basic
    @Column(name = "NOME")
    private String nome;
    @Basic
    @Column(name = "NUMTELEFONE")
    private String numtelefone;
    @Basic
    @Column(name = "EMAIL")
    private String email;
    @Basic
    @Column(name = "NRPORTA")
    private BigInteger nrporta;
    @Basic
    @Column(name = "RUA")
    private String rua;
    @Basic
    @Column(name = "CODPOSTAL")
    private String codpostal;
    @ManyToOne
    @JoinColumn(name = "CODPOSTAL", referencedColumnName = "CODPOSTAL")
    private Codigospostais codigospostaisByCodpostal;

    public BigInteger getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(BigInteger idFornecedor) {
        this.idFornecedor = idFornecedor;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getNrporta() {
        return nrporta;
    }

    public void setNrporta(BigInteger nrporta) {
        this.nrporta = nrporta;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
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

        Fornecedores that = (Fornecedores) o;

        if (idFornecedor != null ? !idFornecedor.equals(that.idFornecedor) : that.idFornecedor != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (numtelefone != null ? !numtelefone.equals(that.numtelefone) : that.numtelefone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nrporta != null ? !nrporta.equals(that.nrporta) : that.nrporta != null) return false;
        if (rua != null ? !rua.equals(that.rua) : that.rua != null) return false;
        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFornecedor != null ? idFornecedor.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (numtelefone != null ? numtelefone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nrporta != null ? nrporta.hashCode() : 0);
        result = 31 * result + (rua != null ? rua.hashCode() : 0);
        result = 31 * result + (codpostal != null ? codpostal.hashCode() : 0);
        return result;
    }

    public Codigospostais getCodigospostaisByCodpostal() {
        return codigospostaisByCodpostal;
    }

    public void setCodigospostaisByCodpostal(Codigospostais codigospostaisByCodpostal) {
        this.codigospostaisByCodpostal = codigospostaisByCodpostal;
    }
}
