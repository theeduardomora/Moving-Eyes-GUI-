import java.awt.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.event.*;

public class meme extends MouseInputAdapter{
    public static void main (String[] args) {
        meme obj = new meme();

    }

    private JFrame frame;
    private JPanel panel;
    private JLabel label;


    public meme(){
        //panel = new JPanel(new FlowLayout());


        //Frame
        frame = new JFrame("The eyes follow you");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500, 500));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        //Image
        ImageIcon memebackground = new ImageIcon("heavybreathingmemenoeyes.jpg");

        //label = new JLabel(memebackground);

        eyes leseyes = new eyes(memebackground);
        mousemovement mlistener = new mousemovement(leseyes);


        leseyes.addMouseListener(mlistener);
        leseyes.addMouseMotionListener(mlistener);

        frame.add(leseyes, BorderLayout.CENTER);


    }

    /*public void mousemove(MouseEvent event) {
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
