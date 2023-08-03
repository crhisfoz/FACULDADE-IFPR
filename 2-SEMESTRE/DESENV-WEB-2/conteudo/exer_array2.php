<?php

$linha1 = array("nome" => "Manuel de Medeiros",
                "endereco" => "Rua das Acácias",
                "cidade" => "Foz do Iguaçu",
                "estado" => "PR");

$linha2 = array("nome" => "Juliana de Amaral",
                "endereco" => "Rua dos Pinheiros",
                "cidade" => "Florianópolis",
                "estado" => "SC");

$linha3 = array("nome" => "Rodrigo Baidek",
                "endereco" => "Rua Dom Pedro I",
                "cidade" => "Petropólis",
                "estado" => "RJ");

 $linha4 = array("nome" => "Fabíola da Silva",
                "endereco" => "Rua Chile",
                "cidade" => "Guarulhos",
                "estado" => "SP");

$tabela = array($linha1, $linha2, $linha3, $linha4);

echo "<table border=1>";

echo "<tr>";
echo "<td> <b> Nome</b></td>";
echo "<td> <b> Endereco</b></td>";
echo "<td> <b> Cidade</b></td>";
echo "<td> <b> Estado</b></td>";
echo "</tr>";

foreach($tabela as $linha)

{
    echo "<tr>";
    foreach($linha as $coluna)
    echo "<td>" . $coluna . "  " ."</td>";
    echo "</tr>";


};
  

echo "</table>";