<?php
require_once("Connection.php");

$conn = Connection::getConnection();

$sql = "SELECT id, descricao, un_medida FROM produtos";
$sql = "SELECT * FROM produtos";

$stm = $conn->prepare($sql);
$stm->execute();

$result = $stm->fetchAll();

?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Produtos</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            padding: 8px; /* Defina o tamanho do preenchimento desejado */
            text-align: center;
        }
        
        th {
            background-color: #ccc; /* Cor de fundo para cabeçalho */
        }

        tr:nth-child(even) {
            background-color: #f2f2f2; /* Cor de fundo para linhas pares */
        }

        a {
            text-decoration: none;
        }
        
        /* Estilo para a linha do título */
        .title-row th {
            colspan: 4; /* Defina o colspan para ser maior que o número de colunas */
        }
    </style>
</head>

<body>
    <table border="1">
        <tr class="title-row">
            <th colspan="4">Lista de Produtos</th>
        </tr>
        <tr>
            <th>ID</th>
            <th>Descricao</th>
            <th>Unidade de Medida</th>
            <th></th> <!-- Célula extra para ajustar o colspan -->
        </tr>
        <?php foreach ($result as $r) : ?>
            <tr>
                <td><?= $r["id"] ?> </td>
                <td><?= $r["descricao"] ?> </td>
                <td><?= $r["un_medida"] ?> </td>
                <td><a href="del_product.php?id=<?=$r["id"]?>"
                onclick="return confirm('Deseja realmente excluir esse Produto');"> Excluir</a></td>
            </tr>
        <?php endforeach;  ?>
    </table>
</body>

</html>
