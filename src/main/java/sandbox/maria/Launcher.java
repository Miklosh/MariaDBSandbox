package sandbox.maria;

import sandbox.maria.dao.UserDao;
import sandbox.maria.dao.impl.UserDaoImpl;
import sandbox.maria.entity.SlaveUserOne;
import sandbox.maria.entity.SlaveUserTwo;
import sandbox.maria.entity.User;
import sandbox.maria.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Launcher {

    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction entityTransaction = em.getTransaction();
//
//        entityTransaction.begin();
//
//        User user = new SlaveUserOne();
//        user.setName("Mikola");
//        user.setSurename("Mimimi");
//        em.persist(user);
//
//        User user2 = new SlaveUserTwo();
//        user2.setName("Roma");
//        user2.setSurename("Kroket");
//        em.persist(user2);
//
//        entityTransaction.commit();
//
//        em.close();
//        emf.close();
        UserDao us = new UserDaoImpl();

        User u1 = new SlaveUserOne();
        u1.setName("OloloOne");
        u1.setSurename("mikiki");

        User u2 = new SlaveUserTwo();
        u2.setName("KkokoOlolo");
        u2.setSurename("aqwa");

        us.create(u1);
        us.create(u2);

        EntityManagerUtil.close();
    }
}
