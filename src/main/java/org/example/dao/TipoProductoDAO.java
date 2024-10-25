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

   public void actualizar(TipoProducto tipoProducto){
       this.em.merge(tipoProducto);
   }
   public void eliminar(TipoProducto tipoProducto){

       tipoProducto=this.em.merge(tipoProducto);
        this.em.remove(tipoProducto);
   }


}
