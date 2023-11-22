<?php
include_once(__DIR__ . "/../dao/LocacaoDAO.php");
include_once(__DIR__ . "/../model/Locacao.php");
include_once(__DIR__ . "/../dao/ClienteDAO.php");
include_once(__DIR__ . "/../service/LocacaoService.php");
include_once(__DIR__ . "/../service/ClienteService.php");


class LocacaoController
{
    private LocacaoDAO $locacaoDAO;
    private LocacaoService $locacaoService;
    private ClienteDAO $clienteDAO;
    private ClienteService $clienteService;

    public function __construct()
    {
        $this->locacaoDAO = new LocacaoDAO();
        $this->clienteDAO = new ClienteDAO();
        $this->locacaoService = new LocacaoService();
        $this->clienteService = new ClienteService();

    }

    public function listar()
    {
        return $this->locacaoDAO->list();
    }

    public function inserir(Locacao $locacao)
    {
        $erros = $this->locacaoService->validarDados($locacao);
        $erros= array_merge($erros, $this->clienteService->validarDados($locacao->getCliente()));
        if ($erros)
            return $erros;

        //Chamar o clienteDAO
        $idCliente = $this->clienteDAO->insert($locacao->getCliente());
        $this->locacaoDAO->insert($locacao, $idCliente);
        return array();
    }

    public function buscarPorId(int $id){
        return $this->locacaoDAO->findById($id);
        
    }

    public function excluirPorId(int $id){
        $this->locacaoDAO->deleteById($id);
        
    }

    public function alterar(Locacao $locacao)
    {
        $erros = $this->locacaoService->validarDados($locacao);
        if ($erros)
            return $erros;

        $this->locacaoDAO->update($locacao);
        return array();
    }
}
