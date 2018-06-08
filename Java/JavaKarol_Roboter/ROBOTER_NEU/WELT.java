import javakarol.Welt;


/**
 * Realisierung einer Karolwelt f�r BlueJ
 * 
 * JavaKarol ist eine Weiterf�hrung des Konzepts RobotKarol bei dem die Objekte
 * einer Karolwelt mit Java erzeugt und bearbeitet werden k�nnen.
 * 
 * Eine Karolwelt ist ein rechteckiger, dreidimensionaler Raum, dessen Boden mit einem
 * Quadratmuster ausgelegt ist und der von vier W�nden umgeben ist. Die Karolwelt kann
 * verschiedene Objekte wie Ziegel, Quader und Marken enthalten. In dieser Welt
 * k�nnen sich mehrere Objekte der Klasse Roboter bewegen. (Z.Zt. maximal 9)
 * 
 * Die Klasse WELT ist eine Umsetzung einer Karolwelt in die Programmiersprache Java.
 * Eine Welt kann auch aufgrund einer Karolwelt-Datei erstellt werden, wobei 
 * JavaKarol auch die Weltdefinitionen von RobotKarol verwenden kann. Geeignete
 * Welten k�nnen somit mit der Programmierumgebung von RobotKarol generiert werden.
 * 
 * Die Klasse WELT ist eine Unterklasse der Klasse Welt aus dem Paket javakarol.jar.
 * Sie kann in einem BlueJ-Projekt direkt verwendet werden. Von der Klasse WELT kann
 * ein Objekt in der Programmierumgebung BlueJ erstellt werden.
 * 
 * 
 * @author Ulli Freiberger
 * 
 * @version 1.1 (17.1.2013)
 * 
 */


public class WELT extends Welt {
	
	/**
	 * Erzeugen einer neuen, leeren Welt in der angegebenen Gr��e
	 * 
	 * Es muss immer erst eine Welt angelegt werden.
	 * Die Welt �ffnet automatisch das zugeh�rige Anzeigefenster.
	 * 
	 * @param Breite der Welt 1.. ; entspricht x-Koordinate
	 * @param L�nge der Welt 1.. ; entspricht y-Koordinate
	 * @param H�he der Welt 1..31
	 * 
	 */
	public WELT(int breite, int laenge, int hoehe)
	{
		super(breite,laenge,hoehe);
	}
	
	
	/**
	 * Erzeugen einer neuen Welt aus einer Karolwelt-Datei
	 * mit einem vorgegeben Dateinamen.
	 * 
	 * Die Einstellungen der Welt und der darin enthaltenen 
	 * Ziegel, Quader und Markierungen werden aus der Karolwelt-Datei
	 * geladen und die entsprechenden Objekte erzeugt. 
	 * Es sind sowohl Karolwelten von RobotKarol als auch von JavaKarol
	 * m�glich.
	 * Die Welt �ffnet automatisch das zugeh�rige Anzeigefenster.
	 * 
	 * @param Dateiname der Karolwelt-Datei
	 * Falls die Datei nicht vorhanden ist oder sich nicht im
	 * Klassenpfad befindet wird ein Dateiauswahlfenster ge�ffnet.
	 * 
	 */
	public WELT(String weltdatei)
	{
		super(weltdatei);
	}
	
	
	/**
	 * Erzeugen einer neuen Welt aus einer Karolwelt-Datei
	 * ohne Angabe eines Dateinamens.
	 * 
	 * Es wird immer erst ein Dateiauswahlfenster ge�ffnet, in dem
	 * die Karolwelt-Datei ausgew�hlt werden kann.
	 * Die Einstellungen der Welt und der darin enthaltenen 
	 * Ziegel, Quader und Markierungen werden aus dieser Karolwelt-Datei
	 * geladen und die entsprechenden Objekte erzeugt. 
	 * Es sind sowohl Karolwelten von RobotKarol als auch von JavaKarol
	 * m�glich.
	 * Die Welt �ffnet automatisch das zugeh�rige Anzeigefenster.
	 * 
	 */
	public WELT()
	{
		super();
	}
	

}
	
