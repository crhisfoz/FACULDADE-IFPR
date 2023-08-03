<?php 


$alunos = array( "Nathan", "Vanessa", "Matheus");

for ($i=0; $i < count($alunos) ; $i++) { 
    echo $alunos[$i] . "<br>";
};

foreach($alunos as $a){
    echo $a ."<br";
};


$profs = array("Daniel" => "Dev. Web II", "Ana Paula" => "Banco de Dados", "Humberto" => "Orient. a Objetos");

foreach($profs as $p){
    echo $p. "<br";
};

foreach($profs as $c => $p){
    echo $c . " - " . $p. "<br";
};


$profs = array("Daniel" , "Ana Paula", "Humberto");
array_push($profs, "Julio");

print_r($profs);

?>

