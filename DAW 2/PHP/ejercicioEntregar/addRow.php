<?php
session_start();
require_once("models.php");
$idsector = strip_tags($_POST["id"]);
$nombreSector = strip_tags($_POST["nombreSector"]);
$sector = new  sector();
$sector->setIdSector($idsector);
$sector->setNomSector($nombreSector);

print_r($sector);
if($idsector == 0){
    $result= ContacteDB::insertSector($sector); 
}else{
    $result= ContacteDB::updateSector($sector);
}


header("location:tables.php");
?>