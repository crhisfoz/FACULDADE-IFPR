<?php
//Controller para o modelo de Aluno
include_once(__DIR__ . "/../dao/AlunoDAO.php");
include_once(__DIR__ . "/../model/Aluno.php");
include_once(__DIR__ . "/../service/AlunoService.php");

class AlunoControler
{
    private ALunoDAO $alunoDAO;
    private AlunoService $alunoService;

    public function __construct()
    {
        $this->alunoDAO = new ALunoDAO();
        $this->alunoService = new AlunoService();
    }

    public function listar()
    {

        return $this->alunoDAO->list();
    }

    public function inserir(Aluno $aluno)
    {
        $erros = $this->alunoService->validarDados($aluno);
        if ($erros)
            return $erros;

        $this->alunoDAO->insert($aluno);
        return array();
    }

    public function alterar(Aluno $aluno)
    {
        $erros = $this->alunoService->validarDados($aluno);
        if ($erros)
            return $erros;

        $this->alunoDAO->update($aluno);
        return array();
    }

    public function buscarPorId(int $id){
        return $this->alunoDAO->findById($id);
        
    }

    public function excluirPorId(int $id){
        $this->alunoDAO->deleteById($id);
        
    }
}
