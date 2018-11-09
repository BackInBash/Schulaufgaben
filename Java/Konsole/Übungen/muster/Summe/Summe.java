
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Summe {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        double Ausgabebetrag=0;
        double Eingabe=0;

        do
        {
            System.out.println("\n\n ");
            System.out.println("Bitte einen Betrag eingeben der Summiert werden soll");
            System.out.println("Die Berechnung endet sobald Sie den Wert 0 eingeben!");
            
            Eingabe = s.nextDouble();    

            System.out.println("Ihr eingegebener Wert ist "+Eingabe+" €\n");   
            System.out.println("\n\n");
            if( Eingabe !=0 ) {
                System.out.println("====================================================");
                System.out.println("Bitte warten berechne Wert");
                System.out.println("====================================================\n\n");
            
                Ausgabebetrag=Eingabe+Ausgabebetrag;

                System.out.println("Summierte Summe: "+Ausgabebetrag+" €");
                System.out.println("                 =========");
                System.out.println(" ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            } else
                System.out.println("Und Tschüß... ");   
                
        } while (Eingabe !=0);
        
        
        
                
    
    }
    
}
