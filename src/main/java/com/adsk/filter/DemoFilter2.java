package com.adsk.filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class DemoFilter2 implements Filter{
    FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        String s = config.getInitParameter("maintenance");
        String password = req.getParameter("password");

        if(s != null && s.equals("yes")){
            out.print("This page is under maintenance");
        } else {
            if (password != null && password.equals("admin")) {
                chain.doFilter(req, resp);//sends request to next resource
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("index.html");
                rd.include(req, resp);
            }
        }
    }
    public void destroy() {}
}
