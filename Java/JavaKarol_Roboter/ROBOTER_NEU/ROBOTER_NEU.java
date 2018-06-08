/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class ROBOTER_NEU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WELT myWelt = new WELT(12, 12, 10);
        ROBOTER r1 = new ROBOTER(2, 2, 'S', myWelt);

        // TODO code application logic here
        for(;;){
        r1.Hinlegen();
        r1.LinksDrehen();
        r1.Schritt();
        r1.RechtsDrehen();
        r1.Schritt();
        }
        /*
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                r1.MarkeSetzen();
                r1.Schritt();
            } else {
                r1.Schritt();
            }
        }

        r1.LinksDrehen();
        r1.LinksDrehen();

        for (int o = 0; o < 10; o++) {
            if (o % 2 == 1) {
                r1.MarkeLoeschen();
                r1.Schritt();
            } else {
                r1.Schritt();
            }

        }
        r1.Schritt();
        r1.LinksDrehen();
        r1.LinksDrehen();
*/
    }
}
