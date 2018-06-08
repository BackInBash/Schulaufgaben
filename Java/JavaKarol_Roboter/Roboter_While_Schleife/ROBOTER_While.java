/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ROBOTER_While {

    /**
     * @param args the command line arguments
     */
    public static void secondd(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER r1 = new ROBOTER(myWelt);

        r1.SprunghoeheSetzen(10);
        r1.VerzoegerungSetzen(50);

        int counter = 0;
        double runde = 0;

        /*
      HINLEGEN
         */
        while (counter < 40) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
                runde = runde + 0.25;
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
            } else {

                r1.Hinlegen();
                r1.Schritt();

            }
        }

        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");

        /*
    AUFHEBEN
         */
        while (counter < 80) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
                runde = runde + 0.25;
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
            } else {

                r1.Aufheben();
                r1.Schritt();

            }
        }

        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
    }
}
