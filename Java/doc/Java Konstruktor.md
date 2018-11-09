# Java Konstruktor

- Eine Methode ohne Rückgabetyp
- Klassenname als Name
- Kann übergabeparameter enthalten
- Standardkonstruktor enthält keine Übergabeparameter

### Beispiel:

```java
class Auto3{
    String Marke;
    int baujahr;
    int leistung;

    Auto3(String m, int bj, int L){
        Marke = m;
        baujahr = bj;
        Leistung = L;
    }
}
```

```java
class AutoVerwaltung3{
    public static void main (String []args){
        Auto3 a = new Auto3("Audi", 2008, 605);
        Auto3 b = new Auto3("BMW", 2017, 550);
    }
}
```

Somit wird aus Auto Auto2

```java
class Auto {
    int Baujahr = 0;
    String Farbe;
    String Hersteller;
    String Typ;
}
```

&nbsp;

&nbsp;

&nbsp;

Wie kann man diesen Variablen Werte geben ?

```java
class AutoVerwaltung{
    public static void main (String []args){
        Auto a = new Auto();
        Auto b = new Auto();
    }
}
```
Frage ? Welchen Hersteller hat das Auto A ?

```java
a.Hersteller = "Audi";
a.Baujahr = 2008;
b.Hersteller = "BMW";
b.Baujahr = 2017;
a.Farbe = "schwarz";
a.typ = "RS6";
b.Farbe = "Weis";
b.typ = "M6";
```

Gibt es alternativen um den Variablen Werte zu geben ?

```java
class Auto2{
    int bj;
    String farbe;
    String hersteller;
    String Typ;
 void initialisieren (int baujahr, String f, String h, String t){
     bj = baujahr;
     hersteller = h;
     Typ = T;
   }
}
```
```java
class AutoVerwaltung2{
    public static void main (String []args){
        Auto2 a = new Auto2();
        a.initialisieren(2008,"Schwarz","Audi","RS6");
        Auto2 b = new A
    }
}