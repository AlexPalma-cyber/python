<?php session_start();?>
<!Doctype html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Dashboard</title>
</head>
<body>
<h2>Sesion abierta</h2>
<p>
<?php
if(isset($_POST['nombre'])) {
    $_SESSION['nombre'] = $_POST['nombre'];
    echo"Bienvenido,:<b> ".$_POST['nombre']. "</b>";
}else{
    if(isset($_SESSION['nombre'])){
    echo "Has iniciado Sesion como: ".$_SESSION['nombre'];
}else{
//Si la sesion expira
echo "Acceso Restringido";    
}    
}
?></p>
<br>
<p><a href="login.php">Ir a la pagina inicial</a></p>
<br>
<p><a href="logout.php">Cerrar sesion</a></p>
</body>
</html>