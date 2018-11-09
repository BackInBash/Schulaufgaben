
/**
 *
 * @author 
 */
public class flasche {

    private int leergewicht = 150;
    private int fuellstand;

    public flasche(int fuellstand) {

        this.fuellstand = fuellstand;
    }

    public int getgewicht() {
        return leergewicht + fuellstand;
    }

}
