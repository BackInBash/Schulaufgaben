
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Rechnung {
    Kunde kunde;
    ArrayList<Artikel> artikelliste;

    public Rechnung(Kunde kunde) {
        this.kunde = kunde;
        artikelliste = new ArrayList<Artikel>();
    }
    
    public double getGesamtbetrag() {
        double summe=0;
        for( Artikel a : artikelliste ) {
            summe += a.getPreis();
        }
        return summe;
    }
    
    public void setArtikel( Artikel artikel ) {
        artikelliste.add(artikel);
    }
    
    public void drucken () {
        System.out.println ( "Kundenname: "+ kunde.getName());
        System.out.println ( "Kundennummer: "+ kunde.getKundennummer());
        /* usw. */
        
        for( Artikel a : artikelliste ) {
            System.out.println ( "Artikel: " + a.getBezeichnung());
            System.out.println ( "Artikelnummer: " + a.getNummer());
        }
        
        System.out.println ( "Gesamtbetrag: "+ getGesamtbetrag() );
    }
}
