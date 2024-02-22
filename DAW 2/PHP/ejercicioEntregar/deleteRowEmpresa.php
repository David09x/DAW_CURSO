<?php
     require_once("models.php");
     $id = $_GET['id'];
     $result = ContacteDB::deletedEmpresa($id);

     header("location:tablesEmpresa.php");
?>