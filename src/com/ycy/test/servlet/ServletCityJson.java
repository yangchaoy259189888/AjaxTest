package com.ycy.test.servlet;

import com.thoughtworks.xstream.XStream;
import com.ycy.test.dao.ICityDao;
import com.ycy.test.dao.impl.CityDaoImpl;
import com.ycy.test.model.CityBean;
import net.sf.json.JSONArray;

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
 * @Date: 2018/12/15 18:04
 * @Description: TODO
 **/
@WebServlet(name = "ServletCityJson", urlPatterns = "/ServletCityJson")
public class ServletCityJson extends HttpServlet {
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

            JSONArray jsonArray = JSONArray.fromObject(list);
            String json = jsonArray.toString();

            // 返回数据
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write(json);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
