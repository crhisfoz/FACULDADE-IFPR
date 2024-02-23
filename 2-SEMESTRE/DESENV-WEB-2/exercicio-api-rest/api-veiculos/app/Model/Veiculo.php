<?php

namespace App\Model;

use \JsonSerializable;

class Veiculo implements JsonSerializable
{

    private ?int $id;
    private ?string $modelo;
    private ?string $marca;
    private ?string $categoria;
    private ?string $potencia;
    private ?string $cambio;
    private ?string $cor;


    public function __construct()
    {
        $this->id = 0;
        $this->modelo = null;
        $this->marca = null;
        $this->categoria = null;
        $this->potencia = null;
        $this->cambio = null;
        $this->cor = null;
    }

    public function jsonSerialize(): array
    {
        return array(
            "id" => $this->id,
            "modelo" => $this->modelo,
            "marca" => $this->marca,
            "categoria" => $this->categoria,
            "potencia" => $this->potencia,
            "cambio" => $this->cambio,
            "cor" => $this->cor
        );
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
     * Get the value of modelo
     */
    public function getModelo()
    {
        return $this->modelo;
    }

    /**
     * Set the value of modelo
     *
     * @return  self
     */
    public function setModelo($modelo)
    {
        $this->modelo = $modelo;

        return $this;
    }

    /**
     * Get the value of marca
     */
    public function getMarca()
    {
        return $this->marca;
    }

    /**
     * Set the value of marca
     *
     * @return  self
     */
    public function setMarca($marca)
    {
        $this->marca = $marca;

        return $this;
    }

    /**
     * Get the value of categoria
     */
    public function getCategoria()
    {
        return $this->categoria;
    }

    /**
     * Set the value of categoria
     *
     * @return  self
     */
    public function setCategoria($categoria)
    {
        $this->categoria = $categoria;

        return $this;
    }

    /**
     * Get the value of potencia
     */
    public function getPotencia()
    {
        return $this->potencia;
    }

    /**
     * Set the value of potencia
     *
     * @return  self
     */
    public function setPotencia($potencia)
    {
        $this->potencia = $potencia;

        return $this;
    }

    /**
     * Get the value of cambio
     */
    public function getCambio()
    {
        return $this->cambio;
    }

    /**
     * Set the value of cambio
     *
     * @return  self
     */
    public function setCambio($cambio)
    {
        $this->cambio = $cambio;

        return $this;
    }

    /**
     * Get the value of cor
     */
    public function getCor()
    {
        return $this->cor;
    }

    /**
     * Set the value of cor
     *
     * @return  self
     */
    public function setCor($cor)
    {
        $this->cor = $cor;

        return $this;
    }
}
