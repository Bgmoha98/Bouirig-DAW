<?php
        //Tanquem sessió
	session_start();
	session_destroy();
	$_SESSION=array(); //És el mateix què unset($_SESSION) o session_unset()
?>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="content-type" content="text/html;charset=utf-8" />
	<title>Tancar Sessió</title>
</head>
    <body style="background-color: #E8CA33;">
        <h3>Sessió finalitzada</h3>
        <a href="_5inici.php">Tornar a l'inici</a>
    </body>
</html>