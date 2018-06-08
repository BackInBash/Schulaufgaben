
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
public class void_schuldenfrei {

    /**
     * @param args the command line arguments
     */
    void rechner() {

        Scanner s = new Scanner(System.in);

        double saldo = 0;
        int Monat = 0;

        System.out.println("Bitte Kreditbetrag eingeben:\n");
        
        saldo = s.nextDouble();

        do {
            System.out.println("Monat " + Monat + " Saldo: " + saldo + "");
            saldo = saldo + 0.015 * saldo - 100;

            ++Monat;
        } while (saldo > 0);

        System.out.println("Monat " + Monat + " Saldo: " + saldo + "");

    }

    public static void main(String[] args) {
        // TODO code application logic here
        void_schuldenfrei saldo = new void_schuldenfrei();

        saldo.rechner();

    }

}
