<?php
include_once(__DIR__ . "/../model/Locacao.php");

class LocacaoService{
    
    public function validarDados(Locacao $locacao){
        $erros = array();
        if(! $locacao->getlocal()){
            array_push($erros, "Informe um local para retirada!");
        }
        if(! $locacao->getData()){
            array_push($erros, "Informe uma Data para retirada!");
        }
        if(! $locacao->getHora()){
            array_push($erros, "Informe a hora da retirada!");
        }

        return $erros;
    }

}
