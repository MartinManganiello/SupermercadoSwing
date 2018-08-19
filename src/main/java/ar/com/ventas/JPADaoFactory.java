package ar.com.ventas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPADaoFactory {

    private static final String PERSISTENCE_UNIT_NAME = "JPAPU";
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    /**
     * Devuelve la referencia al la instancia del EntityManager. Si es null entonces la crea usando la unidad de persistencia
     * como esta definida en persistence.xml
     *
     * @return EntityManager
     */
    public static EntityManager createEntityManager() {

        if (entityManager == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public static void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
