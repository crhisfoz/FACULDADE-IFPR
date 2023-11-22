<?php

include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__ . "/../model/Veiculo.php");

class VeiculoDAO
{

    public function list()
    {
        $conn = Connection::getConnection();
        $sql = "SELECT* from veiculos";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }

    private function mapDBToObject(array  $result)
    {
        $cars = array();
        foreach ($result as $r) {
            $car = new Veiculo();
            $car->setId($r['id']);
            $car->setModelo($r['modelo']);
            $car->setCategoria($r['categoria']);
            $car->setMarca($r['marca']);
            array_push($cars, $car);
        }
        return $cars;
    }
}
