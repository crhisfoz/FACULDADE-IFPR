<?php
include_once(__DIR__ . "/../dao/ClienteDAO.php");
include_once(__DIR__ . "/../model/cliente.php");
include_once(__DIR__ . "/../service/ClienteService.php");

class ClienteController
{
    private ClienteDAO $clienteDAO;
    private ClienteService $clienteService;

    public function __construct()
    {
        $this->clienteDAO = new ClienteDAO();
        $this->clienteService = new ClienteService();
    }

    public function listar()
    {
        return $this->clienteDAO->list();
    }

    public function inserir(Cliente $cliente)
    {
        $erros = $this->clienteService->validarDados($cliente);
        if ($erros)
            return $erros;

        $this->clienteDAO->insert($cliente);
        return array();
    }

    public function buscarPorId(int $id){
        return $this->clienteDAO->findById($id);
        
    }

    public function alterar(Cliente $cliente)
    {
        $this->clienteDAO->update($cliente);
        return array();
    }

    public function excluirPorId(int $id){
        return $this->clienteDAO->deleteById($id);
        
    }

}
