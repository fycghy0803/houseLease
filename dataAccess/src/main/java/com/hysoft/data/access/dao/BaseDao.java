package com.hysoft.data.access.dao;

/**
 * Created by yulifan on 16/7/11.
 */
public interface BaseDao {
    public Object findById(Object object);
    public Object query(String sqlId, Object object) throws Exception;
    public int update(String sqlId, Object object);
    public int delete(String sqlId, Object object);
    public int insert(String sqlId, Object object);
}
