package org.boreas.study.httpclienttest;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by boreas320 on 16/6/30.
 */
public class XssServlet extends HttpServlet {


    private Dao dao = new Dao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.getWriter().println("haha");
//        resp.getWriter().flush();
        List<String> list;
        try {
            list = dao.list();
            req.setAttribute("list", list);
            req.getRequestDispatcher("/views/save.jsp").forward(req, resp);


        } catch (SQLException e)

        {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            dao.save(req.getParameter("content"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        doGet(req, resp);
    }
}
