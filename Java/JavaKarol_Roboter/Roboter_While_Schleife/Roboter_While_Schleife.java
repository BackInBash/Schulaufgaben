/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Roboter_While_Schleife {

    /**
     * @param args the command line arguments
     */
    public static void second(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER r1 = new ROBOTER(myWelt);

        r1.SprunghoeheSetzen(10);
        r1.VerzoegerungSetzen(10);

        int counter = 0;
        double runde = 0;

        //
        // Hinlegen
        //
        while (counter < 40) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {

                r1.Hinlegen();
                r1.Schritt();

            }
        }

        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 20) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Hinlegen();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 30) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Hinlegen();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 40) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Hinlegen();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        //
        // AUFHEBEN
        //
        while (counter < 50) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Aufheben();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 60) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Aufheben();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 70) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Aufheben();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");

        while (counter < 80) {
            counter = counter + 1;
            if (r1.IstWand()) {
                r1.LinksDrehen();
            } else {
                r1.Aufheben();
                r1.Schritt();
            }
        }
        runde = runde + 0.25;
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runde gelaufen.");
    }

}
