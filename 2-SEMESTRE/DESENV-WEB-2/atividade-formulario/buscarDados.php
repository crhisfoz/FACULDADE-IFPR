<?php
function searchData() {
    if (isset($_POST['file_name'])) {
        $fileName = $_POST['file_name'];
        $data = [];
        define("DIR_PERSISTENCIA", "data/$fileName");

        if (file_exists(DIR_PERSISTENCIA)) {
            $dataFiles = file_get_contents(DIR_PERSISTENCIA);
            $data = json_decode($dataFiles, true);
        }

        return $data;
    }
    return [];
}

$result = searchData();
?>

<!DOCTYPE html>
<html>
<head>
    <title>Tabela de Dados</title>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin: 20px auto;
        }
        
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        
        th {
            background-color: #f2f2f2;
        }
        
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <?php
    if (!empty($result) && is_array($result)) {
    ?>
    <table border="1">
        <thead>
            <tr>
                <?php
                // Use a primeira entrada do array para criar os cabeçalhos da tabela
                $firstRow = reset($result);
                foreach (array_keys($firstRow) as $key) {
                    echo "<th>$key</th>";
                }
                ?>
            </tr>
        </thead>
        <tbody>
            <?php
            // Preencha a tabela com os dados
            foreach ($result as $row) {
                echo "<tr>";
                foreach ($row as $value) {
                    echo "<td>$value</td>";
                }
                echo "</tr>";
            }
            ?>
        </tbody>
    </table>
    <?php
    }
    ?>
</body>
</html>
