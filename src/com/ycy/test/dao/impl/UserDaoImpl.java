package com.ycy.test.dao.impl;

import com.ycy.test.dao.IUserDao;
import com.ycy.test.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
    @Override
    public boolean checkUserName(String name) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DruidUtil.getDruidDataSource());
        // 查到，返回1，否则返回0
        Long result = (Long) queryRunner.query("select count(*) from user where username=?",
                new ScalarHandler(), name);

        return result > 0;
    }
}