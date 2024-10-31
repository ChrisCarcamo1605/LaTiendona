package org.example.dao;

import jakarta.persistence.EntityManager;
import org.example.modelo.Producto;
import org.example.modelo.TipoProducto;

import java.util.List;

public class TipoProductoDAO {

   private EntityManager em;
   public TipoProductoDAO(EntityManager em) {
       this.em = em;
   }
   public void guardar(TipoProducto tipoProducto){
       em.persist(tipoProducto);
   }
   public TipoProducto buscarPorId(Long id) {
        return em.find(TipoProducto.class, id);
    }

   public void actualizar(TipoProducto tipoProducto){
     em.merge(tipoProducto);
   }
  public void eliminar(Long id) {
        try {
            em.getTransaction().begin();
            TipoProducto producto = em.find(TipoProducto.class, id);
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
    public List<TipoProducto> consultaTodos(){
        String jpql = "SELECT P FROM TipoProducto AS P";
        return em.createQuery(jpql,TipoProducto.class).getResultList();
    }


}
