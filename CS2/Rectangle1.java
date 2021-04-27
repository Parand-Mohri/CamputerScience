import javax.swing.JComponent;

import sun.font.TrueTypeFont;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;



public class Rectangle1 extends JComponent{
    private int x;
    private int y  ;
    private double heigth;
    private double weigth;
    public Rectangle1(int x, int y, double heigth, double weight){
        this.x=x;
        this.y=y;
        this.heigth = heigth;
        this.weigth=weight;

    }
    public void translate (int deltax, int deltay){
        this.x += deltax;
        this.y += deltay;

    }
    public boolean contain(int xcoord , int ycoord){
        boolean flag = true;
        if (xcoord< x || xcoord > x+heigth || ycoord < y || ycoord > y+weigth){
            flag = false;
        }
        return flag;
    }


    
}
