package com.ycy.test.dao.impl;

import com.ycy.test.dao.IWordDao;
import com.ycy.test.model.WordBean;
import com.ycy.test.util.DruidUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/15 0:01
 * @Description: TODO
 **/
public class WordDaoImpl implements IWordDao {
    @Override
    public List<WordBean> findWords(String words) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(DruidUtil.getDruidDataSource());
        List<WordBean> list = queryRunner.query("select * from word where words like ? limit ?",
                new BeanListHandler<WordBean>(WordBean.class), words + "%", 5);

        return list;
    }
}
