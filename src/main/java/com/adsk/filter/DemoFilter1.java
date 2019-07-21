package com.adsk.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class DemoFilter1 implements Filter{

    public void init(FilterConfig arg0) throws ServletException {}

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {

        PrintWriter out = resp.getWriter();
        out.println("filter is invoked before");
        System.out.println("filter is invoked before");
        chain.doFilter(req, resp);//sends request to next resource

        out.println("filter is invoked after");
        System.out.println("filter is invoked after");
    }
    public void destroy() {}
}
