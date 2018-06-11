<?php
$erg =0;
if ( isset ($_GET['zahl1']) && ( isset ($_GET['zahl2']) )) {
$zahl1 = $_GET['zahl1'] ;
$zahl2 = $_GET['zahl2'] ;
$z = $_GET['z'] ;

switch($z) {
	case "+":
	$erg = $zahl1 + $zahl2;
	break;
	
	case "-":
	$erg = $zahl1 - $zahl2;
	break;
	
	case "*":
	$erg = $zahl1 * $zahl2;
	break;
	
	case "/":
	$erg = $zahl1 / $zahl2;
	break;
	
	default:
	echo "ERROR";
	break;
}
}
?>

<html>
	<head>
		<title>PHP Berechnung</title>
	</head>
	<body>
	 <h3>Hier können Sie Daten zum Berechnen eingeben</h3>
	 <form action"rechnen.php" method="GET" enctype"">
       <table>
	    <tr><td>Zahl1: </td><td><input type="text" name="zahl1" size="30" value=""></td></tr>
		<tr><td>Zahl2: </td><td><input type="text" name="zahl2" size="30" value=""></td></tr>
	   </table>
	 <p />
	 +<input type="radio" name="z" size="30" value="+">
	 -<input type="radio" name="z" size="30" value="-">
	 *<input type="radio" name="z" size="30" value="*">
	 /<input type="radio" name="z" size="30" value="/">
	 <input type="submit" value="addieren">
	</form>
 Das Ergebniss ist: <?php echo $erg; ?>
</body>
</html>