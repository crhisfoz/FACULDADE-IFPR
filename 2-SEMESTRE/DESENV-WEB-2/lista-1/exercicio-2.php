<?php

$bandas = array("creed", "gun's", "engenheiros do hawai", "eminem", "aerosmith");

$bandas_vazio = array();

foreach($bandas as $banda){
    array_push($bandas_vazio, $banda);
};


foreach($bandas_vazio as $id => $banda_vazio){
    if($id < count($bandas_vazio)-1)
        echo $banda_vazio .", ";
    else
        echo $banda_vazio;
};
?>