<?php 

include_once(__DIR__ . "/../../model/Aluno.php");
include_once(__DIR__ . "/../../model/Curso.php");
include_once(__DIR__. "/../../controller/AlunoController.php");

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
    print_r($erros);
    exit;

    header("location: listar.php");
    exit;
}

include_once(__DIR__. "/form.php");

