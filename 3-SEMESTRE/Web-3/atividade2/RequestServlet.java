package br.edu.ifpr.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requisicao")

public class RequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();

        String metodo = req.getMethod();
        String uri = req.getRequestURI();
        String protocolo = req.getProtocol();
        String endereco = req.getRemoteAddr();

        writer.println("<html>");

        writer.println("<p>" + "Metodo: " + metodo + "</p>");
        writer.println("<p>" + "URI: " + uri + "</p>");
        writer.println("<p>" + "Protocolo: " + protocolo + "</p>");
        writer.println("<p>" + "Endereco: "+ endereco + "</p>");


        writer.println("</html>");
    }
}
