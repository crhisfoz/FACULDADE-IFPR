<?php
//Verifica se o usuário está logado
include_once(__DIR__. "/../../controller/LoginController.php");
$loginCont = new LoginController();
if(!$loginCont->verificarUsuarioLogado()){
  header("location: " . BASE_URL . "/view/login/login.php");
  exit;
}

 ?>

<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Meta tags Obrigatórias -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>CRUD Alunos</title>
  </head>
  <body>

    <div class="container"> <!-- Será fechada no footer.php -->

        <?php include_once(__DIR__ . "/menu.php"); ?>