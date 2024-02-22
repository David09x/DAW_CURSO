<?php
session_start();
require_once("models.php");

$nombreEmpresa = strip_tags($_POST["nombreEmpresa"]);
$domicilio = strip_tags($_POST["domiciliEmpresa"]);
$codiPostal = strip_tags($_POST["cpostalEmpresa"]);
$poblacion = strip_tags($_POST["poblacioEmpresa"]);
$telefono = strip_tags($_POST["telefonoEmpresa"]);
$email = strip_tags ($_POST["emailEmpresa"]);
$idSector = strip_tags($_POST["sectoresMostrar"]);
$dni= strip_tags($_POST["dniEmpresa"]);
$nif = strip_tags($_POST["nif"]);



$empresa = new  Empresa();
$empresa->setNif($dni);
$empresa->setNom($nombreEmpresa);
$empresa->setDomicili($domicilio);
$empresa->setCpostal($codiPostal);
$empresa->setTelefono($telefono);
$empresa->setEmail($email);
$empresa->setPoblacio($poblacion);
$empresa->setIdsector($idSector);


if($nif == ""){
    $result= ContacteDB::insertEmpresa($empresa); 
}else{
    $result= ContacteDB::updateEmpresa($empresa);
}

header("location:tablesEmpresa.php");

?>