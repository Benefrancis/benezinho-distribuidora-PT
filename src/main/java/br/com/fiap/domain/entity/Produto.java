package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "TB_PRODUTO", uniqueConstraints = {

        @UniqueConstraint( name = "UK_NM_PRODUTO", columnNames = {"NM_PRODUTO"})

})
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PRODUTO")
    @SequenceGenerator( name = "SQ_PRODUTO", sequenceName = "SQ_PRODUTO")
    @Column(name = "ID_PRODUTO")
    private Long id;

    @Column(name = "NM_PRODUTO", nullable = false)
    private String nome;


    @Column(name = "DS_PRODUTO")
    private String descricao;

    private BigDecimal valor;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Produto setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }


}