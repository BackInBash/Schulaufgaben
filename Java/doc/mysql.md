# Zugriff auf eine MySQL Datenbank
Aller erstens muss man sich den aktuellsten JDBC-Treiber für die Datenbank besorgen.

Der treiber wird als Bibliotheke in NetBeans eingebunden.

Folgende Schritte sind nun nötig:

1. `import java.sql.*;`
1. Objekt des JDBC Treibers erzeugen
   ```java
    class.forName("com.mysql.jc.jdbc.Driver").newinstance();
   ```
   Diese Anweisung muss in einen `try` / `catch` Block.
1. Neuer `try` / `catch` Block für die folgenden Anweisungen
   + Verbindung zum Server:
      ```java
      Connection conn = DriverManager.getConnection("jdbc.mysql://127.0.0.1/db", "user", "password");
      ```
1. SQL Abfragen erstellen
   ```java
   Statement stmt = conn.createStatement();
   ```
1. SQL-Select Abfrage und Antword speichern
   ```java
   ResultSet rs = stmt.executeQuery("SELECT * FROM table");
   ```
1. Ergebnisdatensätze ausgeben
   ```java
   while(rs.next()){
       System.out.println(rs.getInt("id")+"\+"+rs.getString("name"));
   }
   ```
1. Alles wirder schließen im `finally` Block
   ```java
   ... } finally {
       rs.close();
       stmt.close();
       conn.close();
   }
   ```
### Achtung: Jede `close()` Methode benötigt einen eigenen `try` / `catch` Block.