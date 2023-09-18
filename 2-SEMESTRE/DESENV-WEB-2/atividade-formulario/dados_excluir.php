<?php

function searchDataWithFileName($fileName)
{
    $data = [];
    define("DIR_PERSISTENCIA", "data/$fileName");

    if (file_exists(DIR_PERSISTENCIA)) {
        $dataFiles = file_get_contents(DIR_PERSISTENCIA);
        $data = json_decode($dataFiles, true);
    }

    return $data;
}

$id = isset($_GET['id']) ? $_GET['id'] : null;
$fileName = isset($_GET['file_name']) ? $_GET['file_name'] : null;

if (!$id || !$fileName) {
    echo "ID ou nome do arquivo não encontrado!<br>";
    echo "<a href='formulario.php'>Voltar</a>";
    exit;
}

$data = searchDataWithFileName($fileName);

// Busca, recuperando seu ID
$index = -1;
for ($i = 0; $i < count($data); $i++) {
    if ($data[$i]['id'] == $id) {
        $index = $i;
        break;
    }
}

if ($index < 0) {
    echo "ID não encontrado!<br>";
    echo "<a href='formulario.php'>Voltar</a>";
    exit;
}

// Exclui o livro do array
array_splice($data, $index, 1);

// Salva os dados atualizados no arquivo
file_put_contents(DIR_PERSISTENCIA, json_encode($data));

// Redireciona novamente para o formulário/listagem
header("Location: formulario.php");
exit;
