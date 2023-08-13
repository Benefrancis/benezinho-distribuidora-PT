package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "TB_ITEM", uniqueConstraints = {
        @UniqueConstraint(name = "UK_TB_ITEM_NR_SERIE", columnNames = {"NR_SERIE"})
})
public class ProdutoEstocado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ITEM")
    @SequenceGenerator(name = "SQ_ITEM", sequenceName = "SQ_ITEM")
    @Column(name = "ID_ITEM")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "ID_PRODUTO", foreignKey = @ForeignKey(name = "FK_ITEM_PRODUTO"))
    private Produto produto;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_DEPOSITO", referencedColumnName = "ID_DEPOSITO", foreignKey = @ForeignKey(name = "FK_ITEM_DEPOSITO"))
    private Deposito deposito;

    @Column(name = "NR_SERIE", nullable = false)
    private String numeroDeSerie;

    @Column(name = "DT_ENTRADA", nullable = false)
    private LocalDateTime entrada;

    @Column(name = "DT_SAIDA")
    private LocalDateTime saida;


    public ProdutoEstocado() {
    }

    public ProdutoEstocado(Long id, Produto produto, Deposito deposito, String numeroDeSerie, LocalDateTime entrada, LocalDateTime saida) {
        this.id = id;
        this.produto = produto;
        this.deposito = deposito;
        this.numeroDeSerie = numeroDeSerie;
        this.entrada = entrada;
        this.saida = saida;
    }

    public Long getId() {
        return id;
    }

    public ProdutoEstocado setId(Long id) {
        this.id = id;
        return this;
    }

    public Produto getProduto() {
        return produto;
    }

    public ProdutoEstocado setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public ProdutoEstocado setDeposito(Deposito deposito) {
        this.deposito = deposito;
        return this;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public ProdutoEstocado setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public ProdutoEstocado setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
        return this;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public ProdutoEstocado setSaida(LocalDateTime saida) {
        this.saida = saida;
        return this;
    }

    @Override
    public String toString() {
        return "ProdutoEstocado{" +
                "id=" + id +
                ", produto=" + produto +
                ", deposito=" + deposito +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}