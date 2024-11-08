<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="witdh=device=width, initial-scale=1.0">
<title>Bienvenido</title>
<link href="https://cdn.jsdelivr.net/npm/boostrap@5.3.0-alpha1/dist/css/boostrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="styles.css">
</head>
<body class="bg.light">
    <div class="container d-flex justify-content-center align-items-center" style="height: 100vh;">
       <div class="card p-4 shadow-lg" style="width: 20rem;">
        <h1 class="text-center mb-4">Bienvenido</h1>
        <p class="text-center">¡Has iniciado sesion exitosamente!</p>
        <p class="text-center">Esta es tu pagina de inicio. Aqui puedes ver el contenido disponible solo paa usuarios registrados</p>
       
        <form action="Logincontroller" method="get">
        <button type="submit" class="btn btn-danger w-100 mt-3">Cerrar sesion</button>
       </form>
      </div>
     </div>
     
   <script src="https://cdn.jsdlivr.net/npm/@popperjs/core@2.11.6/dist/udm/popper.min.js"></script>
   <script src="https://cdn.jsdlivr.net/npm/boostrap@5.3.0-alpha1/dist/js/boostrap.min.js"></script>
</body>
</html>