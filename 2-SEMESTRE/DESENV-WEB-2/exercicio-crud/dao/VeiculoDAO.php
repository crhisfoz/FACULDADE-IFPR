<?php
//Classe DAO para students
include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__. "/../model/Veiculo.php");


class VeiculoDAO
{

    public function list(){
        $conn = Connection::getConnection();
        $sql = "SELECT* from veiculos";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }

    
    public function update(Veiculo $veiculo){
        $conn = Connection::getConnection();
        $sql = "UPDATE veiculos  SET local = ?, data = ?, hora = ?, id_cliente = ? WHERE id = ? " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($locacao->getLocal(), $locacao->getData(), $locacao->getHora(), $locacao->getCliente()->getId(), $locacao->getId()));

    }

    private function mapDBToObject(array  $result){
        $cars = array();
        foreach($result as $r){
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