<?php

include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__ . "/../model/Cliente.php");
include_once(__DIR__ . "/../model/Veiculo.php");

class ClienteDAO
{
    public function list()
    {
        $conn = Connection::getConnection();
        $sql = "SELECT * FROM clientes ORDER BY nome ASC";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }

    public function insert(Cliente $cliente)
    {
        $conn = Connection::getConnection();
        $sql = "INSERT INTO clientes (nome, cpf, id_veiculo)" . " VALUES(?, ?, ?) ";
        $stm = $conn->prepare($sql);
        $stm->execute(array($cliente->getNome(), $cliente->getCpf(), $cliente->getVeiculo()->getId()));
        return $conn->lastInsertId();
    }

    public function update(Cliente $cliente)
    {
        $conn = Connection::getConnection();
        $sql = "UPDATE clientes SET id_veiculo = ?
        WHERE id = ?" ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($cliente->getVeiculo()->getId(), $cliente->getId()));
    }

    public function findById($id)
    {
        $conn = Connection::getConnection();
        $sql = "SELECT * FROM clientes 
        WHERE clientes.id = ? 
        ORDER BY nome ASC";

        $stm = $conn->prepare($sql);
        $stm->execute([$id]);
        $result = $stm->fetchAll();
        $this->mapDBToObject($result);
        $clientes = $this->mapDBToObject($result);
        if ($clientes) {
            return $clientes[0];
        } else {
            return null;
        }
    }

    public function deleteById(int $id)
    {
        $conn = Connection::getConnection();
        $sql = "DELETE FROM clientes WHERE clientes.id = ? ";
        $stm = $conn->prepare($sql);
        $stm->execute([$id]);
    }

    private function mapDBToObject(array  $result)
    {
        $clients = array();

        foreach ($result as $l) {

            $client = new Cliente();
            $client->setId($l['id']);
            $client->setNome($l['nome']);
            $client->setCpf($l['cpf']);

            $vehicle = new Veiculo();
            $vehicle->setId($l['id_veiculo']);
            $client->setVeiculo($vehicle);
            array_push($clients, $client);
        }
        return $clients;
    }
}
