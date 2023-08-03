<?php

$profs = array("Daniel" , "Ana Paula", "Humberto", "Julio", "Juliana");
$times = array("Grêmio", "Flamengo", "Palmeiras", "Cruzeiro", "Botafogo");
$frutas = array("Maçã", "Uva", "Laranja", "Limão", "Pera");
$animais = array("Cachorro", "Gato", "Cavalo", "Aranha", "Urso");

echo "<table border=1>";

echo "<tr>";

foreach($profs as $prof)
    echo "<td>" . $prof ."</td>";
echo "</tr>";

foreach($times as $time)
    echo "<td>" . $time ."</td>";
echo "</tr>";

foreach($frutas as $fruta)
    echo "<td>" . $fruta ."</td>";
echo "</tr>";

foreach($animais as $animal)
    echo "<td>" . $animal ."</td>";
echo "</tr>";

echo "</table>";