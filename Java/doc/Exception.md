# Exception - Ausnahmen Behandlung
Syntax:
```Java
try{
    anweisung();
} catch (Exception ex){ // Exception = Ausnahmetyp
    anweisung
}
```

Tritt im try-Block ein Fehler auf, wird das Programm unterbrochen und in die erste Passende catch-Klausel mit dem richtigen Ausnahmetyp. Dort kann auf den Fehler reagiert werden.

Der finally-Block wird immer beim verlassen des try-Blocks ausgeführt.
+ Wenn das normale Ende der try-Blocks erreicht wurde.
+ Wenn eine Ausnahme aufgetreten ist, die durch eine catch-Klausel behandelt wurde.
+ Wenn der try-Block durch eine Sprunganweisung <code>break</code>/<code>continue</code> oder <code>return</code> verlassen werden soll.
Finally sollte benutzt werden um z.B. Dateien zu schließen oder Ressourcen frei zu geben.

Bsp:
```Java
try{
    integer.parseint(Str);
} catch (Exception e){
    System.out.println("Error");
} finally {
    System.out.println("Ende");
}
```