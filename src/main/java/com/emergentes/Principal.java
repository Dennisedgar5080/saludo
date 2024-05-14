package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Principal", urlPatterns = {"/Principal"})
public class Principal extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaMundo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Mensaje de Bienvenida</h1>");
            out.println("<form action='Principal' method='post'>"); // Añadir etiqueta form
            out.println("<label>Escribe tu Nombre: </label>");
            out.println("<input type='text' name='nombre' value=''>");
            out.println("<input type='submit'>");
            out.println("</form>"); // Cerrar etiqueta form
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola como estas BROOOO</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola " + nombre + ",</h1>");
            out.println("<p>Bienvenido al mundo de los Servlets</p>");
            out.println("<a href='Principal'>Volver al Inicio</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
