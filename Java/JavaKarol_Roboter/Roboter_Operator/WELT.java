import javakarol.Welt;


/**
 * Realisierung einer Karolwelt für BlueJ
 * 
 * JavaKarol ist eine Weiterführung des Konzepts RobotKarol bei dem die Objekte
 * einer Karolwelt mit Java erzeugt und bearbeitet werden können.
 * 
 * Eine Karolwelt ist ein rechteckiger, dreidimensionaler Raum, dessen Boden mit einem
 * Quadratmuster ausgelegt ist und der von vier Wänden umgeben ist. Die Karolwelt kann
 * verschiedene Objekte wie Ziegel, Quader und Marken enthalten. In dieser Welt
 * können sich mehrere Objekte der Klasse Roboter bewegen. (Z.Zt. maximal 9)
 * 
 * Die Klasse WELT ist eine Umsetzung einer Karolwelt in die Programmiersprache Java.
 * Eine Welt kann auch aufgrund einer Karolwelt-Datei erstellt werden, wobei 
 * JavaKarol auch die Weltdefinitionen von RobotKarol verwenden kann. Geeignete
 * Welten können somit mit der Programmierumgebung von RobotKarol generiert werden.
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
	 * Erzeugen einer neuen, leeren Welt in der angegebenen Größe
	 * 
	 * Es muss immer erst eine Welt angelegt werden.
	 * Die Welt öffnet automatisch das zugehörige Anzeigefenster.
	 * 
	 * @param Breite der Welt 1.. ; entspricht x-Koordinate
	 * @param Länge der Welt 1.. ; entspricht y-Koordinate
	 * @param Höhe der Welt 1..31
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
	 * möglich.
	 * Die Welt öffnet automatisch das zugehörige Anzeigefenster.
	 * 
	 * @param Dateiname der Karolwelt-Datei
	 * Falls die Datei nicht vorhanden ist oder sich nicht im
	 * Klassenpfad befindet wird ein Dateiauswahlfenster geöffnet.
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
	 * Es wird immer erst ein Dateiauswahlfenster geöffnet, in dem
	 * die Karolwelt-Datei ausgewählt werden kann.
	 * Die Einstellungen der Welt und der darin enthaltenen 
	 * Ziegel, Quader und Markierungen werden aus dieser Karolwelt-Datei
	 * geladen und die entsprechenden Objekte erzeugt. 
	 * Es sind sowohl Karolwelten von RobotKarol als auch von JavaKarol
	 * möglich.
	 * Die Welt öffnet automatisch das zugehörige Anzeigefenster.
	 * 
	 */
	public WELT()
	{
		super();
	}
	

}
	
