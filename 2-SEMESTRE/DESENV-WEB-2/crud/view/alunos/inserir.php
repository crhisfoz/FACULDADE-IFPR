<?php 

include_once(__DIR__ . "/../../model/Aluno.php");
include_once(__DIR__ . "/../../model/Curso.php");
include_once(__DIR__. "/../../controller/AlunoController.php");

$msgErros = "";
$aluno = NULL;

if(isset($_POST['submetido'])){
    $nome = trim($_POST['nome']);
    $idade = is_numeric($_POST['idade'])? $_POST['idade'] : NULL; 
    $estrangeiro = trim($_POST['estrang']);
    $idCurso = is_numeric($_POST['curso'])? $_POST['curso']: NULL;

    $aluno = new Aluno();
    $aluno->setNome($nome);
    $aluno->setIdade($idade);
    $aluno->setEstrangeiro($estrangeiro);
    if($idCurso){
        $curso = new Curso();
        $curso->setId($idCurso);
        $aluno->setCurso($curso);
    };

    $alunoCont = new AlunoControler;
    $erros = $alunoCont->inserir($aluno);

    if(! $erros){
        header("location: listar.php");
        exit;
    }    
    $msgErros = implode("<br>", $erros);
}

include_once(__DIR__. "/form.php");

