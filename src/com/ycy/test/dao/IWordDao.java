package com.ycy.test.dao;

import com.ycy.test.model.WordBean;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/14 23:58
 * @Description: TODO
 **/
public interface IWordDao {
    List<WordBean> findWords(String words) throws SQLException;
}
