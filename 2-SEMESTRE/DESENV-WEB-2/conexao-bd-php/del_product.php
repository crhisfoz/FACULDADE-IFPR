<?php
require_once("Connection.php");

$id = 0;

if(isset($_GET['id'])){
    $id = $_GET['id'];

    echo "chegou id" . $id;
    
    if(!$id){
        echo "ID inválido! <br>";
        echo "<a href='product_list.php'> Voltar</a>";
        exit;
    }

}
//Executar a exclusão no banco de dados
$conn = Connection::getConnection();

$sql = "DELETE FROM produtos WHERE id=? ";

$stm = $conn->prepare($sql);

$stm->execute([$id]);

header("location: product_list.php");