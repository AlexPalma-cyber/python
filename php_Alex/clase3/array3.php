<!DOCTYPE html>
<html>
<head>
    <meta charset= "UTF-8"/>
    <title>Array 2 </title>
<head>
<body>
<?php
$productos = array (
    array("Heladera", 2500000, 18),
    array("Microonda", 1500000, 9),
    array("Cocina", 590000, 21),
    array("Licuadora", 450000, 15),
    array("Mixer", 260000, 5),
    array("Ventilador", 150000, 15),
);
//Imprimir todos los valores
for($x = 0 ; $x < count($productos) ; $x++){
    for($y = 0 ; $y < count($productos[$x]) ; $y++){
        print(" | ".$productos[$x][$y]);
    }
    print("<br>");

}

print("<hr>");
//Imprimir solo los productos con (PRECIO <= 1000000)
for($x = 0 ; $x < count($productos) ; $x++){
    if($productos[$x][1] < 1000000){
       for($y = 0 ; $y < count($productos[$x]) ; $y++){
            print(" | ".$productos[$x][$y]);
        } 
        print("<br>");
    }

}
?>
</body>
</html>