import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.Color;


public class Olympic extends JComponent
{
    public void paintComponent(Graphics g)
    {
    Graphics2D g2 = (Graphics2D) g;
    Ellipse2D.Double ring1 = new Ellipse2D.Double(40,40, 100, 100);
    Ellipse2D.Double ring2 = new Ellipse2D.Double(140,40, 100, 100);
    Ellipse2D.Double ring3 = new Ellipse2D.Double(240,40, 100, 100);
    Ellipse2D.Double ring4 = new Ellipse2D.Double(90,90, 100, 100);
    Ellipse2D.Double ring5 = new Ellipse2D.Double(190,90, 100, 100);

    g2.setColor(Color.blue);
    g2.setStroke(new BasicStroke(4.0F));
    g2.draw(ring1);
    g2.setColor(Color.black);
    g2.draw(ring2);
    g2.setColor(Color.red);
    g2.draw(ring3);
    g2.setColor(Color.yellow);
    g2.draw(ring4);
    g2.setColor(Color.green);
    g2.draw(ring5);
    }  
}
