# Java Arrays

- Ist ein Feld von Elementen mit gleichem Datentyp
- Elemente können eingefügt und entfernt werden

## 3 Schritte zum Erstellen eines Arrays

1.) Deklarieren einer Variablen zur Aufnahme des Arrays.


```java
int Werte [];
```

2.) Erstellen eines neuen Array-Objekts und der Array-Variablen zuweisen.


```java
Werte = new Werte[10];
```

3.) Speichern von Werten in den Array-Elementen


```java
Werte[0] = 789;
Werte[1] = 123;
Werte[2] = 456;
Werte[9] = 999;
```

Beispiel:

```java
Flasche fArr[] = new Flasche[12];
  for(int i=0; i<12; i++){
      if (i==0){
          fArr[i] = new Flasche(0);
      } else {
          fArr[i] = new Flasche ((int) (Math.random()*1000+1));
      }
  }
```
