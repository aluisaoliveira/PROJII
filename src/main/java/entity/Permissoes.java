package entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Permissoes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_PERMISSAO")
    private BigInteger idPermissao;
    @Basic
    @Column(name = "DESCRICAO")
    private String descricao;

    public BigInteger getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(BigInteger idPermissao) {
        this.idPermissao = idPermissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permissoes that = (Permissoes) o;

        if (idPermissao != null ? !idPermissao.equals(that.idPermissao) : that.idPermissao != null) return false;
        if (descricao != null ? !descricao.equals(that.descricao) : that.descricao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPermissao != null ? idPermissao.hashCode() : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        return result;
    }
}
