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
    // Roboter bis R3 in Welt 'myWelt'
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
        
        ROBOTER r2 = new ROBOTER(5, 1, 'S', myWelt);
       
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        r2.Schritt();
        
       ROBOTER r3 = new ROBOTER(10, 1, 'S', myWelt); 
        
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        r3.Schritt();
        
    // Ab Roboter R4 in 'Welt1'
        
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
