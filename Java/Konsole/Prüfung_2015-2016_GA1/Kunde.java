/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Kunde {
    private int Kundennummer;
    private String name;
    private String strasse;
    private int plz;
    private String ort;

    public Kunde(int Kundennummer, String name, String strasse, int plz, String ort) {
        this.Kundennummer = Kundennummer;
        this.name = name;
        this.strasse = strasse;
        if( plz > 0 && plz < 100000 )
            this.plz = plz;
        else {
            this.plz = 99999;
        }
        this.ort = ort;
    }

    public int getKundennummer() {
        return Kundennummer;
    }

    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }
}
