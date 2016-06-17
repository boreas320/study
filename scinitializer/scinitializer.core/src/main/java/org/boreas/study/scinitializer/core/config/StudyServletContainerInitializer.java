package org.boreas.study.scinitializer.core.config;


import org.boreas.study.scinitializer.core.filter.SecondFilter;
import org.boreas.study.scinitializer.core.servlet.AjaxServlet;
import org.boreas.study.scinitializer.core.servlet.HelloServlet;

import javax.servlet.*;
import java.util.EnumSet;
import java.util.Set;

/**
 * Created by xiangshuai on 16/6/6.
 */
public class StudyServletContainerInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        ServletRegistration.Dynamic helloServlet = ctx.addServlet("helloServlet", new HelloServlet());
        helloServlet.addMapping("/hello", "/study");
        FilterRegistration.Dynamic secondFilter = ctx.addFilter("secondFilter", new SecondFilter());
        secondFilter.addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), true, "/study", "/hello");


        ServletRegistration.Dynamic ajaxServlet = ctx.addServlet("ajaxServlet", new AjaxServlet());
        ajaxServlet.addMapping("/ajax");


    }
}
