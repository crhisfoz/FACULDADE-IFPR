<?php

namespace App\Mapper;

use App\Model\Veiculo;

class VeiculoMapper
{

    public function mapFromDatabaseArrayToObjectArray($regArray)
    {
        $arrayObj = array();

        foreach ($regArray as $reg) {
            $regObj = $this->mapFromDatabaseToObject($reg);
            array_push($arrayObj, $regObj);
        }

        return $arrayObj;
    }

    public function mapFromDatabaseToObject($regDatabase)
    {
        $obj = new Veiculo();
        if (isset($regDatabase['id']))
            $obj->setId($regDatabase['id']);

        if (isset($regDatabase['modelo']))
            $obj->setModelo($regDatabase['modelo']);

        if (isset($regDatabase['marca']))
            $obj->setMarca($regDatabase['marca']);

        if (isset($regDatabase['categoria']))
            $obj->setCategoria($regDatabase['categoria']);

        if (isset($regDatabase['potencia']))
            $obj->setPotencia($regDatabase['potencia']);

        if (isset($regDatabase['cambio']))
            $obj->setCambio($regDatabase['cambio']);

        if (isset($regDatabase['cor']))
            $obj->setCor($regDatabase['cor']);

        return $obj;
    }

    public function mapFromJsonToObject($regJson)
    {
        //Reaproveita o método
        return $this->mapFromDatabaseToObject($regJson);
    }
}
