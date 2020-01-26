import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Point;

public class eyes extends JLabel  {
    public static Point e1;
    public static Point e2;
    public static int dx;


    eyes() {}
    eyes(ImageIcon a) {
        super(a);
        e1 = new Point(900, 456);
        e2 = new Point(996, 456);
        dx = 5;


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillOval(e1.x, e1.y, 35, 35);
        g.fillOval(e2.x, e2.y, 37, 37);
    }



     /* public void mousemove(MouseEvent event) {
         if (event.getX() > 1200) {
             e1.x += dx;
             e2.x += dx;
         }
         if (event.getY() > 650) {
             e1.y += dx;
             e2.y += dx;

         }
         if (event.getX() < 700) {
             e1.x -= dx;
             e2.x -= dx;
         }

         if (event.getY() < 280) {
             e1.y -= dx;
             e2.y -= dx;

         }
         repaint();
     } */





}