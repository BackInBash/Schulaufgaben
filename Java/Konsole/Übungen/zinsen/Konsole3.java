
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
public class Konsole3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double K = 0;
        double P = 0;
        double Z = 0;
        double ausgabe = 0;
        System.out.println("Bitte Startkapital angeben");
        K = s.nextDouble();
        System.out.println("Bitte Prozentzahl angeben");
        P = s.nextDouble();
        System.out.println("Bitte Zielkapital angeben");
        Z = s.nextDouble();
        
        if(K == 0 || P == 0 || Z == 0){
            System.out.println("Fehler: Bitte Werte eingeben");
            return;
        }
        ausgabe = K*P*12/Z;
        System.out.println("Jahre "+ausgabe+"");
        
    }
    
}
