/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Lebensversicherung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kap = 1000000;
        int jahre=0;
        
         do {
            kap -= 5000*12; // jährliche Rente
            if ( kap > 0) 
                kap += kap*0.04;
            jahre++;
            System.out.println("Im Jahr "+jahre+" ist das Kapital "+kap );
        } while( kap > 0 );
        System.out.println("Das Geld ist nach "+jahre+"  Jahren aufgebraucht" );
        
        
    }
    
}
