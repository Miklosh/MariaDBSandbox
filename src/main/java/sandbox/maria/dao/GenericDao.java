package sandbox.maria.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mikola on 20.09.14.
 */
public interface GenericDao<T> extends Serializable{
    void create(T t);
    void delete(T t);
    void update(T t);
    List<T> getAll();
    T getById(Long id);
    void deleteAll();
}
