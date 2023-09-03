<?php
function exibirProgressaoAritmetica() {
    // Verifica se todos os parâmetros foram fornecidos via GET
    if (isset($_GET['inicio']) && isset($_GET['razao']) && isset($_GET['quantidade'])) {
        // Obtém os parâmetros do GET
        $inicio = intval($_GET['inicio']);
        $razao = intval($_GET['razao']);
        $quantidade = intval($_GET['quantidade']);
        
        // Inicializa um array para armazenar os termos da progressão
        $progressao = array();
        
        // Calcula e armazena os termos da progressão
        for ($i = 0; $i < $quantidade; $i++) {
            $termo = $inicio + ($i * $razao);
            $progressao[] = $termo;
        }
        
        // Exibe a progressão aritmética
        echo "Progressão Aritmética: " . implode(", ", $progressao);
    } else {
        // Informa quais parâmetros não foram fornecidos
        $faltando = array();
        if (!isset($_GET['inicio'])) {
            $faltando[] = "inicio";
        }
        if (!isset($_GET['razao'])) {
            $faltando[] = "razao";
        }
        if (!isset($_GET['quantidade'])) {
            $faltando[] = "quantidade";
        }
        
        // Exibe a mensagem de erro
        echo "Os Seguintes Parâmetros estão faltando: " . implode(", ", $faltando);
    }
}

exibirProgressaoAritmetica();
?>
