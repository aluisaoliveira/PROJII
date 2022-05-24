package entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Codigospostais {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CODPOSTAL")
    private String codpostal;
    @Basic
    @Column(name = "LOCALIDADE")
    private String localidade;
    @OneToMany(mappedBy = "codigospostaisByCodpostal")
    private Collection<Clientes> clientesByCodpostal;

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Codigospostais that = (Codigospostais) o;

        if (codpostal != null ? !codpostal.equals(that.codpostal) : that.codpostal != null) return false;
        if (localidade != null ? !localidade.equals(that.localidade) : that.localidade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codpostal != null ? codpostal.hashCode() : 0;
        result = 31 * result + (localidade != null ? localidade.hashCode() : 0);
        return result;
    }

    public Collection<Clientes> getClientesByCodpostal() {
        return clientesByCodpostal;
    }

    public void setClientesByCodpostal(Collection<Clientes> clientesByCodpostal) {
        this.clientesByCodpostal = clientesByCodpostal;
    }
}
