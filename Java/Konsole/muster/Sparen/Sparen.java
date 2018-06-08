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
public class Sparen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bitte Startkapital eingeben: ");
        double k = s.nextDouble();
        System.out.println("Bitte Zinssatz eingeben: ");
        double p = s.nextDouble();
        System.out.println("Bitte Zielkapital eingeben: ");
        double z = s.nextDouble();
        
        int jahre = 0;
        while ( k < z ) {
            // k = k+ k/100.0*p;
            k += k/100.0*p;
            jahre++;
            System.out.println("Jahr: "+jahre+" aktuelles Kapital: "+k+" €");
        }
        System.out.println("Das Zielkapital wurde nach "+jahre+
                " Jahren erreicht");
    }
    
}
