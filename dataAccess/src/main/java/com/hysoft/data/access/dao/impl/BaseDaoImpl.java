package com.hysoft.data.access.dao.impl;

import com.hysoft.data.access.dao.BaseDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yulifan on 16/7/11.
 */
public class BaseDaoImpl implements BaseDao{
    @Autowired
    private SqlSessionFactoryBean sqlSessionFactory;

    public Object findById(Object object) {
        return null;
    }

    public Object query(String sqlId, Object object) throws Exception {
        SqlSessionFactory sqlSessionFactoryObject = sqlSessionFactory.getObject();
        SqlSession session = sqlSessionFactoryObject.openSession();
        try{
           session.selectList(sqlId,object);
        } finally {
            session.close();
        }
        return null;
    }

    public int update(String sqlId, Object object) {
        return 0;
    }

    public int delete(String sqlId, Object object) {
        return 0;
    }

    public int insert(String sqlId, Object object) {
        return 0;
    }
}
