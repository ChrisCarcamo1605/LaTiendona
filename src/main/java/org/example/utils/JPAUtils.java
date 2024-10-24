package org.example.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtils {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LaTiendona");

    public static EntityManager getEntityManager() {

        return emf.createEntityManager();
    }
}
