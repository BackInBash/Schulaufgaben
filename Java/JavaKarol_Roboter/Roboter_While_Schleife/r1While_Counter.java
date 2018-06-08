/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class r1While_Counter {

    /**
     * @param args the command line arguments
     */
    public static void lol(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER r1 = new ROBOTER(myWelt);

        r1.SprunghoeheSetzen(10);
        r1.VerzoegerungSetzen(10);

        int counter = 0;
        double runde = 0;
        int lauf = 0;

        while (runde < 4.0) {
            while (r1.IstWand() == false) {
                if (r1.IstZiegel() == false) {
                    int steinCounter = 0;
                    while (steinCounter < 5) {
                        r1.Hinlegen();
                        steinCounter = steinCounter + 1;
                    }
                    r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                } else {
                    while (r1.IstZiegel()) {

                        r1.Aufheben();
                        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                    }
                }

                r1.Schritt();
                counter = counter + 1;
                lauf = lauf + 1;
            }
            runde = runde + 0.25;
            r1.LinksDrehen();
            r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
            lauf = 0;
        }
        /*
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
        while (counter < 9) {
            if (r1.IstZiegel() == false) {
                int steinCounter = 0;
                while (steinCounter < 5) {
                    r1.Hinlegen();
                    steinCounter = steinCounter + 1;
                }
                r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
                steinCounter = 0;
            } else {
                while (r1.IstZiegel()) {

                    r1.Aufheben();

                }
            }

            r1.Schritt();
            counter = counter + 1;
        }
        runde = runde + 0.25;
        r1.LinksDrehen();
        r1.MeldungAusgeben("Der Roboter ist bisher " + counter + " Schritte und " + runde + " Runden gelaufen.");
        counter = 0;
         */
    }
}
