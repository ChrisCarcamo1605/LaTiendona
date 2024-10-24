package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.modelo.Producto;

public class ProductoDAO {
    private EntityManager em;
    public ProductoDAO(EntityManager em) {
        this.em = em;
    }
    public void guardar(Producto producto) {
        em.persist(producto);
    }
}
