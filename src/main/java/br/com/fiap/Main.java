package br.com.fiap;

import br.com.fiap.domain.entity.Deposito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        Deposito depositoNaVilaLeopoldinaDoBrasil = new Deposito();

        depositoNaVilaLeopoldinaDoBrasil.setId(null).setNome("Vila Leopoldina");
//        depositoNaVilaLeopoldinaDoBrasil.setId(1L).setNome("Vila Leopoldina");

        System.out.println(depositoNaVilaLeopoldinaDoBrasil);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("maria-db");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(depositoNaVilaLeopoldinaDoBrasil);

        manager.getTransaction().commit();

        manager.close();
        factory.close();

        System.out.print(depositoNaVilaLeopoldinaDoBrasil);

    }
}