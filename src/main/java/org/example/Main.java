package org.example;

import jakarta.persistence.Table;
import org.example.dao.ProductoDAO;
import org.example.dao.TipoProductoDAO;
import org.example.infra.FlywayMigration;
import org.example.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.modelo.TipoProducto;
import org.example.utils.JPAUtils;

public class Main {
    public static void main(String[] args) {
        FlywayMigration flyway = new FlywayMigration();
        flyway.migrate();
        TipoProducto tipoProducto = new TipoProducto("mbappe");
        EntityManager em = JPAUtils.getEntityManager();

        em.getTransaction().begin();
        em.persist(tipoProducto);

        tipoProducto.setNombre("MESSIentofeli");
        em.flush();
        em.clear();

        tipoProducto= em.merge(tipoProducto);
        em.remove(tipoProducto);
        em.flush();
        em.getTransaction().commit();




    }
}
