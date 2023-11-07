<?php
//Classe DAO para curso
include_once(__DIR__ . "/../util/Connection.php");
include_once(__DIR__ . "/../model/Locacao.php");
include_once(__DIR__ . "/../model/Cliente.php");
include_once(__DIR__ . "/../model/Veiculo.php");



class LocacaoDAO
{
    public function list()
    {
        $conn = Connection::getConnection();
        $sql = "SELECT * FROM locacao ORDER BY data";
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }
    
    public function insert(Locacao $locacao){
        $conn = Connection::getConnection();
        $sql = "INSERT INTO locacao (local, data, hora, id_cliente)" . " VALUES(?, ?, ?, ?) " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($locacao->getLocal(), $locacao->getData(), $locacao->getHora(), $locacao->getCliente()->getId()));

    }
    
    private function mapDBToObject(array  $result)
    {
        $locations = array();
        foreach ($result as $l) {
            $location = new Locacao();
            $location->setId($l['id']);
            $location->setLocal($l['local']);
            $location->setData($l['data']);
            $location->setHora($l['hora']);

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

            $location->setCliente($client);

            array_push($locations, $location);
        }
        return $locations;
    }
}
