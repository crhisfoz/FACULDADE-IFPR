<?php
include_once(__DIR__ . "/./Veiculo.php");

class Cliente{
    private ?string $id;
    private ?string $nome;
    private ?string $cpf;
    private ?Veiculo $veiculo;

    public function __construct()
    {
        $this->veiculo = null;
    }

    public function __toString()
    {
        return $this->nome;
    }
    
    
    /**
     * Get the value of id
     */ 
    public function getId()
    {
        return $this->id;
    }

    /**
     * Set the value of id
     *
     * @return  self
     */ 
    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }

    /**
     * Get the value of nome
     */ 
    public function getNome()
    {
        return $this->nome;
    }

    /**
     * Set the value of nome
     *
     * @return  self
     */ 
    public function setNome($nome)
    {
        $this->nome = $nome;

        return $this;
    }

    /**
     * Get the value of cpf
     */ 
    public function getCpf()
    {
        return $this->cpf;
    }

    /**
     * Set the value of cpf
     *
     * @return  self
     */ 
    public function setCpf($cpf)
    {
        $this->cpf = $cpf;

        return $this;
    }

    /**
     * Get the value of veiculo
     */ 
    public function getVeiculo()
    {
        return $this->veiculo;
    }

    /**
     * Set the value of veiculo
     *
     * @return  self
     */ 
    public function setVeiculo($veiculo)
    {
        $this->veiculo = $veiculo;

        return $this;
    }

}
?>