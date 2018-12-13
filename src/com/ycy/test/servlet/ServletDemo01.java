package com.ycy.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * @author 西邮陈冠希
 */
@WebServlet(name = "ServletDemo01", urlPatterns = "/ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("拜拜，我要去执行get方法了");
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.getWriter().write("收到了请求---name:" + name + "---age:" + age);
    }
}
