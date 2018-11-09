
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
public class taschenrechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        rechner r = new rechner();

        System.out.println("Bitte 1. Zahl eingeben (Kommazahlen sind erlaubt): ");
        double zahl1 = s.nextDouble();
        System.out.println("Bitte Rechen Operator angeben: ");
        String ro = s.next();
        r.error(ro);

        System.out.println("Bitte 2. Zahl eingeben (Kommazahlen sind erlaubt): ");
        double zahl2 = s.nextDouble();
        
        r.operator(ro, zahl1, zahl2);
        
    }

}
