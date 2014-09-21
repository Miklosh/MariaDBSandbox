package sandbox.maria.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Mikola on 20.09.14.
 */
public final class EntityManagerUtil {

    private EntityManagerUtil() {}

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
    private static EntityManager em ;

    public static EntityManager getEntityManager() {
        initFactory();
        initManager();
        return em;
    }

    private static void initManager() {
        if (em == null) {
            em = emf.createEntityManager();
        }
    }

    private static EntityManagerFactory initFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("test");
        }
        return emf;
    }

    public static void close() {
        if (em != null) em.close();
        if (emf != null) emf.close();
    }

}
