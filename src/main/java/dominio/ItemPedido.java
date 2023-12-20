package dominio;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ItemPedido implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(precision = 10, scale = 2)
    private double preco_unitario;

    @ManyToOne
    @JoinColumn(name="id_pedido", referencedColumnName = "id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name="id_produto", referencedColumnName = "id")
    private Produto produto;

    public ItemPedido(Integer id, Integer quantidade, double preco_unitario, Pedido pedido, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.preco_unitario = preco_unitario;
        this.pedido = pedido;
        this.produto = produto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco_unitario() {
        return preco_unitario;
    }

    public void setPreco_unitario(double preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
