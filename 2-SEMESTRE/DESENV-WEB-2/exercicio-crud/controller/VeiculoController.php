<?php
//Controller para o modelo de Veiculo
include_once(__DIR__ . "/../dao/VeiculoDAO.php");
include_once(__DIR__ . "/../model/Veiculo.php");

class VeiculoController
{
    private VeiculoDAO $veiculoDAO;
    
    public function __construct()
    {
        $this->veiculoDAO = new VeiculoDAO();
    }

    
    public function listar()
    {

        return $this->veiculoDAO->list();
    }
}

