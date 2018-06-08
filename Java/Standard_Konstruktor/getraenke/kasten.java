/**
 *
 * @author 
 */

public class kasten {

    private int leergewicht = 400;

    int getGesamtgewicht() {

        int r = (int) (Math.random() * 1000.0 + 1);
        int gesamtGewicht = leergewicht;
        flasche fArr[] = new flasche[12];
        for (int i = 0; i<12; i++){
              if ( i == 0){
                fArr[i] = new flasche(0);
            } else {
            fArr[i] = new flasche(r);
            }
            gesamtGewicht = gesamtGewicht + fArr[i].getgewicht(); 
        }
        return gesamtGewicht;
       /*
        flasche f1 = new flasche(r);
        flasche f2 = new flasche(r);
        flasche f3 = new flasche(r);
        flasche f4 = new flasche(r);
        flasche f5 = new flasche(r);
        flasche f6 = new flasche(r);
        flasche f7 = new flasche(r);
        flasche f8 = new flasche(r);
        flasche f9 = new flasche(r);
        flasche f10 = new flasche(r);
        flasche f11 = new flasche(r);
        flasche f12 = new flasche(0);

        return leergewicht + f1.getgewicht() + f2.getgewicht() + f3.getgewicht() + f4.getgewicht() + f5.getgewicht() + f6.getgewicht() + f7.getgewicht() + f8.getgewicht() + f9.getgewicht() + f10.getgewicht() + f11.getgewicht() + f12.getgewicht();
        */
    }

    public static void main(String[] args) {

        kasten k = new kasten();
        System.out.println("Gesammtgewicht:" + k.getGesamtgewicht());
    }

}
