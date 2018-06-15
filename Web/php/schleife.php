<?php

if (isset($kap) && isset($zins) && isset($jahr)){

$kap = $_POST['Kap'] ;
$zins = $_POST['Zin'] ;
$jahr = $_POST['Jah'];

}

?>

<html>
	<head>
		<title>PHP Schleife</title>
	</head>
	<body>
	 <h3>Seite zur Berechnung des Kapitalwachstums</h3>
	 <br />
	 <h3>Bitte geben sie ihre Daten ein</h3>
	 <form action"schleife.php" method="POST" enctype"">
       <table>
	    <tr><td>Kapital: </td><td><input type="text" name="Kap" size="30" value=""></td></tr>
		<tr><td>Zinssatz: </td><td><input type="text" name="Zin" size="30" value=""</td></tr>
		<tr><td>Jahre: </td><td><input type="text" name="Jah" size="30" value=""</td></tr>
	   </table>
	 <p />
	 <input type="submit" value="Berechnen">
	</form>
 <?php
 $neukapital = $kap;
 if (($jahr))
 {
	 echo '<Table border="1">';
	 echo "<colorgroup>
			<col width='180'>
			<col width='100 align='right'>
			<col width='100 align='right'>
			</colorgroup>";
		echo "<tr><td>Zinsberechnung</td><td>Zinsen $zins %</td><td>Kapital</td></tr>";
		for($i=1;$i<=$jahr;$i++){
			$zinssatz = number_format($neukapital*$zins/100, 2, '.', '');
			$neukapital = number_format($neukapital+$zinssatz, 2, '.', '');
				echo "<tr><td>Nach $i Jahr</td><td> $zinssatz €</td><td>$neukapital €</td></tr>";
		}
 }
 ?>
</body>
</html>