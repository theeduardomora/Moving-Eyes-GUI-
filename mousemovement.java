import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;

public class mousemovement extends MouseInputAdapter {
    private eyes object;

    public mousemovement(eyes obj) {
        object = obj;
    }

    public void mouseMoved(MouseEvent event) {
        Point p = event.getPoint();
        double theta = Math.atan2((double) (p.y - eyes.e1.y), (double) (p.x - eyes.e1.x));
        double theta2 = Math.atan2((double) (p.y - eyes.e2.y), (double) (p.x - eyes.e2.x));
        int x = (int) Math.round(Math.cos(theta) * eyes.dx) + eyes.e1.x;
        int x2 = (int) Math.round(Math.cos(theta) * eyes.dx) + eyes.e2.x;
        int y = (int) Math.round(Math.sin(theta) * eyes.dx) + eyes.e1.y;
        int y2 = (int) Math.round(Math.sin(theta) * eyes.dx) + eyes.e2.y;
        object.e1 = new Point(x, y);
        object.e2 = new Point(x2, y2);


       /* if (event.getX() > eyes.e2.x + 920) {
                eyes.e1.x += eyes.dx;
                eyes.e2.x += eyes.dx;
            }
            if (event.getY() > 1000 ) {
                eyes.e1.y += eyes.dx;
                eyes.e2.y += eyes.dx;

            }
            if (event.getX() < eyes.e1.x - 890)  {
                eyes.e1.x -= eyes.dx;
                eyes.e2.x -= eyes.dx;
            }

            if (event.getY() < 10 )   {
                eyes.e1.y -= eyes.dx;
                eyes.e2.y -= eyes.dx;

            } */

        object.repaint();
        //if ( ! ( (eyes.e1.x < 910) && (eyes.e1.x > 890) && (eyes.e2.x > 986) && (eyes.e2.x < 1006) && (eyes.e1.y < 466) && (eyes.e1.y > 446) && (eyes.e2.y < 468) && (eyes.e2.y < 468) )) { object.repaint();}

    }
}



