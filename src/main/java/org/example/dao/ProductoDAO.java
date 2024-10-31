package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.modelo.Producto;
import org.example.modelo.TipoProducto;

import java.math.BigDecimal;
import java.util.List;

public class ProductoDAO {

    private EntityManager em;

    public ProductoDAO(EntityManager em) {
        this.em = em;
    }
    public Producto buscarPorId(Long id) {
        return em.find(Producto.class, id);
    }

    public void guardar(Producto producto) {

        em.persist(producto);
    }

    public void actualizar(Producto producto) {
        this.em.merge(producto);
    }

    public void eliminar(Long id) {
        try {
            em.getTransaction().begin();
            Producto producto = em.find(Producto.class, id);
            if (producto != null) {
                em.remove(producto);

            }
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction() != null) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        }

    }

    public Producto consultaPorId(Long id) {
        return em.find(Producto.class, id);
    }

    public List<Producto> consultaTodos() {
        String jpql = "SELECT P FROM Producto AS P";
        return em.createQuery(jpql, Producto.class).getResultList();
    }

    public List<Producto> consultaPorTipo(String tipoProducto) {
        String jpql = "SELECT P FROM Producto AS P WHERE P.tipo = :tipoProducto";
        return em.createQuery(jpql, Producto.class).setParameter("tipoProducto", tipoProducto).getResultList();
    }

    public double consultaPorPrecio(String nombre) {
        String jpql = "SELECT P.precio FROM Producto AS P where P.nombre = :nombre";
        return em.createQuery(jpql, Double.class).setParameter("nombre", nombre).getResultList().get(0);
    }
}
