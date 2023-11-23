<?php
//DAO para curso

include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__ . "/../model/Curso.php");

class CursoDAO {

    public function list() {
        $conn = Connection::getConnection();

        $sql = "SELECT * FROM cursos ORDER BY nome";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        
        $cursos = $this->mapDBToObject($result);
        return $cursos;
    }

    private function mapDBToObject($result) {
        $cursos = array();
        foreach($result as $reg) {
            $curso = new Curso();
            $curso->setId($reg['id'])
                ->setNome($reg['nome'])
                ->setTurno($reg['turno']);
            array_push($cursos, $curso);
        }

        return $cursos;
    }

}
