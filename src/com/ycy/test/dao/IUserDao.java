package com.ycy.test.dao;

import java.sql.SQLException;

public interface IUserDao {
    boolean checkUserName(String name) throws SQLException;
}
