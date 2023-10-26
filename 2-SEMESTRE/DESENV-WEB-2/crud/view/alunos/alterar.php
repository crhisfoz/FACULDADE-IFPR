<?php
//View para alterar dados de aluno
include_once(__DIR__ . "/../../controller/AlunoController.php");
include_once(__DIR__ . "/../../model/Aluno.php");

$msgErros = "";
$aluno = NULL;

if (isset($_POST['submetido'])) {
    //salvar registro com alteracoes
    $idAluno = $_POST['id_aluno'];
    $nome = trim($_POST['nome']);
    $idade = is_numeric($_POST['idade'])? $_POST['idade'] : NULL; 
    $estrangeiro = trim($_POST['estrang']);
    $idCurso = is_numeric($_POST['curso'])? $_POST['curso']: NULL;

    $aluno = new Aluno();
    $aluno->setId($idAluno);
    $aluno->setNome($nome);
    $aluno->setIdade($idade);
    $aluno->setEstrangeiro($estrangeiro);
    if($idCurso){
        $curso = new Curso();
        $curso->setId($idCurso);
        $aluno->setCurso($curso);
    };
// chamar o controller para atualizar o aluno
    $alunoCont = new AlunoControler;
    $erros = $alunoCont->alterar($aluno);

    if(! $erros){
        header("location: listar.php");
        exit;
    }    
    $msgErros = implode("<br>", $erros);
} else {
    // Recebe o Id do aluno por parâmetro GET
    $idAluno = 0;
    if (isset($_GET['id'])) {
        $idAluno = $_GET['id'];
    };

    //Validar se o aluno com o ID recebido existe
    $alunoCont = new AlunoControler();
    $aluno = $alunoCont->buscarPorId($idAluno);
    if (!$aluno) {
        echo " Aluno não encontrado!<br>";
        echo "<a href='listar.php'>Voltar</a>";
        exit;
    }
};

include_once(__DIR__ . "/form.php");
