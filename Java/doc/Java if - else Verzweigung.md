# Java if - else Verzweigung

Dient dazu bestimmte Programmteile nur beim Eintreten vorgegebener Bedingungen auszuführen.

### Syntax:

```java
if (bedingung) {
    anweisung();
    ...
} else {
    anweisung();
    ...
}
```

if wertet zuerst die Bedingung aus, ist sie wahr (true) werden die Anweisungen in if - Block ausgeführt, ist die Bedingung falsch (false) werden die Anweisungen im else - Block ausgeführt.

### ! Achtung !
Else ist Optional daher muss man keinen else - Block angeben.

### Beispiele:

```java
if (myRob.IstWand()){
    myRob.LinksDrehen();
} else {
    myRob.Schritt();
}
```
```java
if (myRob.IstWand()){
    myRob.LinksDrehen();
}
```