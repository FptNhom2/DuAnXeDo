package com.dao;

import java.util.List;

public abstract class AtbusDAO<E, K> {

    public abstract void insert(E entity);

    public abstract void update(E entity);

    public abstract void delete(K id);

    public abstract E selectById(K id);

    public abstract List<E> selectAll();

    protected abstract List<E> selectBySql(String sql, Object... args);
}
