package billing.shaper.dao;

import billing.shaper.model.Task;

import java.util.List;

public interface CrudDao<T> {
    List<T> getAll();
    boolean create(T t);
    T read(int id);
    T update(int id, T t);
    boolean delete(T t);
}
