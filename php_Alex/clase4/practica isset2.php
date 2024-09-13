<?php

$a = array ('test' => 1, 'hello' => NULL, 'pie' => array('a' => 'apple'));

var_dump(isset($a['test']));      
echo "<br>";      // TRUE
var_dump(isset($a['foo'])); 
echo "<br>";             // FALSE
var_dump(isset($a['hello']));
echo "<br>";            // FALSE

// La clave 'hello' es igual a NULL así que no se considera definida
// Si desea comprobar los valores NULL clave, intente:
var_dump(array_key_exists('hello', $a));
echo "<br>";  // TRUE

// Comprobando valores de arrays con más profunidad
var_dump(isset($a['pie']['a']));
echo "<br>";         // TRUE
var_dump(isset($a['pie']['b']));
echo "<br>";         // FALSE
var_dump(isset($a['cake']['a']['b']));  // FALSE
echo "<br>"; 
?>