package br.edu.ifpr.formulario;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Chamou o método doGet");

        String  texto = request.getParameter("campo_texto");
        System.out.println("o valor informado foi: " + texto);

        String numero = request.getParameter("campo_numerico");

        if(numero != null && !numero.isBlank()) {
            Integer numero_convertido = Integer.parseInt(request.getParameter("campo_numerico"));
            System.out.println("o número informado foi: " + numero_convertido);
        }


        String dataTexto = request.getParameter("campo_data");
        LocalDate data = LocalDate.parse(dataTexto);

        System.out.println("a data informada foi: " + data.format(formatter));

        String opcao = request.getParameter("campo_opcao_radio");
        System.out.println("a oção selecionada foi: " + opcao);

        String[] herois = request.getParameterValues("campo_opcao_checkbox");

        System.out.println("O(s) heroi(s) Selecionado(os): ");

        //possível erro, caso herois seja nulo
        for (String heroi: herois){
            System.out.println(heroi);
        }

        //response.sendRedirect(request.getContextPath());


    }

    public void destroy() {
    }
}