<?php

namespace App\Service;

use App\Model\Veiculo;

class VeiculoService
{

    public function validar(Veiculo $veiculo)
    {
        if (!$veiculo->getModelo())
            return "O campo Modelo é obrigatório.";

        if (!$veiculo->getMarca())
            return "O campo Marca é obrigatório.";

        if (!$veiculo->getCategoria())
            return "O campo Categoria é obrigatório.";

        if (!$veiculo->getPotencia())
            return "O campo Potência é obrigatório.";

        if (!$veiculo->getCambio())
            return "O campo Câmbio é obrigatório.";

        if (!$veiculo->getCor())
            return "O campo Cor é obrigatório.";

        return null;
    }
}
