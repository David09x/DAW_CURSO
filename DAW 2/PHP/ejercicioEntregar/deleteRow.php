<?php   
    require_once("models.php");
    $id =(int) $_GET['id'];
    $result = ContacteDB::deletedSector($id);
    header("location:tables.php");
?>