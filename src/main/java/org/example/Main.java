package org.example;

import org.example.infra.FlywayMigration;
import org.example.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        FlywayMigration flyway = new FlywayMigration();
        flyway.migrate();

        Producto pro = new Producto();
        pro.setNombre("Leche Deslactosada");
        pro.setDescripcion("Leche Deslactosada sin azucar");
        pro.setPrecio(4.99);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("LaTiendona"); // o "LaTiendona"
        EntityManager em = factory.createEntityManager();


        try {
            em.getTransaction().begin();
            em.persist(pro);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
                e.printStackTrace();
            } else {
                e.printStackTrace();
            }
        } finally {
            em.close();
            factory.close();
        }
    }
}
