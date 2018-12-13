package com.ycy.test.servlet;

import com.ycy.test.dao.IUserDao;
import com.ycy.test.dao.impl.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ServletDemo03", urlPatterns = "/ServletDemo03")
public class ServletDemo03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        try {
            request.setCharacterEncoding("UTF-8");

            String name = request.getParameter("name");
            IUserDao userDao = new UserDaoImpl();

            boolean isExist = userDao.checkUserName(name);

            // 通知页面，到底有还是没有。
            if (isExist) {
                response.getWriter().println(1);
            } else {
                response.getWriter().println(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        doGet(request, response);
    }
}