package com.adsk.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        ServletContext context=getServletContext();

        ServletConfig config=getServletConfig();
        String driver=config.getInitParameter("driver");
        out.println("ServletConfig: driver: "+driver);

        response.setContentType("text/html");

        out.println("<h3>Hello from "+this.getClass().getName()+"!</h3>");

        String n=(String)context.getAttribute("company");

        out.println("Welcome to "+n);
        out.close();
    }
}
