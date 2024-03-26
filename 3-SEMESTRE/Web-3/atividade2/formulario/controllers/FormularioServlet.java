package br.edu.ifpr.formulario.controllers;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.edu.ifpr.formulario.models.Formulario;
import br.edu.ifpr.formulario.services.FormularioService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class FormularioServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Formulario formulario = new Formulario();
        FormularioService  service = new FormularioService();
        try {
            String texto = service.validaTexto(request.getParameter("campo_texto"));
            formulario.setTexto(texto);

        }catch (IllegalArgumentException e){
            // Qual erro aconteceu ?
            e.getMessage();
            //redirecionamento para a tela do form

        }



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Chamou o método doGet");


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