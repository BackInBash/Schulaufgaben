
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 *
 * @author 
 */
public class medikamente {

    double rechner(double verlustrate, double grenzwert ) {
        double wirkstoff = 100;

        int Monat = 0;
        

        do {
            System.out.println("Monat " + Monat + " Der Wirkstoffgehalt bertägt " + wirkstoff + " %");

            wirkstoff = wirkstoff - wirkstoff * verlustrate\100.0;

            ++Monat;
        } while (wirkstoff > grenzwert);
        System.out.println("Monat " + Monat + " Der Wirkstoffgehalt bertägt " + wirkstoff + " % ABGELAUFEN");
    
       return wirkstoff;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        medikamente medi = new medikamente();
    
        medi.rechner(4, 50.0);
    
    }

}
