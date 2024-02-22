<?php //ejercicio1 ?>
<?php 
    $email = "davidaksdsa@hotmail.sss";
    $contadorLetras= 0;
    $punto=substr($email,-4,4);
    $arroba=substr($email,-12,12);
    $final=substr($email,-3,3);
    $let6 =str_replace(".","",$final);
    for ($i=0; $i < strlen($punto) ; $i++) { 
        if($punto[$i]=="."){
            $contadorLetras++;
           
        }
    }
    for($i=0; $i < strlen($arroba) ; $i++){
        if($arroba[$i]=="@"){
            $contadorLetras++;
            
        }
    }
    
    if($let6[0]=="e" && $let6[1]=="s"){
            $contadorLetras++;
    }    
    if($let6[0]=="c" && $let6[1]=="o"&& $let6[2]=="m"){
        $contadorLetras++;
    }     
    if($contadorLetras != 3){
        echo "el email es incorrecto revisalo"."<br>"."<br>";
    }else{
        echo "el email es correcto"."<br>"."<br>";
    }
 

?>
 
<?php //ejercicio2 ?>

<?php $emails = array("fideloltra@gmail.com","user@yahoo.com","pepe@gmail.es","gmailuser@yahoo.com","yahoouser@gmail.es");
    $counterGmail= 0;
    $counterYahoo =0;

    foreach($emails as $email){
        $let1 =substr($email,-10,10); 
        if($let1[1]=="g"){
            $counterGmail++;
        }
        if($let1[2]=="g"){
            $counterGmail++;
        }
        if($let1[1]=="y"){
            $counterYahoo++;
        }
        if($let1[2]=="y"){
            $counterYahoo++;
        }
    }
    echo "los de gmail son: ".$counterGmail. " los de yahoo son: ".$counterYahoo."<br>"."<br>";
?>


<?php //ejercicio 3 ?>
<?php function nombreMes($string){
    $arrayMes = array("Enero"=>"January","Febrero"=>"February","Marzo"=>"March","Abril"=>"April","Mayo"=>"May","Junio"=>"June","Julio"=>"July","Agosto"=>"Agost",
    "Septiembre"=>"Septembre","Octubre"=>"October","Noviembre"=>"November","Diciembre"=>"Dicember");

    foreach($arrayMes as $mes=>$ingles){
        if($string == $mes){
            return $ingles."<br>"."<br>";
            
        }
    }
   echo "no se encontro"."<br>"."<br>";
}

echo nombreMes("Marzo");
?>

<?php //ejercicio4 ?>
<?php function librosMes(){
   $arrayLibros = array("Lazarillo de tormes: Anonimo","Don Quijote: Cervantes","Cien años de busqueda:Garcia Marquez","Bodas de sangre: Garcia Lorca","la Celestina:Fernando Rojas","Niebla:Unamono","La Regenta:Clarín");
   $arraySegundo = array();
   foreach($arrayLibros as $libro){
        $info =explode(":",$libro);
        $arraySegundo[0]=$info[1];
        $arraySegundo[1]=$info[0];
        print_r($$arraySegundo);
    }
}
echo librosMes()."<br>"."<br>";
?>




