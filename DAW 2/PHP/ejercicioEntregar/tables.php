<?php
$title="Contacts";
?>
<?php
session_start();

require_once("models.php");
require_once("cab.php");
require_once("foot.php");
require_once("viewsSector.php");

$idsector = $nomSector ="";
if(isset($_GET['id'])){
$id=(int) strip_tags($_GET["id"]);
$result = ContacteDB::getById($id);
$sector = $result['sector'];
$idsector = $sector->getIdSector();
$nomSector = $sector->getNomSector();

}else{
    $id = 0;
}

?>
<div class='container'>
    <div class='row'>
        <div class='col-5'>
            <form action='addRow.php' method="POST">
                <div class='form-group'>
                    <input type="hidden" name="id" value='<?=$id?>'/>
                    <label>Nombre sector </label><input class='form-control' type="text" name="nombreSector" value='<?=$nomSector?>' required/><br/>
                </div>
             
                <div class='form-group'>
                    <input class='btn btn-primary' type="submit" name="button" value="Send" />
                </div>
            </form>
        </div>
        <div class='col'>
            <?php
                $t = new tableContent();
                $t->setTitles(array("Sector","nomSector"));

                $n = ContacteDB::getAll();
                $t->setSectorG($n);
                $t->drawTable();
            ?>
        </div>
    </div>
</div>
<?php include "foot.php"; ?>
</body>
</html>