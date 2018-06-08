/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class RoboterSammlung {
    
    public static void main(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER r1 = new ROBOTER(myWelt);
        
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        r1.Schritt();
        
        ROBOTER r2 = new ROBOTER(myWelt);
        
        r2.LinksDrehen();
        r2.Schritt();
        r2.RechtsDrehen();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        
       ROBOTER r3 = new ROBOTER(myWelt); 
        
        r3.LinksDrehen();
        r3.Schritt();
        r3.Schritt();
        r3.RechtsDrehen();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        
        WELT Welt1 = new WELT(15, 5, 10);
        ROBOTER r4 = new ROBOTER(Welt1);
        
        r4.Schritt();
        r4.Schritt();
        r4.Schritt();
        r4.Schritt();
        
     
        
        ROBOTER r5 = new ROBOTER(Welt1);
        
        r5.LinksDrehen();
        r5.Schritt();
        r5.RechtsDrehen();
        r5.Schritt();
        r5.Schritt();
        r5.Schritt();
        r5.Schritt();
        
        ROBOTER r6 = new ROBOTER(Welt1);
        
        r6.LinksDrehen();
        r6.Schritt();
        r6.Schritt();
        r6.RechtsDrehen();
        r6.Schritt();
        r6.Schritt();
        r6.Schritt();
        r6.Schritt();

        
        
        
        
   
    }
        
}
