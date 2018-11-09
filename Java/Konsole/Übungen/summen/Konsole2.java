
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
public class Konsole2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double betrag = 0.;
        
        double i = 0.;

        Scanner s = new Scanner(System.in);

        do{
            System.out.println("Bitte Zahl eingeben");

                betrag = s.nextDouble();           
                 i = i+betrag;
            System.out.println("Das Ergebniss lautet " + i + "");

            // TODO code application logic here
        }while(betrag != 0);
    }
}
