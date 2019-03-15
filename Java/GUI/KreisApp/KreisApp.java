import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class ZeichenObjekt {
    
    int x=-999;
    int y=-999;
    String art = "Kreis";
    
    ZeichenObjekt( int x, int y, String art){
        this.x=x;
        this.y=y;
        this.art=art;
    }
}

public class KreisApp extends Frame {

    String art="Kreis";
    ArrayList<ZeichenObjekt> zoList = new ArrayList<ZeichenObjekt>();
    
    public KreisApp ()    {
         super("Kreis-Anwendung");
		setSize(400, 300);
		setVisible(true);

           addWindowListener(
              new WindowAdapter() {
                 public void windowClosing(WindowEvent event)   {
                    System.exit(0);
                 }
                 
                 public void windowActivate ( WindowEvent event)   {
                    System.out.println("Aktiv");
                 }
              }
          );
           
          addMouseListener(
              new MouseAdapter() {
                 
                 public void mousePressed ( MouseEvent event)   {
                    System.out.println("Position: "+event.getX() 
                            +" / "+event.getY());
                    ZeichenObjekt z = new ZeichenObjekt(
                            event.getX(),event.getY(), art);
                    zoList.add(z);
                    repaint();
                 }
              }
          );
          
          addKeyListener(
              new KeyAdapter() {
                 
                 public void keyPressed ( KeyEvent event)   {
                    switch (event.getKeyCode() ) {
                    case KeyEvent.VK_R:
                        art="Rechteck";
                        break;
                    case KeyEvent.VK_K:
                        art="Kreis";
                        break;
                    case KeyEvent.VK_D:
                        art="Dreieck";
                        break;
                    case KeyEvent.VK_Q:
                        art="Quadrad";
                        break;
                    }
                 }
              }
          );
           
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KreisApp k = new KreisApp();
    }
    
    public void paint(Graphics g)   {
        g.drawOval(70,40,140,140);
        System.out.println("zeichnen");
        for( ZeichenObjekt z : zoList  ){
            
            switch (z.art ) {
            case "Rechteck":
                g.drawRect(z.x-25, z.y-50, 50, 100);
                break;
            case "Kreis":
                g.drawOval(z.x-50, z.y-50, 100, 100);
                break;
            case "Dreieck":
                int[] arrX = { z.x-50, z.x+20, z.x+70};
                int[] arry = { z.y-50, z.y+10, z.y+25};
                g.drawPolygon(arrX, arry, 3);
                break;
            case "Quadrad":
                g.drawRect(z.x-50, z.y-50, 100, 100);
                break;
            }

        }
        
    }
    
}
