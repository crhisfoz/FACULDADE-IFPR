<?php
//Controller para o modelo de Aluno
include_once(__DIR__ . "/dao/AlunoDAO.php");

class AlunoControler{
    private ALunoDAO $alunoDAO;

    public function __construct(){
    $this->alunoDAO = new ALunoDAO();
        
    }

    public function listar(){

        return $this->alunoDAO->list();

    }

}