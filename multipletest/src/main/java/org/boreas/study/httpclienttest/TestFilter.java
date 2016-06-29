package org.boreas.study.httpclienttest;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by boreas320 on 16/6/30.
 */
public class TestFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
