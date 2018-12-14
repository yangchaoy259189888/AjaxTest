package com.ycy.test.servlet;

import com.ycy.test.dao.IWordDao;
import com.ycy.test.dao.impl.WordDaoImpl;
import com.ycy.test.model.WordBean;

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
 * @Date: 2018/12/14 23:46
 * @Description: TODO
 **/
@WebServlet(name = "ServletFindWords", urlPatterns = "/ServletFindWords")
public class ServletFindWords extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        try {
            String words = request.getParameter("words");
            // 数据库进行查询
            IWordDao wordDao = new WordDaoImpl();
            List<WordBean> list = wordDao.findWords(words);

            request.setAttribute("list", list);
            // 需要把处理的结果显示到div里面
            // 请求的是谁，谁就自己处理并响应。发请求的是demo08.jsp，则web浏览器就显示的是demo08.jsp的内容
            // 使用RequestDispatcher让其它的资源参与进来，协同完成的响应，这就是RequestDispatcher的主要作用。
            request.getRequestDispatcher("list.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
