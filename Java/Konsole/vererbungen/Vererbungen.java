/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markus
 */
public class Vererbungen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        form[] form = new form[3];
        form[0] = new rechteck(4, 3);
        form[1] = new dreieck(6, 7, 3);
        form[2] = new kreis(7);

        for (int i = 0; i < form.length; i++) {
            System.out.println("Fläche von " + form[i].getClass().getName() + " ist " + form[i].fläche());
            System.out.println("Umfang von " + form[i].getClass().getName() + " ist " + form[i].umfang());
        }
    }
}
