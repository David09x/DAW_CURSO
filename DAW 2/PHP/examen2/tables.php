<?php
$title="Payments";
?>
<?php
session_start();
if (!isset($_SESSION["llistat"])) {
    $_SESSION["llistat"] = array();
}
include("cab.php");
include("classes.php");
$tabla = new Tablecontents();
$tabla->setTitle("Payment list");
$tabla->setTitles(array("name","username","anualPay"));
$tabla->setContactes($_SESSION["llistat"]);
?>
<div class='container'>
    <div class='row'>
    <div class='col'>
    <form action='addRow.php' method="POST">
        <div class='form-group row'>
            <label for='firstname' class='col-sm-3'>Name: </label>
            <div class='col-sm-8'>
                <input class='form-control' type="text" name="firstname" required/><br/>
            </div>
        </div>
        <div class='form-group row'>
            <label for='lastname' class='col-sm-3'>Surname: </label>
            <div class='col-sm-8'>
                <input class='form-control' type="text" name="lastname" required/><br/>
            </div>
        </div>
        <div class='form-group'>
            Fixed<input class='form-check-input' type="radio" name="type" value='N'/>
            Comission<input class='form-check-input' type="radio" name="type" value='C'/>
        </div>
        <br/>
        <div class='form-group row'>
            <label for='salary' class='col-sm-2'>Month salary</label>
            <div class='col-sm-4'>
                <input class='form-control' type="number" name="salary"/>
            </div>
            <label for='payments' class='col-sm-3'>Annual payments</label>
            <div class='col-sm-3'>
                <input class='form-control' type="number" name="payments" min="12" max="14"/>
            </div>
        </div>
        <br/>
        <div class='form-group row'>
            <label for='salary' class='col-sm-2'>Sales</label>
            <div class='col-sm-4'>
                <input class='form-control' type="number" name="sales"/>
            </div>
            <label for='payments' class='col-sm-3'>Percent</label>
            <div class='col-sm-3'>
                <input class='form-control' type="number" name="percent" min="10" max="25"/>
            </div>
        </div>
    <br/>
    <div class='form-group'>
    <input class='btn btn-primary' type="submit" name="button" value="Send"/>
    </div>
 
    </form>
    </div>
    <div class='col'>
        <?php 
        //print_r($_SESSION['llistat']);
      $tabla->drawTable();
        ?>
    </div>
    </div>
</div>
</body>
</html> 
