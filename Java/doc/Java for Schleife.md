# Java for Schleife

### Syntax:

```java
for (int; bedingung; update){
    anweisung();
    ...
    ..
    .
}
```

Jeder der 3 Ausdrücke int, bedingung und update kann entfallen.

### Beispiel:

```java
for(;;){
    myRob.Schritt();
}
```

Diese Schleife wird endlos ausgeführt !

### Bedeutung:

<code>int</code> = Wird 1x vor Beginn der Scheife ausgeführt. Wird meist zum erzeugen einer Variablen verwendet.
<br><code>bedingung</code> = Die Scheife wird solange ausgeführt wie die Bedingung "<code>true</code>" ist. Gibt man keine Bedingung an, ist sie automatisch "<code>true</code>".<br><code>update</code> = Wird nach jedem Schleifendurchlauf ausgeführt, so kann eine Variable erhöt oder verringert werden.

### Beispiele:

```java
for (int counter = 0; counter < 5; counter++){
    myRob.Schritt();
} // Roboter Läuft 5 Schritte
```
