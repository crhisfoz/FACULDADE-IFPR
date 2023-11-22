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
        $sql = "SELECT loc.*, c.nome as nome_cliente, c.cpf as cpf_cliente, c.id_veiculo, v.categoria, v.marca, v.modelo 
        FROM locacao as loc
        join clientes as c on c.id = loc.id_cliente
        join veiculos as v on v.id = c.id_veiculo
        ORDER BY data   
        "
        ;
        $stm = $conn->prepare($sql);
        $stm->execute();
        $result = $stm->fetchAll();
        return $this->mapDBToObject($result);
    }
    
    public function insert(Locacao $locacao, $idCLiente){
        $conn = Connection::getConnection();
        $sql = "INSERT INTO locacao (local, data, hora, id_cliente)" . " VALUES(?, ?, ?, ?) " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($locacao->getLocal(), $locacao->getData(), $locacao->getHora(), $idCLiente));

    }

    public function findById($id){
        $conn = Connection::getConnection();
        $sql = "SELECT loc.*, c.nome as nome_cliente, c.cpf as cpf_cliente, c.id_veiculo, v.categoria, v.marca, v.modelo 
        FROM locacao as loc
        join clientes as c on c.id = loc.id_cliente
        join veiculos as v on v.id = c.id_veiculo
        WHERE loc.id = ?
        ORDER BY data   ";
        $stm = $conn->prepare($sql);
        $stm->execute([$id]);
        $result = $stm->fetchAll();
        $locacoes = $this->mapDBToObject($result);
        if($locacoes){
            return $locacoes[0];
        }else{
            return null;
        }
    }
    
    public function deleteById(int $id){
        $conn = Connection::getConnection();

        $sql = "DELETE FROM locacao WHERE locacao.id = ? ";
        $stm = $conn->prepare($sql);
        $stm->execute([$id]);

    }

    public function update(Locacao $locacao){
        $conn = Connection::getConnection();
        $sql = "UPDATE locacao  SET local = ?, data = ?, hora = ?, id_cliente = ? WHERE id = ? " ;
        $stm = $conn->prepare($sql);
        $stm->execute(array($locacao->getLocal(), $locacao->getData(), $locacao->getHora(), $locacao->getCliente()->getId(), $locacao->getId()));

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
            $vehicle->setCategoria($l['categoria']);
            $vehicle->setModelo($l['modelo']);
            $vehicle->setMarca($l['marca']);

            $client->setVeiculo($vehicle);

            $location->setCliente($client);

            array_push($locations, $location);
        }
        return $locations;
    }
}
