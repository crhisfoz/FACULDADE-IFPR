<?php
//Classe DAO para students
include_once(__DIR__ . "/../../util/Connection.php");
include_once(__DIR__. "/../../model/Aluno.php");

class AlunoDAO{

    public function list(){
        $conn = Connection::getConnection();
        $sql = "SELECT a. *, c.nome AS nome_curso FROM alunos as a" .
        " JOIN cursos as c ON (c.id = a.id_curso)";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }

    public function insert(Aluno $aluno){
        $conn = Connection::getConnection();
        $sql = "INSERT INTO alunos (nome, idade, estrangeiro, id_curso)" . " VALUES(?, ?, ?, ?) " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($aluno->getNome(), $aluno->getIdade(), $aluno->getEstrangeiro(), $aluno->getCurso()->getId()));


    }

    private function mapDBToObject(array  $result){
        $students = array();
        foreach($result as $r){
            $student = new Aluno();
            $student->setId($r['id']);
            $student->setNome($r['nome']);
            $student->setIdade($r['idade']);
            $student->setEstrangeiro($r['estrangeiro']);  
            
            $course = new Curso();
            $course->setId($r['id_curso']);
            $course->setNome($r['nome_curso']);
            $student->setCurso($course);
            array_push($students, $student);
        }

        return $students;

    }

}