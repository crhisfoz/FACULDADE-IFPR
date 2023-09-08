<?php
class Livro{
    private $titulo;
    private $autor;
    private $genero;
    private $qtdePag;

    
    public function __construct($t, $a, $g, $qp){
        $this->titulo = $t;
        $this->autor = $a;
        $this->genero = $g;
        $this->qtdePag = $qp;
    }


    /**
     * Get the value of titulo
     */ 
    public function getTitulo()
    {
        return $this->titulo;
    }

    /**
     * Set the value of titulo
     *
     * @return  self
     */ 
    public function setTitulo($titulo)
    {
        $this->titulo = $titulo;

        return $this;
    }

    /**
     * Get the value of genero
     */ 
    public function getGenero()
    {
        return $this->genero;
    }

    /**
     * Set the value of genero
     *
     * @return  self
     */ 
    public function setGenero($genero)
    {
        $this->genero = $genero;

        return $this;
    }

    /**
     * Set the value of autor
     *
     * @return  self
     */ 
    public function setAutor($autor)
    {
        $this->autor = $autor;

        return $this;
    }

    /**
     * Get the value of qtde_paginas
     */ 
    public function getQtde_pag()
    {
        return $this->qtdePag;
    }

    /**
     * Set the value of qtde_paginas
     *
     * @return  self
     */ 
    public function setQtde_pag($qtdePag)
    {
        $this->qtdePag = $qtdePag;

        return $this;
    }

    /**
     * Get the value of autor
     */ 
    public function getAutor()
    {
        return $this->autor;
    }
};
$livro1 = new Livro("Mogli", "Odair Jose", "Aventura", 2435);
$livro2 = new Livro("Saci Perere", "Monteiro Lobato", "Aventura", 3468);
$livro3 = new Livro("Turma da Monica", "Mauricio de Souza", "Aventura", 135);

$arrayLivro =  array($livro1, $livro2, $livro3);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="1">
     <tr>
     <th>Titulo</th>
     <th>Autor</th>
     <th>Genero</th>
     <th>Páginas</th>
    </tr>
    <?php foreach($arrayLivro as $l): ?>
        <tr>
            <td><?= $l->getTitulo(); ?> </td>
            <td><?= $l->getAutor(); ?> </td>
            <td><?= $l->getGenero(); ?> </td>
            <td><?= $l->getQtde_pag(); ?> </td>
        </tr>
    <?php endforeach; ?>

<tr>
</tr>
    
    </table>
    
</body>
</html>




