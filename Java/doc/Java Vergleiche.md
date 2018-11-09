# Java Vergleiche

bedingungen werde auf Gleichheit getestet die Bedingungen egeben einen boolschen Wert.



|<h2>Operatoren  |   | <h2>Bedeutung |   |  <h2>Beispiel |
|---|---|---|---|---|
| <code>==</code> ||gleich   ||<code>x == 3</code>  |
| <code>!=</code>  ||nicht gleich   ||<code>x != 3</code>  |
| <code>></code>  || größer als  ||<code>x > 3</code>  |
| <code><</code>  ||kleiner gleich   ||<code>x < 3</code>  |
| <code><=</code>  ||kleiner gleich   ||<code>x <= 3</code>  |
|<code>>=</code>   ||größer gleich   || <code>x >= 3 </code>  |
|   ||   ||  |



### Beispiel:

Stein ablegen, wenn keiner da liegt.
+ Möglichkeit 1.)

 ```java
if (robi.IstZiegel() == false){
    robi.Hinlegen();
}
```
+ Möglichkeit 2.)

 ```java
if (robi.IstZiegel() != true){
    robi.Hinlegen();
}
 ```
+ Möglichkeit 3.)
```java
if (! robi.IstZiegel()){
    robi.Hinlegen();
}
```