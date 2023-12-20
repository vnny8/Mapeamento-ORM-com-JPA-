package aplicacao;

import dominio.*;

import java.math.BigDecimal;
import java.text.ParseException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Programa {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapeamento");
        EntityManager em = emf.createEntityManager();
        Date d = new Date(2023 - 1900, 1 - 1, 15);
        Cliente c = new Cliente(null, "Cliente 1", "Rua A, 123", "123-4567");
        Pedido p = new Pedido(null, "PED123", d, c);
        d = new Date(2022 - 1900, 1 - 1, 1);
        Funcionario f = new Funcionario(null, "Funcionario 1", "Vendedor", d);
        PedidoFuncionario pf = new PedidoFuncionario(null, p, f);
        BigDecimal preco = new BigDecimal(19.99);
        Produto pr = new Produto(null, "Produto A", preco);
        ItemPedido ip = new ItemPedido(null, 2, 19.99, p, pr);
        Categoria ct = new Categoria(null, "Eletrônicos");
        ProdutoCategoria pc = new ProdutoCategoria(null, pr, ct);
        em.getTransaction().begin();
        em.persist(c);
        em.persist(p);
        em.persist(f);
        em.persist(pf);
        em.persist(pr);
        em.persist(ip);
        em.getTransaction().commit();
        // Tutorial para procurar dados
        //Pessoa p = em.find(Pessoa.class, 2);

        // Tutorial para guardar dados
        /* em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto"); */

        // Tutorial para remover
        // Pessoa p = em.find(Pessoa.class, 2);
        // em.getTransaction().begin();
        // em.remove(p);
        // em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Ok");
    }
}