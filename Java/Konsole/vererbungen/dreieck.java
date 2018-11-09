/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markus
 */
public class dreieck extends form {

    private double a;
    private double b;
    private double h;

    dreieck(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    double umfang() {
        return a + b + h;
    }

    double fläche() {
        return 0.5 * a * h;
    }

}
