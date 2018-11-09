# Java Methoden

* Definieren des Verhalten von Objekten

z.B.
```
myRob.Schritt();
```

* Werden inerhalb einer Klassendefinition angelegt und haben Zugriff auf die Variablen der Klasse

### Syntax:

```
Modifier Datentyp Name (Parameterliste){
    Anweisung();
}
```

<code>Modifier</code> und <code> Parameterliste</code> sind Optional und können entfallen.

### Beispiel:

```java
void fuenfSchritte(){
    for (int i=0; i<5; i++){
        myRob.Schritt();
    }
}
```

Wenn die Methode keinen Datentyp mehr liefert ist der Datentyp void.

Der Methoden aufruf erfolgt über:

```java
class rob{
    void fuenfSchritte(){
        for (int i=0; i<5; i++){
            myRob.Schritt();
        }
    }
    public static void main (String []args){
        rob robi = new rob();
        robi.fuenfSchritte();
    }
}
```