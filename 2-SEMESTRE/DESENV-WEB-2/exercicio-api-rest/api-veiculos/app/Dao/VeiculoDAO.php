<?php

namespace App\Dao;

use App\Util\Connection;
use App\Mapper\VeiculoMapper;
use App\Model\Veiculo;

use \Exception;

class VeiculoDAO {

    private $conn;
    private $veiculoMapper;

    public function __construct() {
        $this->conn = Connection::getConnection();
        $this->veiculoMapper = new VeiculoMapper();
    }

    public function list() {
        $sql = 'SELECT * FROM veiculos_api ORDER BY id';

        $stmt = $this->conn->prepare($sql);
        $stmt->execute();
        $result = $stmt->fetchAll();

        return $this->veiculoMapper->mapFromDatabaseArrayToObjectArray($result);
    }

    public function findById(int $id) {
        $sql = 'SELECT * FROM veiculos_api WHERE id = :id';

        $stmt = $this->conn->prepare($sql);
        $stmt->bindValue("id", $id);
        $stmt->execute();
        $result = $stmt->fetchAll();

        $arrayObj = $this->veiculoMapper->mapFromDatabaseArrayToObjectArray($result);

        if(count($arrayObj) == 0)
            return null;
        else if(count($arrayObj) > 1)
            new Exception("Mais de um registro encontrado para o ID " . $id);
        else
            return $arrayObj[0];
    }

    public function insert(Veiculo $veiculo) {
        $sql = 'INSERT INTO veiculos_api (modelo, marca, categoria, potencia, cambio, cor) VALUES (:modelo, :marca, :categoria, :potencia, :cambio, :cor)';

        $stmt = $this->conn->prepare($sql);
        $stmt->bindValue("modelo", $veiculo->getModelo());
        $stmt->bindValue("marca", $veiculo->getMarca());
        $stmt->bindValue("categoria", $veiculo->getCategoria());
        $stmt->bindValue("potencia",
        $veiculo->getPotencia());
        $stmt->bindValue("cambio",
        $veiculo->getCambio());
        $stmt->bindValue("cor",
        $veiculo->getCor());
        $stmt->execute();

        $id = $this->conn->lastInsertId();
        $veiculo->setId($id);
        return $veiculo;
    }

    public function update(Veiculo $veiculo) {
        $sql = 'UPDATE veiculos_api SET modelo = :modelo, marca = :marca, categoria = :categoria, potencia = :potencia, cambio = :cambio, cor = :cor WHERE id = :id';

        $stmt = $this->conn->prepare($sql);
        $stmt->bindValue("modelo", $veiculo->getModelo());
        $stmt->bindValue("marca", $veiculo->getMarca());
        $stmt->bindValue("categoria", $veiculo->getCategoria());
        $stmt->bindValue("potencia",
        $veiculo->getPotencia());
        $stmt->bindValue("cambio",
        $veiculo->getCambio());
        $stmt->bindValue("cor",
        $veiculo->getCor());
        $stmt->execute();

        return $veiculo;
    }

    public function deleteById(int $id) {
        $sql = 'DELETE FROM veiculos_api WHERE id = :id';

        $stmt = $this->conn->prepare($sql);
        $stmt->bindValue("id", $id);
        $stmt->execute();
    }

}