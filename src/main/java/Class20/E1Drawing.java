package Class20;

import javax.swing.*;
import java.awt.*;

public class E1Drawing {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
       myCanvas c = new myCanvas();
       // c.paint();
        frame.setSize(2000, 2000);
        frame.add(c);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
class myCanvas extends  Canvas{

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
       // g.fill3DRect(200,200, 500, 500,true);
        g.fillOval(100,100, 400, 400);
        g.setColor(Color.YELLOW);
        // g.fill3DRect(200,200, 500, 500,true);
        g.fillRect(600,150, 400, 400);
    }
}
