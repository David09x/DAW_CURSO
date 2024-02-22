<?php
session_start();
include("classes.php");

$name = strip_tags($_POST["firstname"]);
$lastname = strip_tags($_POST["lastname"]);
$salario = strip_tags($_POST["salary"]);
$payment = strip_tags($_POST["payments"]);
$ventas = strip_tags($_POST["sales"]);
$comission = strip_tags($_POST["percent"]);
$radio = strip_tags($_POST["type"]);
if($radio == "N"){
    $trabajador = new nomina();
    $trabajador->setName($name);
    $trabajador->setSurname($lastname);
    $trabajador->setSalary($salario);
    $trabajador->setPayments($payment);
    array_push($_SESSION['llistat'],serialize($trabajador));
}else if($radio == "C"){
    $trabajador = new comission();
    $trabajador->setName($name);
    $trabajador->setSurname($lastname);
    $trabajador->setSales($ventas);
    $trabajador->setPercent($comission);
    array_push($_SESSION['llistat'],serialize($trabajador));
}


header("location:tables.php");
?>



