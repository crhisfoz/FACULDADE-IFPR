<?php

include_once("Connection.php");

$conn = Connection::getConnection();

$sql = "INSERT INTO times(nome,cidade) VALUES (?,?)";
$stm = $coon->prepare($sql);
$stm->execute(["São Paulo", "São Paulo"]);