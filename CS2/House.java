import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;



public class House extends JComponent 
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Square box = new Square(100, 100 , 100); //i used the square class that we make last week for the body
        Square window = new Square(130,180,25);
        Rectangle door = new Rectangle(80,200,25,50);
        Point2D.Double r1 = new Point2D.Double(50,150);
        Point2D.Double r2 = new Point2D.Double(100,100);
        Point2D.Double r3 = new Point2D.Double(150,150);

        Line2D.Double roof = new Line2D.Double(r1, r2);
        Line2D.Double roof1 = new Line2D.Double(r3, r2);
        
        g2.draw(box);
        g2.draw(door);
        g2.draw(window);
        g2.draw(roof);
        g2.draw(roof1);


        
    }

}