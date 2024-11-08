<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora Simple</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center mb-4">Calculadora Básica</h1>
        <form id="calculatorForm">
            <div class="mb-3">
                <label for="num1" class="form-label">Número 1</label>
                <input type="number" class="form-control" id="num1">
            </div>
            <div class="mb-3">
                <label for="num2" class="form-label">Número 2</label>
                <input type="number" class="form-control" id="num2" >
            </div>
            <div class="mb-3">
                <label for="operation" class="form-label">Operación</label>
                <select class="form-select" id="operation" required>
                    <option value="sum">Suma</option>
                    <option value="subtract">Resta</option>
                    <option value="multiply">Multiplicación</option>
                    <option value="divide">División</option>
                </select>
            </div>
            <button type="submit" class="btn btn-primary w-100">Calcular</button>
        </form>

        <h4 class="text-center" id="result">Resultado: -</h4>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        document.getElementById("calculatorForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevenir recarga de página

            const num1 = parseFloat(document.getElementById("num1").value);
            const num2 = parseFloat(document.getElementById("num2").value);
            const operation = document.getElementById("operation").value;
            
            let result;

            if (isNaN(num1) || isNaN(num2)) {
                result = "Error: Ingresa valores válidos.";
            } else {
                switch (operation) {
                    case "sum":
                        result = num1 + num2;
                        break;
                    case "subtract":
                        result = num1 - num2;
                        break;
                    case "multiply":
                        result = num1 * num2;
                        break;
                    case "divide":
                        if (num2 !== 0) {
                            result = num1 / num2;
                        } else {
                            result = "Error: División por cero";
                        }
                        break;
                    default:
                        result = "Operación no válida";
                }
            }

            document.getElementById("result").innerText = 'Resultado:' + result;
        });
    </script>
</body>
</html>
