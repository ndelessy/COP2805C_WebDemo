package edu.mdc.cop2805c.webdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(
    name = "HelloServlet",
    urlPatterns = {"/hello"},
    initParams = {
        @WebInitParam(name = "name", value = "World")
    }
)
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
         
         // Get the name parameter, use the default if not provided
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = getServletConfig().getInitParameter("name");
        }
        
        String number = request.getParameter("number");
        
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Greetings</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello, " + name + "!</h1>");
            out.println("<p>This is your number: " +  number   +"</p>");
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         // Get the name parameter, use the default if not provided
        String name = request.getParameter("name");
        if (name == null || name.isEmpty()) {
            name = getServletConfig().getInitParameter("name");
        }
        
        String number = request.getParameter("number");
        
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Greetings</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hello, " + name + "!</h1>");
            out.println("<p>This is your number: " +  number   +"</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}