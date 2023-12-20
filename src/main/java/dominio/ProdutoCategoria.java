package dominio;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class ProdutoCategoria implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;

    public ProdutoCategoria(Integer id, Produto produto, Categoria categoria) {
        this.id = id;
        this.produto = produto;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
