<?php
//View para alterar um aluno

include_once(__DIR__ . "/../../controller/AlunoController.php");
include_once(__DIR__ . "/../../model/Aluno.php");

$msgErros = "";
$aluno = null;

if(isset($_POST['submetido'])) {
    //Salvar o registro com as alterações

    //Captura o valor dos inputs do formulário
    $idAluno = $_POST['id_aluno'];
    $nome = trim($_POST['nome']);
    $idade = is_numeric($_POST['idade']) ? $_POST['idade'] : NULL;
    $estrangeiro = trim($_POST['estrang']);
    $idCurso = is_numeric($_POST['curso']) ? $_POST['curso'] : NULL;

    //Criar um objeto aluno
    $aluno = new Aluno();
    $aluno->setId($idAluno);
    $aluno->setNome($nome);
    $aluno->setIdade($idade);
    $aluno->setEstrangeiro($estrangeiro);
    if($idCurso) {
        $curso = new Curso();
        $curso->setId($idCurso);
        $aluno->setCurso($curso);
    }
    //print_r($aluno);

    //Chamar o controller para atualizar o aluno (persistir o objeto)
    $alunoCont = new AlunoController();
    $erros = $alunoCont->alterar($aluno);

    //Caso não tenha erros, redirecionar para o listagem
    if(! $erros) {
        header("location: listar.php");
        exit;
    }

    //Exibir os erros para o usuário
    //print_r($erros);
    $msgErros = implode("<br>", $erros);

} else {
    //Recebe o ID do aluno por parâmetro GET
    $idAluno = 0;
    if(isset($_GET['id']))
        $idAluno = $_GET['id'];

    //Validar se o aluno com o ID recebido existe
    $alunoCont = new AlunoController();
    $aluno = $alunoCont->buscarPorId($idAluno);

    //Verifica se o aluno foi encontrado
    if(! $aluno) {
        echo "Aluno não encontrado!<br>";
        echo "<a href='listar.php'>Voltar</a>";
        exit;
    }
}

include_once(__DIR__ . "/form.php");