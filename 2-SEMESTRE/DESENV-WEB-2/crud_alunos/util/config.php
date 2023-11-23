<?php

/* Ativar estas configurações caso os erros não
estajam sendo exibidos no navegador */
ini_set('display_errors', 1);
error_reporting(E_ALL);


//Configurar essas variáveis de acordo com o seu ambiente
define("DB_HOST", "localhost");
define("DB_NAME", "conexao_bd");
define("DB_USER", "root");
define("DB_PASSWORD", "root");

//Configurar variável do diretório base da aplicação
define("BASE_URL", "/crud_alunos");
