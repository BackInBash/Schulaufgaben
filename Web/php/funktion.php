<?php 

$erg_n = '';
$erg_z = '';
$z1 = '';
$z2 = '';
$n1 = '';
$n2 = '';
$z = '';

if (isset($_POST['z'])){
$z1 = $_POST['z1'];
$n1 = $_POST['n1'];
$z2 = $_POST['z2'];
$n2 = $_POST['n2'];
$z  = $_POST['z'];
}
?>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<?php 


function ggt($x1,$x2) {
  do {
    $rest = $x1%$x2;
    $x1 = $x2;
    $x2 = $rest;
  } while($rest>0);
  
  return $x1;
}



if(!empty($z)) {
   switch($z)
   {
   case 1 : // "+"
   $erg_n = $n1 * $n2;
   $erg_z = ($z1*$n2) + ($z2*$n1);   
   break;
		   
   case 2 : // "-"
   $erg_n = $n1 * $n2;
   $erg_z = ($z1*$n2) - ($z2*$n1);   
   break;
   
   case 3 : // "*"
   $erg_n = $n1*$n2;
   $erg_z = $z1*$z2;   
   break;
   
   case 4 : // "/"
	if($n1 != 0 && $n2!=0) {
    		$erg_n = $n1*$z2;
    		$erg_z = $z1*$n2;
	} 
	else {
	  echo "Fehler: Division durch Null!";
	}	
   break;
}

$erg_ggt = ggt($erg_z, $erg_n);
	if($erg_ggt > 1) {
   	 $erg_n = $erg_n/$erg_ggt;
         $erg_z = $erg_z/$erg_ggt;  
   	}
}
?>

<HTML>
<HEAD>
	<title>Gr&ouml;&szlig;ter gemeinsamer Teiler</title>
</head>

<BODY>
	<h1>Bruchrechnung</h1>
	<form method="post" action="funktion.php">
		<table>
			<colgroup width="50" align="center" span="5"> </colgroup>
			<tr>
				<td align="center"> Bruch 1 </td>
				<td></td>
				<td align="center"> Bruch 2</td>
				<td></td>
				<td align="center"> Ergebnis</td>
			</tr>
			<tr>
				<td><input type="text" name="z1" value="<?php echo $z1; ?>" /></td>
				<td></td>
				<td><input type="text" name="z2" value="<?php echo $z2; ?>" /></td>
				<td></td>
				<td><input type="text" name="erg_z" value="<?php echo $erg_z; ?>" /></td>
			</tr>
			<tr>
				<td align="center">--------------</td>
				<td align="center"> ? </td>
				<td align="center">--------------</td>
				<td align="center"> = </td>
				<td align="center">--------------</td>
			</tr>
			<tr>
				<td><input type="text" name="n1" value="<?php echo $n1; ?>" /></td>
				<td></td>
				<td><input type="text" name="n2" value="<?php echo $n2; ?>" /></td>
				<td></td>
				<td><input type="text" name="erg_n" value="<?php echo $erg_n; ?>" /></td>
			</tr>
		</table>
		<table>
			<colgroup width="100" align="center" span="4"></colgroup>
			<tr>
				<td align="center"> + <input type="radio" name="z" value="1" <?php if($z == '1') echo 'checked'; ?> /></td>
				<td align="center"> - <input type="radio" name="z" value="2" <?php if($z == '2') echo 'checked'; ?>  /></td>
				<td align="center"> * <input type="radio" name="z" value="3" <?php if($z == '3') echo 'checked'; ?> /></td>
				<td align="center"> / <input type="radio" name="z" value="4" <?php if($z == '4') echo 'checked'; ?>  /></td>
			</tr>
		</table>
		<input type="submit" name="submitted" value=" berechnen " align="center">
	</form>
<?php 
?>
</body>
</html>
