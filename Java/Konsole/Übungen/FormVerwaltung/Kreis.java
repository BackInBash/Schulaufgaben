/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 */
public class Kreis {
    public double pi = Math.PI;
    
    public double fläche(double r){
        return pi*Math.pow(r,2);
    }
    public double umfang(double r){
        return 2*pi*r;
    }
}
