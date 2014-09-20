package sandbox.maria;

import sandbox.maria.entity.SlaveUserOne;
import sandbox.maria.entity.SlaveUserTwo;
import sandbox.maria.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Launcher {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction entityTransaction = em.getTransaction();

        entityTransaction.begin();

        User user = new SlaveUserOne();
        user.setName("Mikola");
        user.setSurename("Mimimi");
        em.persist(user);

        User user2 = new SlaveUserTwo();
        user2.setName("Roma");
        user2.setSurename("Kroket");
        em.persist(user2);

        entityTransaction.commit();

        em.close();
        emf.close();
    }
}
