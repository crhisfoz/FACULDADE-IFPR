<?php
//Classe DAO para students
include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__. "/../model/Aluno.php");

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

    public function findById($id){
        $conn = Connection::getConnection();
        $sql = "SELECT a. *, c.nome AS nome_curso FROM alunos as a" .
        " JOIN cursos as c ON (c.id = a.id_curso)" .
        " WHERE a.id = ? " .
        " ORDER BY a.nome"
        ;

        $stm = $conn->prepare($sql);
        $stm->execute([$id]);
        $result = $stm->fetchAll();
        $alunos = $this->mapDBToObject($result);
        if($alunos){
            return $alunos[0];
        }else{
            return null;
        }
    }
    
    public function deleteById(int $id){
        $conn = Connection::getConnection();

        $sql = "DELETE FROM alunos WHERE alunos.id = ? ";
        $stm = $conn->prepare($sql);
        $stm->execute([$id]);

    }

    public function insert(Aluno $aluno){
        $conn = Connection::getConnection();
        $sql = "INSERT INTO alunos (nome, idade, estrangeiro, id_curso)" . " VALUES(?, ?, ?, ?) " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($aluno->getNome(), $aluno->getIdade(), $aluno->getEstrangeiro(), $aluno->getCurso()->getId()));

    }

    public function update(Aluno $aluno){
        $conn = Connection::getConnection();
        $sql = "UPDATE alunos  SET nome = ?, idade = ?, estrangeiro = ?, id_curso = ? WHERE id = ? " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($aluno->getNome(), $aluno->getIdade(), $aluno->getEstrangeiro(), $aluno->getCurso()->getId(), $aluno->getId()));

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