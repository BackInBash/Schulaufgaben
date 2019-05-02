/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Rechnungserstellung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kunde k = new Kunde(123, "Bayer", "Road", 12345, "Nixdorf");
        
        Volumenlizenz v = new Volumenlizenz(33, 1, "Win", 9.32 );
        Einzellizenz e = new Einzellizenz(2, "Win7", 23.12);
        
        Rechnung r = new Rechnung(k);
        r.setArtikel(v);
        r.setArtikel(e);
        r.drucken();
    }
    
}
