<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>

    <!-- Incluir el CDN de Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1 class="text-center mt-4">Calculadora 1.0</h1>
    <div class="container mt-5">
        <div class="row">
            <div class="col-4 bg-info"></div>
            <div class="col-4">
                <!-- Formulario de la calculadora -->
                <form id="calculatorForm">
                    <div class="mb-3">
                        <label for="num1" class="form-label">Número 1</label>
                        <input type="number" class="form-control" id="num1" >
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

                <!-- Resultado -->
                <div class="mt-3">
                    <h4 class="text-center" id="result">Resultado: -</h4>
                </div>
            </div>
            <div class="col-4"></div>
        </div>
    </div>

    <!-- Incluir el CDN de Bootstrap JS (al final del archivo) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>

    <!-- Agregar el script para manejar el cálculo -->
    <script>
        // Función para realizar la operación
        document.getElementById("calculatorForm").addEventListener("submit", function(event) {
            event.preventDefault(); // Prevenir recarga de página
            console.log("Formulario enviado");

            // Obtener los valores de los inputs
            const num1 = parseFloat(document.getElementById("num1").value);
            const num2 = parseFloat(document.getElementById("num2").value);
            const operation = document.getElementById("operation").value;

            // Validación de los valores
            if (isNaN(num1) || isNaN(num2)) {
                document.getElementById("result").innerText = "Error: Ingresa valores válidos.";
                return;
            }

            let result;

            // Realizar la operación seleccionada
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

            // Mostrar el resultado en el HTML
            document.getElementById("result").innerText = 'Resultado:' + result;
        });
    </script>
</body>
</html>

