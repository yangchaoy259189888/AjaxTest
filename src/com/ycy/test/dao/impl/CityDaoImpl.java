package com.ycy.test.dao.impl;

import com.ycy.test.dao.ICityDao;
import com.ycy.test.model.CityBean;
import com.ycy.test.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/15 15:55
 * @Description: TODO
 **/
public class CityDaoImpl implements ICityDao {

    @Override
    public List<CityBean> findCity(int pid) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DruidUtil.getDruidDataSource());

        return queryRunner.query("select * from city where pid = ?",
                new BeanListHandler<CityBean>(CityBean.class), pid);
    }
}
