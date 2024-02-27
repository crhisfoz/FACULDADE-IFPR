package br.edu.ifpr.atividade2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cabecalhos")
public class CabecalhosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String host = req.getHeader("host");
        String cliente = req.getHeader("user-agent");
        String codificacao = req.getHeader("accept-encoding");
        String idioma = req.getHeader("accept-language");

        writer.println("<html>");

        writer.println("<p>" + "Host: " + host + "</p>");
        writer.println("<p>" + "Cliente: " + cliente + "</p>");
        writer.println("<p>" + "Codificacao: " + codificacao + "</p>");
        writer.println("<p>" + "Idioma: "+ idioma + "</p>");


        writer.println("</html>");

    }
}
