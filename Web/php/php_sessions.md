# Zugriffsschutz aktivieren

 1. Zu Beginn jeder PHP Session <code>Session.Start();</code> aufrufen.
 1. Hat sich ein Benutzer korrekt eingeloggt, wird dessen Benutzername in das Session Array eingetragen.
    ```PHP
     $_session['username'] = $username;
     ```

1. Jede Seite im Internen Bereich prüft, ob der Benutzer im Session - Array gesetzt ist
    ```php
    if(isset($_session['username'])){
        . . . // Benutzer eingeloggt
    } else {
        . . . // Benutzer nicht eingeloggt
    }
    ```