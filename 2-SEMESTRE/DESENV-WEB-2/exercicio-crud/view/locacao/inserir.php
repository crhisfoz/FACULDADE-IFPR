<?php

include_once(__DIR__ . "/../../model/Locacao.php");
include_once(__DIR__ . "/../../model/Cliente.php");
include_once(__DIR__ . "/../../controller/VeiculoController.php");
include_once(__DIR__ . "/../../controller/LocacaoController.php");

$msgErros = "";
$locacao = NULL;

if (isset($_POST['submetido'])) {
    $local = trim($_POST['local']);
    $data = trim($_POST['data']);
    $hora = trim($_POST['hora']);
    $nome = trim($_POST['cliente']);
    $cpf = trim($_POST['cpf']);
    $idVeiculo = is_numeric($_POST['veiculo']) ? $_POST['veiculo'] : NULL;

    $locacao = new Locacao();
    $locacao->setLocal($local);
    $locacao->setData($data);
    $locacao->setHora($hora);

    $cliente = new Cliente();
    $cliente->setNome($nome);
    $cliente->setCpf($cpf);

    if ($idVeiculo) {
        $veiculo = new Veiculo();
        $veiculo->setId($idVeiculo);
        $cliente->setVeiculo($veiculo);
    }

    $locacao->setCliente($cliente);

    $locacaoCont = new LocacaoController();
    $erros = $locacaoCont->inserir($locacao);

    if (!$erros) {
        header("location: listar.php");
        exit;
    }
    $msgErros = implode("<br>", $erros);
}

include_once(__DIR__ . "/form.php");
