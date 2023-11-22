<?php
//Classe DAO para curso
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
    
    public function insert(Cliente $cliente){
        $conn = Connection::getConnection();
        $sql = "INSERT INTO clientes (nome, cpf, id_veiculo)" . " VALUES(?, ?, ?) " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($cliente->getNome(), $cliente->getCpf(), $cliente->getVeiculo()->getId()));
        return $conn->lastInsertId();

    }

      
    public function update(Cliente $cliente){
        $conn = Connection::getConnection();
        $sql = "UPDATE clientes SET nome = ?, cpf = ?, id_veiculo = ?)";
        $stm = $conn->prepare($sql);
        $stm->execute(array($cliente->getNome(), $cliente->getCpf(), $cliente->getVeiculo()->getId()));

    }

    
    public function findById($id){
        $conn = Connection::getConnection();
        $sql = "SELECT * FROM clientes 
        WHERE clientes.id = ? 
        ORDER BY nome ASC";

        $stm = $conn->prepare($sql);
        $stm->execute([$id]);
        $result = $stm->fetchAll();
        $this->mapDBToObject($result);
        $clientes = $this->mapDBToObject($result);
        if($clientes){
            return $clientes[0];
        }else{
            return null;
        }
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
            //$vehicle->setCategoria($l['categoria']);
           // $vehicle->setModelo($l['modelo']);
           // $vehicle->setMarca($l['marca']);

            $client->setVeiculo($vehicle);
            array_push($clients, $client);
        }
        return $clients;
    }
}
