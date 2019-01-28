
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Person {
    String vorname="";
    String nachname="";
    String adresse="";
    String tel="";
}
/**
 *
 * @author
 */
public class PersonenVerwaltung_E3it1_G1 {

    Person arrPer[] = new Person[10];
    int index = -1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonenVerwaltung_E3it1_G1 p = new PersonenVerwaltung_E3it1_G1();
        
        
        // Objekt zum Zugriff auf das Terminal
        BufferedReader input = new BufferedReader( 
                  new InputStreamReader( System.in ) );
          
        try {
            String tmp = "";
            do {
            if( p.index < 9 ) {
                p.index++;
                p.arrPer[p.index] = new Person();
            
            
                System.out.println("Bitte einen Vornamen eingeben: ");
                // Vorname einlesen
                p.arrPer[p.index].vorname = input.readLine(); 
                System.out.println("Bitte einen Nachnamen eingeben: ");
                // Vorname einlesen
                p.arrPer[p.index].nachname = input.readLine(); 
                System.out.println("Bitte eine Adresse eingeben: ");
                // Vorname einlesen
                p.arrPer[p.index].adresse = input.readLine(); 
                System.out.println("Bitte eine Telefonnummer eingeben: ");
                // Vorname einlesen
                p.arrPer[p.index].tel = input.readLine(); 
                System.out.println("Weitere Personen einlesen (ja / nein) ");
            
                // Vorname einlesen
                tmp = input.readLine(); 
            } else {
                System.out.println("Es können keine Personen mehr erzeugt werden");
                tmp = "nein";
            }
            
            } while ( tmp.compareToIgnoreCase("ja") == 0 );
            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if( input != null){
                try {
                    input.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
          
        FileWriter f = null;
        try {
            // Datei speichern
            f = new FileWriter("personen.txt");
            for( int i=0; i<=p.index; i++){
                f.write("[Person]\n");
                f.write("Vorname: "+p.arrPer[i].vorname +"\n");
                f.write("Nachname: "+p.arrPer[i].nachname +"\n");
                f.write("Adresse: "+p.arrPer[i].adresse +"\n");
                f.write("Tel: "+p.arrPer[i].tel +"\n\n");
            }
        }  catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if( f != null){
                try {
                    f.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        p.index = -1;
        
        // Einlesen der Datei
        BufferedReader fr = null;
          
        try {
            fr = new BufferedReader( 
                new FileReader("personen.txt") );
          
            String tmp;
            while( (tmp  = fr.readLine()) != null) {
                if( tmp.compareToIgnoreCase("[Person]") == 0) {
                    if( p.index < 9 ) {
                        p.index++;
                        p.arrPer[p.index] = new Person();
                    }
                } else {
                    String[] arrStr = tmp.split(":",2);
                    switch( arrStr[0] ) {
                        case "Vorname":
                            p.arrPer[p.index].vorname = arrStr[1].trim();
                            break;
                         case "Nachname":
                            p.arrPer[p.index].nachname = arrStr[1].trim();
                            break;
                         case "Adresse":
                            p.arrPer[p.index].adresse = arrStr[1].trim();
                            break;
                         case "Tel":
                            p.arrPer[p.index].tel = arrStr[1].trim();
                            break;
                    }
                }
            }
          
         

        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if( fr != null){
                try {
                    fr.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        for( int i=0; i<=p.index; i++){
            System.out.println("\nPerson:");
            System.out.println("Vorname: "+p.arrPer[i].vorname);
            System.out.println("Nachname: "+p.arrPer[i].nachname);
            System.out.println("Adresse: "+p.arrPer[i].adresse);
            System.out.println("Tel: "+p.arrPer[i].tel);
        }
    }
    
}
