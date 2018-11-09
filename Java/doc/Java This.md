# Zugriff auf die eigene Klasse (this)

Wenn übergabeparameter den selben namen haben, wie die Variablen der Klasse,
kann man per this angeben, dass man Zugriff auf die Variable der Klasse zugreifen möchte.

Beispiel:

```java
class A{
    int A;
    A(int A){
        this.A=A;
    }
}
```
