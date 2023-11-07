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

    }
    private function mapDBToObject(array  $result)
    {
        $clients = array();
        foreach ($result as $l) {
        
            $client = new Cliente();
            $client->setId($l['id_cliente']);
            $client->setNome($l['nome_cliente']);
            $client->setCpf($l['cpf_cliente']);

            $vehicle = new Veiculo();
            $vehicle->setId($l['id_veiculo']);
            $vehicle->setCategoria($l['categoria_veiculo']);
            $vehicle->setModelo($l['modelo_veiculo']);
            $vehicle->setMarca($l['marca_veiculo']);

            $client->setVeiculo($vehicle);


            array_push($clients, $client);
        }
        return $clients;
    }
}
