<?php
//View para alterar dados de aluno
include_once(__DIR__ . "/../../controller/AlunoController.php");

// Recebe o Id do aluno por parâmetro GET
$idAluno = 0;
if(isset($_GET['id'])){
    $idAluno = $_GET['id'];
};

//Validar se o aluno com o ID recebido existe
$alunoCont = new AlunoControler();
$aluno = $alunoCont->buscarPorId($idAluno);
if(!$aluno){
    echo " Aluno não encontrado!<br>";
    echo "<a href='listar.php'>Voltar</a>";
    exit;
}
include_once(__DIR__. "/form.php");
