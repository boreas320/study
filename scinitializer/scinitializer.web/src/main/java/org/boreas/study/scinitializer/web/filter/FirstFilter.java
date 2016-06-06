package org.boreas.study.scinitializer.web.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xiangshuai on 16/6/6.
 */

public class FirstFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Im first filter!");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
