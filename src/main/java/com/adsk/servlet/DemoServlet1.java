package com.adsk.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession(); //sessionCreated() is executed
        session.setAttribute("url", "adsk.com");
        session.invalidate();  //sessionDestroyed() is executed

        PrintWriter out = response.getWriter();

        ServletContext context=getServletContext();
        context.setAttribute("company","A");

        ServletConfig config=getServletConfig();
        String driver=config.getInitParameter("driver");
        out.println("ServletConfig: driver: "+driver);

        response.setContentType("text/html");

        out.println("<h3>Hello from "+this.getClass().getName()+"!</h3>");
        out.close();
    }
}
