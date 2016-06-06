package org.boreas.study.scinitializer.core.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by xiangshuai on 16/6/6.
 */
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Im second filter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
