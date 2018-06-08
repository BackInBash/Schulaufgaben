/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Roboter_Void {

    WELT myWelt = new WELT(10, 10, 10);
    ROBOTER r1 = new ROBOTER(myWelt);

    void reiheGehen() {
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.LinksDrehen();
    }
    
    void schritteGehen(int anzahl){
        
            r1.Schritt();
        
    }

    void treppe_bauen(int hoehe) {
        r1.SprunghoeheSetzen(10);
        
        for (int j = 0; j < 4; j++) {
            
            for (int i = 0; i <=j; i++){
                r1.Hinlegen();
            }    
              r1.Schritt();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Roboter_Void rm = new Roboter_Void();
        
        //rm.reiheGehen();
        //rm.treppe_bauen(2);
        rm.schritteGehen(4);

    }
}
