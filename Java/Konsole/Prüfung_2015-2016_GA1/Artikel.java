/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public abstract class Artikel {
    
    private int nummer;
    private String bezeichnung;
    protected double preis;

    public Artikel(int nummer, String bezeichnung, double preis) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    
    public int getNummer() {
        return nummer;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
    
    abstract public double getPreis(); 
    
}
