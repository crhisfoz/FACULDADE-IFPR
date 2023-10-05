<?php
//Controller para o modelo de Aluno
include_once(__DIR__ . "/../dao/AlunoDAO.php");
include_once(__DIR__. "/../model/Aluno.php");
include_once(__DIR__. "/../service/AlunoService.php");

class AlunoControler{
    private ALunoDAO $alunoDAO;
    private AlunoService $alunoService;

    public function __construct(){
    $this->alunoDAO = new ALunoDAO();
    $this->alunoDAO = new AlunoService();
    
        
    }

    public function listar(){

        return $this->alunoDAO->list();

    }

    public function inserir(Aluno $aluno){
        $erros = $this->alunoService->validarDados($aluno);
        return $erros;
        $this->alunoDAO->insert($aluno);     

    }

}