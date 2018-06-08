<?php

$zahl1 = $_POST['zahl1'] ;
$zahl2 = $_POST['zahl2'] ;

$erg = $zahl1 + $zahl2;

?>

<html>
	<head>
		<title>PHP Berechnung</title>
	</head>
	<body>
	 <h3>Hier können Sie Daten zum Berechnen eingeben</h3>
	 <form action"rechnen.php" method="POST" enctype"">
       <table>
	    <tr><td>Zahl1: </td><td><input type="text" name="zahl1" size="30" value="55"></td></tr>
		<tr><td>Zahl2: </td><td><input type="text" name="zahl2" size="30" value="66"</td></tr>
	   </table>
	 <p />
	 <input type="submit" value="addieren">
	</form>
 Das Ergebniss ist: <?php echo $erg; ?>
</body>
</html>