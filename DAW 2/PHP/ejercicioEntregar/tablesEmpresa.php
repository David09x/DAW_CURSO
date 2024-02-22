<?php
$title = "Contacts";
?>
<?php
session_start();

require_once("models.php");
require_once("cab.php");
require_once("foot.php");
require_once("views.php");
$nif =$nifempresa= $nomempresa= $domiciliempresa = $postalempresa = $poblacioempresa =  $telefonoempresa = $emailempresa = $idsectorempresa ="";
if(isset($_GET['id'])){
    $nif= strip_tags($_GET["id"]);
    $result = ContacteDB::getByIdEmpresa($nif);
    $empresa = $result['Empresa'];
    $nifempresa = $empresa->getNif();
    $nomempresa = $empresa->getNom();
    $domiciliempresa = $empresa->getDomicili();
    $postalempresa = $empresa->getCpostal();
    $poblacioempresa = $empresa->getPoblacio();
    $telefonoempresa = $empresa->getTelefono();
    $emailempresa = $empresa->getEmail();
    $idsectorempresa = $empresa->getIdsector();
    }

?>
<div class='container'>
    <div class='row'>
        <div class='col-5'>
            <form action='addRowEmpresa.php' method="POST">
            <input type="hidden" name="nif" value='<?=$nif?>'/>
                <div class='form-group'>
                  
                    <label>DNI </label><input class='form-control' type="text" name="dniEmpresa" value='<?=$nifempresa?>'required /><br />
                </div>
                <div class='form-group'>
                    <label>nombre </label><input class='form-control' type="text" name="nombreEmpresa" value='<?=$nomempresa?>' required /><br />
                </div>
                <div class='form-group'>
                
                    <label>domicili </label><input class='form-control' type="text" name="domiciliEmpresa" value='<?=$domiciliempresa?>'
                        required /><br />
                </div>
                <div class='form-group'>
                    
                    <label>cpostal</label><input class='form-control' type="numbers" name="cpostalEmpresa" value='<?=$postalempresa?>'
                        required /><br />
                </div>
                <div class='form-group'>
                   
                    <label>poblacio</label><input class='form-control' type="text" name="poblacioEmpresa" value='<?=$poblacioempresa?>'
                        required /><br />
                </div>
                <div class='form-group'>
                   
                    <label>telefono</label><input class='form-control' type="numbers" name="telefonoEmpresa" value='<?=$telefonoempresa?>'
                        required /><br />
                </div>
                <div class='form-group'>
                    
                    <label>email</label><input class='form-control' type="text" name="emailEmpresa" value='<?=$emailempresa?>' required /><br />
                </div>
                <div class='form-group'>
                
                    <label>idsector</label><br>
                    <?php
                    $sectoresGuardados = ContacteDB::getAll();
                    echo "<select name='sectoresMostrar' id='sect' value='<?=$idsectorempresa?>'>";
                    foreach($sectoresGuardados as $sector) {
                        $idSector = $sector->getIdSector();
                        echo "<option value='$idSector'>" . $sector->getNomSector() . "</option>";
                    }
                    echo "</select>";
                   
                    ?>
                </div>
                <br>
                <br>
                <div class='form-group'>
                    <input class='btn btn-primary' type="submit" name="button" value="Send" />
                </div>
            </form>
        </div>
        <div class='col'>
                    <?php
                        $t = new tableContent();
                        $t->setTitle("HOLA");
                        $t->setTitles(array("NIF","Nom","domicili","cpostal","poblacio","telefono","email","idsector"));

                        $lista = ContacteDB::getAllEmpresa();
                        $t->setEmpresa($lista);
                        $t->drawTable();
                    ?>
        </div>
    </div>
</div>
<?php include "foot.php"; ?>
</body>

</html>