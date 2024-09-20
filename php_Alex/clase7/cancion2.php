<?php
session_start(); // Iniciar la sesión

// Verificar si ya existe un arreglo de canciones en la sesión
if (!isset($_SESSION['canciones'])) {
    $_SESSION['canciones'] = [];
}

// Agregar canción si se envió el formulario
if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['autor'], $_POST['titulo'])) {
    $autor = htmlspecialchars($_POST['autor']);
    $titulo = htmlspecialchars($_POST['titulo']);
    $fecha = date('Y-m-d'); // Puedes cambiar esto si necesitas otro formato
    $genero = "Desconocido"; // Aquí puedes agregar un campo para género si lo deseas

    // Agregar la nueva canción al arreglo de la sesión
    $_SESSION['canciones'][] = [
        'autor' => $autor,
        'titulo' => $titulo,
        'fecha' => $fecha,
        'genero' => $genero
    ];
}
?>

<div class="col-sm-4">
    <h4>Agregar la canción</h4>
    <form method="post" action="">
        <input type="text" name="autor" placeholder="Autor" class="form-control" required>
        <input type="text" name="titulo" placeholder="Título" class="form-control" required>
        <input type="submit" value="Agregar canción" class="btn btn-outline-dark">
    </form>
</div>

<h3>Lista de canciones</h3>
<table class="table table-striped">
    <?php if (count($_SESSION['canciones']) > 0): ?>
        <?php foreach ($_SESSION['canciones'] as $cancion): ?>
            <tr>
                <td><?php echo $cancion['autor']; ?></td>
                <td><?php echo $cancion['titulo']; ?></td>
                <td><?php echo $cancion['genero']; ?></td>
                <td><?php echo $cancion['fecha']; ?></td>
            </tr>
        <?php endforeach; ?>
    <?php else: ?>
        <tr>
            <td colspan="4">No tienes canciones aún :(</td>
        </tr>
    <?php endif; ?>
</table>
