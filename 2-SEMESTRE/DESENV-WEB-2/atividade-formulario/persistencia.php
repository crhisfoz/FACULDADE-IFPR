<?php
ini_set('display_errors', 1);
error_reporting(E_ALL);

define("DIR_PERSISTENCIA", "data");

if ($_SERVER["REQUEST_METHOD"] === "POST") {
    $submitValue = isset($_POST['submit']) ? $_POST['submit'] : '';
    $data = [];

    switch ($submitValue) {
        case 'C':
            $data['id'] = uniqid();
            $data['MARCA'] = trim($_POST['mark']);
            $data['MODELO'] = trim($_POST['model']);
            $data['PLACA'] = trim($_POST['plate']);
            $data['COR'] = trim($_POST['color']);
            $filename = DIR_PERSISTENCIA . "/cars.json";
            break;
        case 'G':
            $data['id'] = uniqid();
            $data['NOME'] = trim($_POST['title']);
            $data['ESTILO'] = trim($_POST['style']);
            $data['MULTIPLAYER'] = isset($_POST['mult']) ? $_POST['mult'] : null;
            $filename = DIR_PERSISTENCIA . "/games.json";
            break;
        case 'PD':
            $data['id'] = uniqid();
            $data['NOME'] = trim($_POST['productName']);
            $data['PRECO'] = trim($_POST['productPrice']);
            $filename = DIR_PERSISTENCIA . "/products.json";
            break;
        case 'P':
            $data['id'] = uniqid();
            $data['NOME'] = trim($_POST['personName']);
            $data['CPF'] = trim($_POST['cpf']);
            $data['EMAIL'] = trim($_POST['email']);
            $filename = DIR_PERSISTENCIA . "/persons.json";
            break;
        case 'PT':
            $data['id'] = uniqid();
            $data['NOME'] = trim($_POST['touristName']);
            $data['CIDADE'] = trim($_POST['city']);
            $filename = DIR_PERSISTENCIA . "/tourist_pts.json";
            break;
        case 'M':
            $data['id'] = uniqid();
            $data['NOME'] = trim($_POST['musicName']);
            $data['CANTOR/BANDA'] = trim($_POST['singer']);
            $data['ESTILO MUSICAL'] = isset($_POST['musicType']) ? $_POST['musicType'] : null;
            $filename = DIR_PERSISTENCIA . "/musics.json";
            break;
        default:
            echo "Opção desconhecida.";
            exit;
    }


    if (file_exists($filename)) {
        $existingData = json_decode(file_get_contents($filename), true);
    } else {
        $existingData = [];
    }

    // Adiciona os novos dados aos dados existentes
    $existingData[] = $data;

    // Salva os dados atualizados de volta no arquivo
    file_put_contents($filename, json_encode($existingData));
    echo json_encode(["success" => "Dados salvos com sucesso em $filename"]);
} else {
    echo "NAO FOI ENVIADO";
}
