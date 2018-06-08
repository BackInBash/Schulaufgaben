/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class RoboterSchleife {

    WELT myWelt = new WELT(37, 37, 37);
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
	
	void links(){
		r1.LinksDrehen();
	}
	
	void legeSteine(int steine){
	r1.SprunghoeheSetzen(10);
	for(int i = 0; i < steine; i++){
		r1.Hinlegen();
	}
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
        rm.r1.VerzoegerungSetzen(10);
		int wdh = 0;
        do {
		rm.schritteGehen(2);
		rm.LinksDrehen();
		rm.schritteGehen(5);
		rm.legeSteine(4);
		rm.LinksDrehen();
		rm.schritteGehen(3);
		rm.legeSteine(2);
		rm.LinksDrehen();
		rm.schritteGehen(3);
		} while(7 > whd);

    }
}
