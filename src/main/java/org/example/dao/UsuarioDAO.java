/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.dao;

/**
 *
 * @author Christian
 */
import jakarta.persistence.*;
import java.util.List;
import org.example.modelo.Usuario;

public class UsuarioDAO {
    private final EntityManager entityManager;

    public UsuarioDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    public Usuario findByUsuario(String usuario) {
        TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.usuario = :usuario", Usuario.class);
        query.setParameter("usuario", usuario);
        return query.getResultStream().findFirst().orElse(null);
    }
    public Usuario findByEmail(String email) {
        TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u WHERE u.email = :email", Usuario.class);
        query.setParameter("email", email);
        return query.getResultList().stream().findFirst().orElse(null);
    }

    public Usuario findById(Long id) {
        return entityManager.find(Usuario.class, id);
    }

    public void update(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
    }

    public void delete(Long id) {
        Usuario usuario = findById(id);
        if (usuario != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(usuario);
            entityManager.getTransaction().commit();
        }
    }

    public List<Usuario> listAll() {
        TypedQuery<Usuario> query = entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class);
        return query.getResultList();
    }
}



