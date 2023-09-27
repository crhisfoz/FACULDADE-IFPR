<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);

include_once("Connection.php");

function insertData()
{
    $conn = Connection::getConnection();
    if (isset($_GET['descricao']) && isset($_GET['un_medida'])) {

        $description = $_GET['descricao'];
        $unitOfMeasure = $_GET['un_medida'];

        $sql = "INSERT INTO produtos(descricao, un_medida) VALUES (?,?)";
        $stm = $conn->prepare($sql);
        $stm->execute([$description, $unitOfMeasure]);
        echo "Dados inseridos com sucesso";
    }else{
        $missing = array();
        if (!isset($_GET['descricao'])) {
            $missing[] = "descricao";
        }
        if (!isset($_GET['un_medida'])) {
            $missing[] = "un_medida";
        }
        echo "Os Seguintes Parâmetros estão faltando: " . implode(", ", $missing);

    }
}

insertData();
