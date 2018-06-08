import javakarol.Roboter;


/**
 * Realisierung eines Roboters Karol für BlueJ
 * 
 * JavaKarol ist eine Weiterführung des Konzepts RobotKarol bei dem die Objekte 
 * einer Karolwelt mit Java erzeugt und bearbeitet werden können.
 * 
 * Die Klasse ROBOTER ist eine Umsetzung des Konzepts von RobotKarol in die 
 * Programmiersprache Java. Es stehen die gleichen Methoden wie bei RobotKarol
 * zur Verfügung. In einer Welt können sich mehrere Objekte der Klasse Roboter bewegen 
 * (Z.Zt. maximal 9). Auf einer Quadratkachel der Welt kann aber immer nur ein
 * Roboter stehen.
 * 
 * Die Klasse ROBOTER ist eine Unterklasse der Klasse Roboter aus dem Paket javakarol.jar.
 * Sie kann in einem BlueJ-Projekt direkt verwendet werden. Von der Klasse ROBOTER
 * können in der Programmierumgebung BlueJ Objekte erzeugt und benutzt werden.
 * Zur Vereinfachung des Methodenaufrufs im Objektinspektor von BlueJ wurden einige Methoden der
 * Klasse Roboter in der Klasse ROBOTER erneut definiert (unter Aufruf der geerbten Methoden).
 * Die restlichen Methoden können über "geerbt von Roboter" aufgerufen werden.
 * 
 * 
 * @author Ulli Freiberger
 * 
 * @version 1.1 (17.1.2013)
 * 
 */

public class ROBOTER extends Roboter {

	/**
	 * Erzeugen eines neuen Roboters mit vorgegebener Startposition 
	 * 
	 * Vorher muss ein Objekt der Klasse WELT angelegt werden, in der der Roboter lebt. 
	 * 
	 * @param Startposition (startX, startY) mit 1..WeltBreite bzw. 1..WeltLänge 
	 * @param Startblickrichtung 'S','W','N','O' 
	 * @param Referenz auf die Welt in der der Roboter leben soll 
	 * 
	 */
	public ROBOTER(int startX, int startY, char startBlickrichtung, WELT inWelt)
	{
		super(startX, startY, startBlickrichtung, inWelt);
	}
	
	/**
	 * Erzeugen eines neuen Roboters aufgrund der Einstellungen in einer Karolwelt-Datei 
	 * 
	 * Vorher muss ein Objekt der Klasse WELT angelegt werden, in der der Roboter leben soll. 
	 * Wenn dieses Weltobjekt aus einer Karolwelt-Datei geladen wurde, dann werden 
	 * die dortigen Robotereinstellungen verwendet, sonst ein Default-Roboter 
	 * mit (1,1) und Blickrichtung 'S' 
	 * 
	 * @param Referenz auf die Welt in der der Roboter leben soll
	 * 
	 */
	public ROBOTER(WELT inWelt)
	{
		super(inWelt);
	}
	
	
	/**
	 * Der Roboter macht einen Schritt nach vorne
	 */
	public void Schritt()
	{
		super.Schritt();
	}
	
	
	/**
	 * Der Roboter dreht sich nach Links (gegen den Uhrzeigersinn)
	 */
	public void LinksDrehen()
	{
		super.LinksDrehen();
	}
	
	
	/**
	 * Der Roboter dreht sich nach Rechts (im Uhrzeigersinn)
	 */	
	public void RechtsDrehen()
	{
		super.RechtsDrehen();
	}
	
	
	/**
	 * Der Roboter legt vor sich einen Ziegel hin
	 */
	public void Hinlegen()
	{
		super.Hinlegen();
	}
	
	
	/**
	 * Der Roboter hebt vor sich einen Ziegel auf
	 */
	public void Aufheben()
	{
		super.Aufheben();
	}
	
	
	/**
	 * Der Roboter setzt auf der Kachel unter ihm eine Marke
	 */
	public void MarkeSetzen()
	{
		super.MarkeSetzen();
	}
	
	
	/**
	 * Der Roboter entfernt von der Kachel unter ihm eine Marke
	 */	
	public void MarkeLoeschen()
	{
		super.MarkeLoeschen();
	}
	
	
	/**
	 * Der Roboter gibt einen Piep-Ton aus
	 */
	public void TonErzeugen()
	{
		super.TonErzeugen();
	}
	
	
	/**
	 * Abfrage ob der Roboter vor einer Wand bzw. einem Quader steht
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstWand()
	{
		return super.IstWand();
	}
	
	
	/**
	 * Abfrage ob vor dem Roboter ein Ziegel liegt
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstZiegel()
	{
		return super.IstZiegel();
	}
	
	
	// neu ab Version 1.1 17.1.2013
	/**
	 * Abfrage ob links vom Roboter ein Ziegel liegt
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstZiegelLinks()
	{
		return super.IstZiegelLinks();
	}
	
	
	//neu ab Version 1.1 17.1.2013
	/**
	 * Abfrage ob rechts vom Roboter ein Ziegel liegt
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstZiegelRechts()
	{
		return super.IstZiegelRechts();
	}
	
	
	/**
	 * Abfrage ob sich unter dem Roboter eine Marke befindet
	 * 
	 * @return wenn zutrifft dann true
	 */
	public boolean IstMarke()
	{
		return super.IstMarke();
	}
	

}
