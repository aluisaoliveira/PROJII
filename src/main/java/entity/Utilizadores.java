package entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;

@Entity
public class Utilizadores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_UTILIZADOR")
    private BigInteger idUtilizador;
    @Basic
    @Column(name = "NOME")
    private String nome;
    @Basic
    @Column(name = "USERNAME")
    private String username;
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    @Basic
    @Column(name = "ID_PERMISSAO")
    private BigInteger idPermissao;
    @OneToMany(mappedBy = "utilizadoresByIdUtilizador")
    private Collection<Compras> comprasByIdUtilizador;
    @ManyToOne
    @JoinColumn(name = "ID_PERMISSAO", referencedColumnName = "ID_PERMISSAO", nullable = false)
    private Permissoes permissoesByIdPermissao;

    public BigInteger getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(BigInteger idUtilizador) {
        this.idUtilizador = idUtilizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigInteger getIdPermissao() {
        return idPermissao;
    }

    public void setIdPermissao(BigInteger idPermissao) {
        this.idPermissao = idPermissao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilizadores that = (Utilizadores) o;

        if (idUtilizador != null ? !idUtilizador.equals(that.idUtilizador) : that.idUtilizador != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (idPermissao != null ? !idPermissao.equals(that.idPermissao) : that.idPermissao != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUtilizador != null ? idUtilizador.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (idPermissao != null ? idPermissao.hashCode() : 0);
        return result;
    }

    public Collection<Compras> getComprasByIdUtilizador() {
        return comprasByIdUtilizador;
    }

    public void setComprasByIdUtilizador(Collection<Compras> comprasByIdUtilizador) {
        this.comprasByIdUtilizador = comprasByIdUtilizador;
    }

    public Permissoes getPermissoesByIdPermissao() {
        return permissoesByIdPermissao;
    }

    public void setPermissoesByIdPermissao(Permissoes permissoesByIdPermissao) {
        this.permissoesByIdPermissao = permissoesByIdPermissao;
    }
}
