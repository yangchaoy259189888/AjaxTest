package com.ycy.test.servlet;

import com.thoughtworks.xstream.XStream;
import com.ycy.test.dao.ICityDao;
import com.ycy.test.dao.impl.CityDaoImpl;
import com.ycy.test.model.CityBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2018/12/15 15:59
 * @Description: TODO
 **/
@WebServlet(name = "ServletCity", urlPatterns = "/ServletCity")
public class ServletCity extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int pid = Integer.parseInt(request.getParameter("pid"));

            ICityDao cityDao = new CityDaoImpl();
            List<CityBean> list = cityDao.findCity(pid);

            XStream xStream = new XStream();
            // 把id设为属性
            xStream.useAttributeFor(CityBean.class, "id");
            // 设置别名
            xStream.alias("city", CityBean.class);
            // 转化 bean对象成 xml
            String xml = xStream.toXML(list);
            // 返回数据
            response.setContentType("text/xml;charset=utf-8");
            response.getWriter().write(xml);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
