<?php
require_once("Connection.php");

$id = 0;

if(isset($_GET['id'])){
    $id = $_GET['id'];
    if(!$id){
        echo "ID inválido! <br>";
        echo "<a href='time_listar.php'> Voltar</a>";
        exit;
    }

}
//Executar a exclusão no banco de dados
$coon = Connection::getConnection();

$sql = "DELETE FROM times WHERE id=? ";

$stm = $conn->prepare($sql);

$stm->execute([$id]);

header("location: time_listar.php");