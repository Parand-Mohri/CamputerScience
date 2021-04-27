import java.awt.Rectangle;
public class Square extends Rectangle {
    public Square(int x , int y , int length)
    {
        setLocation(x - (length/2), y+(length/2));
    //because in regtangle (x,y) are in top left and here in central we need to give the(x,y)like this to the constractur of rectangle 
        setSize(length, length); //because rectange get width and heigth but here both of those are equal 
    }
    public double getArea()
    {
        return width * height;
    }
    public String toString()
    {
        return ("Square [x=" + (x + (width/2))   +", y=" + (y - (width/2)) +", length = " + width + "]");
        //because we change the x and y in the constructor for printing we need to make them back 
    }
}
