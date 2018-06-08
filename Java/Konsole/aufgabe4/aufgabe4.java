
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
public class aufgabe4 {

    /**
     * @param args the command line arguments
     */
    void rechner(double betrag, double zielsumme) {

        int monat = 0;

        if (betrag >= 3000 || betrag >= 5000 || zielsumme > betrag) {

            while (zielsumme > betrag) {
                if (betrag < 5000) {
                    betrag = betrag + 0.003 * betrag;
                    monat++;
                }
                if (betrag < 10000) {
                    betrag = betrag + 0.0035 * betrag;
                    monat++;
                }
                if (betrag < 20000) {
                    betrag = betrag + 0.004 * betrag;
                    monat++;
                }
                if (betrag > 20000) {
                    betrag = betrag + 0.005 * betrag;
                    monat++;
                }
                System.out.println("Monat " + monat + " Bissher gespart " + betrag + "");
            }

        } else {
            System.out.println("Bitte einen Wert zuwischen 3000 und 5000 € wählen [Error 1]");
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        aufgabe4 rechner = new aufgabe4();
        Scanner s = new Scanner(System.in);

        double zielsumme = 0;
        double betrag = 0;

        System.out.println("Bitte Startbetrag eingeben:");
        betrag = s.nextDouble();

        System.out.println("Bitte Zielbetrag eingeben:");
        zielsumme = s.nextDouble();

        rechner.rechner(betrag, zielsumme);

    }

}
