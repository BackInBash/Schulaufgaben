/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class RoboterSteuern {

    /**
     * @param args the command line arguments
     */
    public static void test(String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER myRob = new ROBOTER(myWelt);
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Schritt();
        myRob.Schritt();
        myRob.Schritt();
        myRob.Schritt();
        myRob.RechtsDrehen();
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        myRob.Schritt();
        myRob.Hinlegen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.LinksDrehen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.LinksDrehen();
        myRob.Aufheben();
        // TODO code application logic here
    }
    
    public static void bauen (String[] args) {
        WELT myWelt = new WELT(10, 10, 10);
        ROBOTER myRob = new ROBOTER(myWelt);
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Schritt();
        myRob.Schritt();
        myRob.Schritt();
        myRob.Schritt();
        myRob.RechtsDrehen();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.MarkeSetzen();
        myRob.LinksDrehen();
        myRob.QuaderAufstellen();
        myRob.RechtsDrehen();
        myRob.Schritt();
        
        myRob.LinksDrehen();
        myRob.LinksDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        myRob.RechtsDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        myRob.RechtsDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        myRob.RechtsDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        myRob.RechtsDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        myRob.RechtsDrehen();
        myRob.MarkeLoeschen();
        myRob.Schritt();
        myRob.LinksDrehen();
        myRob.Hinlegen();
        
        
        
    }
    
}
