<?php
  require_once("models.php"); 
  $nifEmpresa = $_GET['id'];
  $result = ContacteDB::getByIdEmpresa($nifEmpresa);

  header("location:tablesEmpresa.php");
?>