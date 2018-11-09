/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author markus
 */
public class kreis extends form {

    private double pi = Math.PI;
    private double r;

    kreis(double r) {
        this.r = r;
    }

    double umfang() {
        return 2 * pi * r;
    }

    double fläche() {
        return pi * Math.sqrt(r);
    }
}
