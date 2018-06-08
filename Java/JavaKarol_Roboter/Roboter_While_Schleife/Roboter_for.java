/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 
 */
public class Roboter_for {

    public static void main(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER r1 = new ROBOTER(myWelt);
        
        r1.SprunghoeheSetzen(10);
        r1.VerzoegerungSetzen(10);
        
        int counter = 0;
        //double runde = 0;
        int lauf = 0;

        //while (runde < 2.0) {
        for(double runde = 0; runde < 2.0;){
            while (r1.IstWand() == false) {
                if (r1.IstZiegel()) {
                    while (r1.IstZiegel()) {
                        r1.Aufheben();
                    }
                } else {
                    //int steinCounter = 0;
                    if (counter % 2 == 1) {
                        /**
                         * Ist "counter" durch 2 nicht teilbar "if" werden 3 Steine
                         * aufeinander gelegt Ist "counter durch 2 teilbar
                         * "else" dann werden 5 Steine aufeinander gelgegt.
                         */
                        /*while (steinCounter < 3) {
                            r1.Hinlegen();
                            steinCounter = steinCounter + 1;
                        }*/
                        for(int steinCounter = 0; steinCounter < 5; steinCounter++){
                            r1.Hinlegen();
                        }
                    } else {
                        /*while (steinCounter < 5) {
                            r1.Hinlegen();
                            steinCounter = steinCounter + 1;
                        }*/
                        for(int steinCounter = 0; steinCounter < 3; steinCounter++){
                            r1.Hinlegen();
                        }
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

    }
}