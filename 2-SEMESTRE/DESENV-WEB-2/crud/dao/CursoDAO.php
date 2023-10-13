<?php
//Classe DAO para curso
include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__ . "/../model/Curso.php");


class CursoDAO
{
    public function list()
    {
        $conn = Connection::getConnection();
        $sql = "SELECT * FROM Cursos ORDER BY nome";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }

    private function mapDBToObject(array  $result)
    {
        $cursos = array();
        foreach ($result as $c) {
            $curso = new Curso();
            $curso->setId($c['id']);
            $curso->setNome($c['nome']);
            $curso->setTurno($c['turno']);
            array_push($cursos, $curso);
        }
        return $cursos;
    }
}
