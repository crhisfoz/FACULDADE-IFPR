<?php
include_once(__DIR__ . "/../dao/LocacaoDAO.php");
include_once(__DIR__ . "/../model/Locacao.php");
include_once(__DIR__ . "/../service/LocacaoService.php");

class LocacaoController
{
    private LocacaoDAO $locacaoDAO;
    private LocacaoService $locacaoService;

    public function __construct()
    {
        $this->locacaoDAO = new LocacaoDAO();
        $this->locacaoService = new LocacaoService();
    }

    public function listar()
    {
        return $this->locacaoDAO->list();
    }

    public function inserir(Locacao $locacao)
    {
        $erros = $this->locacaoService->validarDados($locacao);
        if ($erros)
            return $erros;

        $this->locacaoDAO->insert($locacao);
        return array();
    }
}
