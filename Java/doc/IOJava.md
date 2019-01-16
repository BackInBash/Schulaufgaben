# Eingabe / Ausgabe (IO) in Java

Ein / Ausgabe findet über Dateien oder Geräte statt.
+ Eine Datei oder Gerät wird als Folge eizelner Bytes (Byte Stream) betrachtet oder als Unicode-Stream.
+ IM Programm wird eine Datei / Geräte von einem Objekt einer Stream-Klasse repräsentiert.

Folgende abstrakte Klassen sin die Basisklassen aller Streamklassen.

+ InputStream
    + Klassen zum Byteweisen Lesen
+ Reader
    + Klassen zum Zeichenweisen (Unicode) Lesen
+ OutputStream
    + Klassen zum Byteweisen Schreiben
+ Writer
    + Klasse zum Zeichenweisen Schreiben

In jedem Programm sind folgende Byte-Stream Objekte in der Klasse System vordefiniert:

```Java
public static final InputStream in; // Standard Eingabe Objekt
public static final PrintStream out; // Standard Ausgage Objekt
public static final PrintStream err; // Standard Fehlerausgabe Objekt
```

# Lesen von der Standard-Eingabe
Stream-Objekt: System.in
1) Methode zum Einlesen ist <code>read()</code>
1) Liest einzelne Bytes oder ein Feld von Bytes.

Im Programm arbeitet man mit Unicode, deshalb wäre ein Unicode Render Objekt besser zum Einlesen.
Dies liefert die Input-Stream-Reader Klasse.

Mit <code>read()</code> können nur einzelne Zeichen gelesen werden, schöner wäre es, wenn man eine ganze Zeile einlesen könnte. Dies bietet die Klasse BufferedReader mit der Methode <code>readLine()</code>

Außerdem müssen IOExceptions behandelt werden.

Beispiel:

```Java
import java.io.*;
class EchoLine(){
    public static void main(String[] args){
        BufferedReader br = null;
        try{
            br = new BufferedReader(
                new InputStreamReader(System.in));
            String Line;
            while((Line == br.readLine()) != null){
                System.out.println(Line);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
```

# Daten in Java speichern
Zum Speichern von Texten benutzt man writer Klassen.
Diese bieten die Methoden:

```Java
public void close() // Zum Schließen
public void flush() // Explizites Schreiben
public void write(String str) // Zum Speichern 
```
Der Konstruktor öffnet einen Ausgabestrom der mit "write" beschrieben und mit "close" geschlossen werden kann.
Zum schreiben in eine Datei nutzt man die Klasse FileWriter.
Bsp:
```Java
import java.io.*;
class Schreiben(){
    public static void main(String[] args){
        String hello = "Hallo Java \n \r";
        FileWriter f = null;
        try{
            f = new FileWriter("Hallo.txt");
            f.Write(hello);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            if(f != null){
                try {
                    f.close();
                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                } 
            }
        }
    }
}
```
