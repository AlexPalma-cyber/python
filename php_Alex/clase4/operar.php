<?php
if ($_REQUEST['operacion'] == "suma") {
    $suma= $_REQUEST['valor1'] + $_REQUEST['valor2'];
    echo "La suma es:" .$suma;
}else {
    if ($_REQUEST['operacion'] == "resta") {
    $resta= $_REQUEST['valor1'] - $_REQUEST['valor2'];
    echo "La resta es:" .$resta;  
} else {
    if ($_REQUEST['operacion'] == "multiplicar") {
    $multiplicar= $_REQUEST['valor1'] * $_REQUEST['valor2'];
    echo "La multiplicacion es:" .$multiplicar; 
} else {
    if ($_REQUEST['operacion'] == "dividir") {
    $dividir= $_REQUEST['valor1'] / $_REQUEST['valor2'];
    echo "La division es:" .$dividir; 
    }
}
}
}
?>