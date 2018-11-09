
/**
 * @author 
 */
class Point {

    double x;
    double y;

    Point() {
        x = 0;
        y = 0;
    }

    Point(double yy, double xx) {
        y = yy;
        x = xx;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    double distance(Point p) {
        double erg = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return erg;
    }

}
