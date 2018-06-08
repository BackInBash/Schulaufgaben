/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Roboter_Methode {

    WELT myWelt = new WELT(10, 10, 10);
    ROBOTER r1 = new ROBOTER(myWelt);

    int schritteGehen(int anzahl) {
        r1.VerzoegerungSetzen(25);
        int j = 0;
        for (int a = 0; a < 4; a++) {

            for (int b = 0; b < anzahl; b++) {
                r1.Schritt();
                j = j + 1;
            }
            r1.LinksDrehen();
        }

        return j;
    }

    void treppe_bauen(int hoehe) {
        r1.VerzoegerungSetzen(90);
        r1.SprunghoeheSetzen(10);

        for (int j = 0; j < hoehe; j++) {

            for (int i = 0; i <= j; i++) {
                r1.Hinlegen();
            }
            r1.Schritt();

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roboter_Methode rm = new Roboter_Methode();

        int anzahlSchritte = rm.schritteGehen(5);
        rm.r1.MeldungAusgeben("Der Roboter ist " + anzahlSchritte + " Schritte gelaufen");

        int anzahlSchritte2 = rm.schritteGehen(7);
        rm.r1.MeldungAusgeben("Der Roboter ist " + anzahlSchritte2 + " Schritte gelaufen");

        int anzahlSchritte3 = rm.schritteGehen(9);
        rm.r1.MeldungAusgeben("Der Roboter ist " + anzahlSchritte3 + " Schritte gelaufen");

        //rm.schritteGehen(5);
        //rm.treppe_bauen(8);
    }
}
