# Static

<code>static</code> Variablen und Methoden existieren vom Laden der Klasse bis zum Beenden des Programms. Sie können ohne ein Objekt der Klasse aufgerufen werden.

Beispiel.)
```java
class A{
    int x = 7;
    static int z = 1;
    public static void main (String[] args){
        A a = new A();
        a.x = 3; // X ist einmal für Objekt A und a2 Vorhanden

        A a2 = new A();
        a2.x = 10; // X ist einmal für Objekt A und a2 Vorhanden

        a.z = 2; // Z ist einmal vorhanden und hat für Objekt a und a2 den selben Wert.
        a2.z = 3;

        A.z = 4;
    }
}
```