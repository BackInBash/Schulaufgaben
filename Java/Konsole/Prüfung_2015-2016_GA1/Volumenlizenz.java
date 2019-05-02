/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Volumenlizenz extends Artikel {

    private int anzahl;
    
    public Volumenlizenz(int anzahl, int nummer, String bezeichnung, double preis) {
        super(nummer, bezeichnung, preis);
        
        if(anzahl < 10 )
            this.anzahl = 10;
        else
            this.anzahl = anzahl;
    }

    @Override
    public double getPreis() {
        return preis * anzahl * 0.90;
    }
    
    
}
