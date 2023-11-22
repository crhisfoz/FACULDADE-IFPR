<?php
include_once(__DIR__ . "/../model/Cliente.php");

class ClienteService{
    
    public function validarDados(Cliente $cliente){
        $erros = array();
        if(! $cliente->getNome()){
            array_push($erros, "Informe o Nome!");
        }
        if(! $cliente->getCpf()){
            array_push($erros, "Informe o CPF!");
        }
        if(!$cliente->getVeiculo()){
            array_push($erros, "Informe o Veículo!");
        }

        return $erros;
    }

}

