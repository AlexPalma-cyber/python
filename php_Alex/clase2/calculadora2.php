<?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $numero1 = $_POST['numero1'];
        $numero2 = $_POST['numero2'];
        $operacion = $_POST['operacion'];
        $resultado = '';

        switch ($operacion) {
            case '+':
                $resultado = $numero1 + $numero2;
                break;
            case '-':
                $resultado = $numero1 - $numero2;
                break;
            case '*':
                $resultado = $numero1 * $numero2;
                break;
            case '/':
                if ($numero2 != 0) {
                    $resultado = $numero1 / $numero2;
                } else {
                    $resultado = 'Error: División por cero';
                }
                break;
            case '^':
                $resultado = pow($numero1, $numero2);
                break;
        }
    }
    ?>
    <!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>
<body>
    <form method="post">
        <input type="number" name="numero1" placeholder="Número 1" required>
        <input type="number" name="numero2" placeholder="Número 2" required>
        <input type="text" name="resultado" value="resultado" placeholder="Resultado" readonly>
        <br>
        <button type="submit" name="operacion" value="+">+</button>
        <button type="submit" name="operacion" value="-">-</button>
        <button type="submit" name="operacion" value="/">/</button>
        <button type="submit" name="operacion" value="*">*</button>
        <button type="submit" name="operacion" value="^">X<sup>y</sup></button>
    </form>
</body>
</html>