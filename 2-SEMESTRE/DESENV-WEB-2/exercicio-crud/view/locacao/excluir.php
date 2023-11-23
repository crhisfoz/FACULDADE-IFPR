<?php 

include_once(__DIR__ . "/../../model/Locacao.php");
include_once(__DIR__. "/../../controller/LocacaoController.php");
include_once(__DIR__. "/../../controller/ClienteController.php");

// Recebe o Id da Locacao por parâmetro GET
$idLocacao = 0;
if(isset($_GET['id'])){
    $idLocacao = $_GET['id'];
};

//Validar se a locacao com o ID recebido existe

$locacaoCont = new LocacaoController();
$locacao = $locacaoCont->buscarPorId($idLocacao);

if(!$locacao){
    echo " Locação não encontrada!<br>";
    echo "<a href='listar.php'>Voltar</a>";
    exit;
}

//Excluir a Locação 
$locacaoCont->excluirPorId($locacao->getId());
// excluir cliente que fez a locacao
$clienteCont = new ClienteController();
$clienteCont->excluirPorId($locacao->getCliente()->getId());

//Redireciona para o listar
header("location: listar.php");