<?php $arrayNum = array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17,18,19,20,21,22,23,24,25) ; ?>
<?php $arrayNum2 = array(10,4,5,7,8,11,222,33,14) ; ?>
<?php $arrayPhones = array("John"=>"12345","Louise"=>"952342","Mary"=>"852342","David"=>"9692834","Annie"=>"75324","Martin"=>"959235") ?>
<?php //ejercicio 1?>
<?php foreach($arrayNum as $num){
    if($num != 25){
        echo $num.",";
    }else{
        echo $num;
    }
}; ?><br>
<br>
<br>
<?php //ejercicio 2?>
<?php foreach($arrayNum as $num){
    if($num%5==0){
        echo $num."<br>";
    }
}; ?><br>
<br>
<br>
<br>
<?php //ejercicio 3?>
<?php foreach($arrayNum2 as $num){
    if($num%2==0){
        echo $num."<br>";
    }
}; ?><br>
<br>
<br>
<br>
<br>
<?php //ejercicio 4?>
<?php foreach($arrayNum2 as $key =>$num){
    if($key%2==0){
        echo $num."<br>";
    }
}; ?><br>
<br>
<br>
<br>
<br>
<?php //ejercicio 5?>
<?php foreach($arrayPhones as $name =>$phone){
    if(substr($phone,0,1)=="9"){
        echo $name." ".$phone." ";
    }
}; ?>