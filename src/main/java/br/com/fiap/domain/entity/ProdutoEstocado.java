package br.com.fiap.domain.entity;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class ProdutoEstocado {

    private Produto produto;
    private Deposito deposito;
    private Long numeroDeSerie;

    private LocalDateTime entrada;
    private LocalDateTime saida;

    public ProdutoEstocado(Produto produto, Deposito deposito, Long numeroDeSerie, LocalDateTime entrada, LocalDateTime saida) {
        this.produto = produto;
        this.deposito = deposito;
        this.numeroDeSerie = numeroDeSerie;
        this.entrada = entrada;
        this.saida = saida;
    }

    public ProdutoEstocado() {};


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Long getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(Long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "ProdutoEstocado{" +
                "produto=" + produto +
                ", deposito=" + deposito +
                ", numeroDeSerie=" + numeroDeSerie +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }
}
