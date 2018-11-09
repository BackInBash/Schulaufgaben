# Vererbung

Um eine neue Klasse aus einer bestehenden abzuleiten, ist im Kopf der Klasse mit Hilfe des Schlüsselwortes <code>extends</code> ein Verweis auf die Basisklasse anzugeben.
Hier durch erbt die agbeleitete Klasse alle Eigenschaften der Basisklasse. D.h. alle Variablen und alle Methoden (außer wenn diese privat sind). Durch Hinzufügen neuer Elemente oder überladen der vorhandenen kann die Funktionalität der abgeleiteten Klasse erweitert werden.

Bsp:
```java
// Basisklasse / Elternklasse
class a {
    void drucken(){
        . . .
    }
    int x = 7;
    private int y = 9;
}
```
```java
// Erbt alle Eigenschaften von Klasse A => Kindsklasse
class b extends a{
    // Überschreibt die Methode der Elternklasse
    void drucken(){
        // Aufrufe der Methode aus der Elternklasse
        super.drucken();

        System.out.println("Klasse B");
    }
    int z = 2;
    void rechnen(){
        z = 3 * x; // Verwenden von X aus der Elternklasse
    }
}
```
```java
class Test{
    public static void main(String[] args){
        A a1 = new B();
        A a2 = new A();
        B b1 = new B();

        a1.drucken(); // Drucken aus Klasse B
        a2.drucken(); // Drucken aus Klasse A
        b1.drucken(); // Drucken aus Klasse B

        a1.x = 9; // X aus Klasse A
        a2.x = 9; // X aus Klasse A
        b1.x = 9 // X aus Klasse A
        b1.z = 7; // Z aus Klasse B

        ((B).a1).z = 7; // Variable a1 die vom Typ A ist wird auf B gecastet
        ((B).a1).rechnen(); // Methode a1 die vom Typ A ist wird auf B gecastet
    }
}
```