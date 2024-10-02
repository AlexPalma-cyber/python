<?php
session_start();
include 'db.php';

// Código para manejar el inicio de sesión
if (isset($_POST['username'])) {
    $_SESSION['username'] = htmlspecialchars($_POST['username']);
}

// Formulario de inicio de sesión
if (!isset($_SESSION['username'])) {
    echo '<form method="POST">
            <input type="text" name="username" placeholder="Tu nombre" required>
            <button type="submit">Iniciar sesión</button>
          </form>';
    exit;
}


// Manejo del envío de mensajes
if ($_SERVER['REQUEST_METHOD'] == 'POST' && isset($_POST['message'])) {
    $username = $_SESSION['username'] ?? 'Anonimo';
    $message = htmlspecialchars($_POST['message']);

    $stmt = $pdo->prepare("INSERT INTO messages (username, message) VALUES (?, ?)");
    $stmt->execute([$username, $message]);
}

// Obtener mensajes
$stmt = $pdo->query("SELECT * FROM messages ORDER BY created_at DESC");
$messages = $stmt->fetchAll(PDO::FETCH_ASSOC);
?>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Blog</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h1>Blog de Mensajes</h1>
        
        <form method="POST">
            <textarea name="message" placeholder="Escribe tu mensaje aquí..." required></textarea>
            <button type="submit">Enviar</button>
        </form>

        <h2>Mensajes</h2>
        <div id="messages">
            <?php foreach ($messages as $msg): ?>
                <div class="message">
                    <strong><?php echo htmlspecialchars($msg['username']); ?></strong>
                    <p><?php echo htmlspecialchars($msg['message']); ?></p>
                    <small><?php echo $msg['created_at']; ?></small>
                </div>
            <?php endforeach; ?>
        </div>
        
        <button onclick="window.location.reload();">Refrescar</button>
    </div>
</body>
</html>
