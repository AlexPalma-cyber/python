<div class="col-sm-4">
    <h4>Agregar la cancion</h4>
       <form method="post" action="controladorcancion.php">
       <input type="hidden" name="nick" value="moios" class="form-control">
       <input type="text" name="autor" placeholder="Autor" class="form-control">
       <input type="text" name="titulo" placeholder="titulo" class="form-control">
       <input type="date" name="fecha" class="form-control">
       <input type="time" name="duracion" class="form-control">
       <select name="genero">
            <option value="KPOP">KPOP </option>
            <option value="KPOP">Rock </option>
            <option value="KPOP">Alternativo </option>
            <option value="KPOP">KROCK </option>
        </select>
       <input type="submit" value="Agregar cancion"  class="btn btn-outline-dark">
       </form>
</div>

<?php
include "conexion.php";

$sql = "select titulo, autor, fecha, genero
from cancion where usuario_nick like 'moios'";

$resultado = $conexion ->query($sql);

?>
<h3>Lista de canciones</h3>
<table class="table table-striped">
    <?php
        if($resultado ->num_rows > 0){
            while($fila = $resultado->fetch_assoc()){
                echo "<tr>";
                echo "<td>".$fila["autor"]."</td>";
                echo "<td>".$fila["titulo"]."</td>";
                echo "<td>".$fila["genero"]."</td>";

            } 
        }else{
                echo "No tienes canciones aun :(";
        }
    ?>
</table>

