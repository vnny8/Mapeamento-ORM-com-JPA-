package dominio;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class PedidoFuncionario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_pedido", referencedColumnName = "id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="id_funcionario", referencedColumnName = "id")
    private Funcionario funcionario;

    public PedidoFuncionario(Integer id, Pedido pedido, Funcionario funcionario) {
        this.id = id;
        this.pedido = pedido;
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
