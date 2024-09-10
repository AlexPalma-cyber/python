<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Math</title>
</head>
<body>
<?php
echo(pi()); // returna el valor de PI
print("<br>");

echo(min(0, 150, 30, 20, -8, -200)); // returna el menor
print("<br>");
echo(max(0, 150, 30, 20, -8, -200)); //  returna el mayor
print("<br>");

echo(abs(-6.7)); // returna el valor absoluto
print("<br>");

echo(sqrt(64)); // returna la raiz cuadrada
print("<br>");

echo(round(0.60)); // redondea hacia arriba si el valor es >= .5
print("<br>");
echo(round(0.49)); // redondea hacia abajo si el valor es <= .5
print("<br>");

echo(rand(2, 50)); //valor random
print("<br>");
echo(rand(10, 100));
?>

</body>
</htmal>