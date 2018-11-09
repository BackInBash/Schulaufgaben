/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Aufgabe4 {

    void spareGeld(double startbetrag, double zielsumme) {
        System.out.println();
        System.out.println("Berechne für "+
                    startbetrag+"€ die Zeit bis "+
                    zielsumme+"€. ");
        System.out.println();
        if( startbetrag > 5000 || startbetrag > zielsumme ||
                startbetrag < 3000 ) {
            System.out.println("Fehler!");
            return;
        }
        double zinssatz = 1.03;
        int monat = 0;
        while ( startbetrag < zielsumme ) {
            if( startbetrag < 5000 )
                zinssatz = 1.03;
            else if ( startbetrag < 10000 )
                zinssatz = 1.035;
            else if ( startbetrag < 20000 )
                zinssatz = 1.04;
            else 
                zinssatz = 1.05;
            startbetrag = startbetrag * zinssatz;
            monat++;
            System.out.println("Im Monat "+monat+" ist der Betrag "+
                    startbetrag+"€ bei einem Zinssatz von "+
                    ((zinssatz-1.0) *100.0)+"%");
        }
        
        
    } 
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Aufgabe4 a = new Aufgabe4 ();
       a.spareGeld(3000, 10000);
       a.spareGeld(4500, 30000);
       a.spareGeld(6000, 8000);
       a.spareGeld(1000, 500);
    }
    
}
