package dominio;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Funcionario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(length = 100)
    private String cargo;

    @Temporal(TemporalType.DATE)
    private Date data_contratacao;

    public Funcionario(Integer id, String nome, String cargo, Date data_contratacao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.data_contratacao = data_contratacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getData_contratacao() {
        return data_contratacao;
    }

    public void setData_contratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
}

