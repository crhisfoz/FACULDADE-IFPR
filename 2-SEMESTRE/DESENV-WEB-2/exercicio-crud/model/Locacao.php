<?php
include_once(__DIR__ . "/./Veiculo.php");
include_once(__DIR__ . "/./Cliente.php");
class Locacao{
    private ? int $id;
    private ? array $cliente;

    public function __construct(array $cliente)
    {
        $this->cliente = $cliente;
    }


    /**
     * Get the value of cliente
     */ 
    public function getCliente()
    {
        return $this->cliente;
    }

    /**
     * Set the value of cliente
     *
     * @return  self
     */ 
    public function setCliente($cliente)
    {
        $this->cliente = $cliente;

        return $this;
    }
}
?> 