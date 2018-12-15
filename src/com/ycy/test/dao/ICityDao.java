package com.ycy.test.dao;

import com.ycy.test.model.CityBean;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/15 15:55
 * @Description: TODO
 **/
public interface ICityDao {
    List<CityBean> findCity(int pid) throws SQLException;
}
