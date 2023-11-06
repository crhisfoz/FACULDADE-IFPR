<?php 
include_once(__DIR__ . "/../model/Veiculo.php");

class VeiculoService{
    public function validarDados(Veiculo $veiculo){
        $erros = array();
        if(! $veiculo->getModelo()){
            array_push($erros, "Informe o Modelo!");
        }
        if(! $veiculo->getCategoria()){
            array_push($erros, "Informe a Categoria!");
        }
        if(! $veiculo->getMarca()){
            array_push($erros, "Informe a Marca!");
        }

        return $erros;
    }
}