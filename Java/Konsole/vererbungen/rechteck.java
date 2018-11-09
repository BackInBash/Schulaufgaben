/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markus
 */
public class rechteck extends form {

    private double a;
    private double b;

    rechteck(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double umfang() {
        return (a * 2) + (b * 2);
    }

    double fläche() {
        return a * b;
    }

}
