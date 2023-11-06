<?php
//Controller para o modelo de Veiculo
include_once(__DIR__ . "/../dao/VeiculoDAO.php");
include_once(__DIR__ . "/../model/Veiculo.php");
include_once(__DIR__ . "/../service/VeiculoService.php");

class VeiculoController
{
    private VeiculoDAO $veiculoDAO;
    private VeiculoService $veiculoService;
    
    public function __construct()
    {
        $this->veiculoDAO = new VeiculoDAO();
        $this->veiculoService = new VeiculoService();
    }

    
    public function listar()
    {

        return $this->veiculoDAO->list();
    }
}

