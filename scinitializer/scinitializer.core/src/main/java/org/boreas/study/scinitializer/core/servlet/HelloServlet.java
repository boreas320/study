package org.boreas.study.scinitializer.core.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xiangshuai on 16/6/6.
 */
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/views/gogogo.jsp").forward(req, res);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
