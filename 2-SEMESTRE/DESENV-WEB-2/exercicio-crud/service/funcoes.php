<?php

function extrairCategoriasMarcasUnicas($categoriasMarcas, $tipo)
{
    $valoresUnicos = array();
    foreach ($categoriasMarcas as $item) {
        $valor = $item[$tipo];
        if (!in_array($valor, $valoresUnicos)) {
            $valoresUnicos[] = $valor;
        }
    }
    return $valoresUnicos;
}
?>
