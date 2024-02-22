<?php
    require_once("models.php"); 
    $idsector =(int) $_GET['id'];
    $result = ContacteDB::getById($idsector);

    header("location:tables.php");
?>