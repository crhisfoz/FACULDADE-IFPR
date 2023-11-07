<?php 

include_once(__DIR__ . "/../../model/Locacao.php");
include_once(__DIR__ . "/../../model/Cliente.php");
include_once(__DIR__. "/../../controller/VeiculoController.php");

$msgErros = "";
$locacao = NULL;

if(isset($_POST['submetido'])){
    $local = trim($_POST['local']);
    $data = trim($_POST['data']);
    $hora = trim($_POST['hora']);
    $idCliente = trim($_POST['cliente']);

    $locacao = new Locacao();
    $locacao->setLocal($local);
    $locacao->setData($data);
    $locacao->setHora($hora);
    $locacao->setCliente($cliente);
    if($idCliente){
        $cliente = new Cliente();
        $curso->setId($idCurso);
        $aluno->setCurso($curso);
    };

    $veicul = new LocacaoCon;
    $erros = $alunoCont->inserir($aluno);

    if(! $erros){
        header("location: listar.php");
        exit;
    }    
    $msgErros = implode("<br>", $erros);
}

include_once(__DIR__. "/form.php");

