<?php

include_once(__DIR__ . "/../../model/Locacao.php");
include_once(__DIR__ . "/../../model/Cliente.php");
include_once(__DIR__ . "/../../controller/VeiculoController.php");
include_once(__DIR__ . "/../../controller/LocacaoController.php");
include_once(__DIR__ . "/../../controller/ClienteController.php");

$msgErros = "";
$idVeiculo = NULL;

$locacaoId = $_GET['id'];
$locacaoCont = new LocacaoController();
$locacaoAntiga = $locacaoCont->buscarPorId($locacaoId);
$idCliente = $locacaoAntiga->getCliente()->getId();
$idVeiculo = $locacaoAntiga->getCliente()->getVeiculo()->getId();

$locacao = NULL;

if (isset($_POST['submetido'])) {

    $local = trim($_POST['local']);
    $data = trim($_POST['data']);
    $hora = trim($_POST['hora']);
    $nome = trim($_POST['cliente']);
    $cpf = trim($_POST['cpf']);
    $idVeiculo = is_numeric($_POST['veiculo']) ? $_POST['veiculo'] : NULL;

    $locacao = new Locacao();
    $locacao->setId($locacaoId);
    $locacao->setLocal($local);
    $locacao->setData($data);
    $locacao->setHora($hora);

    $cliente = new Cliente();
    $cliente->setId($idCliente);
    $cliente->setNome($nome);
    $cliente->setCpf($cpf);

    if ($idVeiculo) {
        $veiculo = new Veiculo();
        $veiculo->setId($idVeiculo);
        $cliente->setVeiculo($veiculo);
    }

    $locacao->setCliente($cliente);

    $locacaoCont = new LocacaoController();
    $clienteCont = new ClienteController();

    $erros = $locacaoCont->alterar($locacao);
    $errosCliente = $clienteCont->alterar($cliente);

    if (!$erros && !$errosCliente) {
        header("location: listar.php");
        exit;
    }
    $msgErros = implode("<br>", $erros);
} else {
    // Recebe o Id da Locacao por parâmetro GET
    $idLocacao = 0;
    if (isset($_GET['id'])) {
        $idLocacao = $_GET['id'];
    };

    $locacaoCont = new LocacaoController();

    $locacao = $locacaoCont->buscarPorId($idLocacao);
    if (!$locacao) {
        echo " Locacao não encontrado!<br>";
        echo "<a href='listar.php'>Voltar</a>";
        exit;
    }
};

include_once(__DIR__ . "/form.php");
