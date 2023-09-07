<?php
class Pessoa{
    private $nome;
    private $sobrenome;

    //construtor
    public function __construct($nome="", $sobrenome=""){
        $this->nome= $nome;
        $this->sobrenome = $sobrenome;
    }

    public function getNomeCompleto(){
        return $this->nome . " " . $this ->sobrenome;
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
     * Get the value of sobrenome
     */ 
    public function getSobrenome()
    {
        return $this->sobrenome;
    }

    /**
     * Set the value of sobrenome
     *
     * @return  self
     */ 
    public function setSobrenome($sobrenome)
    {
        $this->sobrenome = $sobrenome;

        return $this;
    }
}



//script principal
$pessoa1 = new Pessoa();
$pessoa1 -> setNome("Daniel");
$pessoa1 -> setSobrenome("Di Domenico");
echo $pessoa1->getNomeCompleto();
echo "<br>";

$pessoa2 = new Pessoa();
$pessoa2->setNome("Isa")
        ->setSobrenome("Oliveira");
        echo $pessoa2->getNomeCompleto();
        echo "<br>";

$pessoa3 = new Pessoa("Neymar", "da Silva");
echo $pessoa3->getNome();
echo $pessoa3->getNomeCompleto();
 