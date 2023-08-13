package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_DEPOSITO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_DEPOSITO", columnNames = {"NM_DEPOSITO"}) // 1
})
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPOSITO")
    @SequenceGenerator(name = "SQ_DEPOSITO", sequenceName = "SQ_DEPOSITO")
    @Column(name = "ID_DEPOSITO")
    private Long id;

    @Column(name = "NM_DEPOSITO", nullable = false)
    private String nome;


    public Deposito() {
    }

    public Deposito(Long id, String nome) {
        this.setId( id );
        this.setNome( nome );
    }


    public Long getId() {
        return id;
    }

    public Deposito setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Deposito setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}