/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Rectangle {
    
    Point llp;
    Point urp;
    

  Rectangle(Point pLL, Point pUR) {

        llp = pLL;
        urp = pUR;
        
    }
    
    Point getUpperLeft(){
        Point ulP = new Point(llp.getX(), urp.getY());
        return ulP;
}
    Point getUpperRight(){
        return urp;
    }
    Point getLowerLeft(){
        return llp;
    }
    Point getLowerRight(){
        Point ulP = new Point(urp.getX(), llp.getY());
        return ulP;
    }
    double getDiagonaleLength() {
        return llp.distance(urp);
    }
}
