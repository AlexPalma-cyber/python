<?php
// Imprimir la tabla
echo "<table border='1'>"; // Inicia la tabla con borde

// Usar un bucle para crear las filas
for ($row = 1; $row <= 15; $row++) {
    if($row == 1){
        echo "<tr style='background:grey'>";
    }else if($row % 2 == 0){
       echo "<tr style='background:green'>"; // Inicia una fila 
    }else{
        echo "<tr style='background:yellow'>";
    }
    

    // Usar otro bucle para crear las columnas en cada fila
    for ($col = 1; $col <= 3; $col++) {
        // Imprimir una celda en la tabla
        echo "<td>Fila $row, Columna $col</td>";
    }

    echo "</tr>"; // Termina una fila
}

echo "</table>"; // Termina la tabla
?>
