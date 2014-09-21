package sandbox.maria.dao.impl;

import sandbox.maria.dao.GenericDao;
import sandbox.maria.util.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by Mikola on 20.09.14.
 */
public abstract class GenericDaoImpl<T> implements GenericDao<T>{

//    @PersistenceContext(unitName = "test")
    private EntityManager entityManager = EntityManagerUtil.getEntityManager();
    private EntityTransaction et = entityManager.getTransaction();
    private Class<T> entityClass;

    public GenericDaoImpl() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        entityClass = (Class<T>) parameterizedType.getActualTypeArguments()[0];
    }

    @Override
    public void create(T t) {
        et.begin();
        entityManager.persist(t);
        et.commit();
    }

    @Override
    public void delete(T t) {
        et.begin();
        entityManager.remove(t);
        et.commit();
    }

    @Override
    public void update(T t) {
        et.begin();
        entityManager.merge(t);
        et.commit();
    }

    @Override
    public List<T> getAll() {
        return entityManager.createQuery("FROM " + entityClass.getSimpleName()).getResultList();
    }

    @Override
    public T getById(Long id) {
        return entityManager.find(entityClass,id);
    }

    @Override
    public void deleteAll() {
        et.begin();
        entityManager.createQuery("DELETE FROM " + entityClass.getSimpleName()).executeUpdate();
        et.commit();
    }
}
