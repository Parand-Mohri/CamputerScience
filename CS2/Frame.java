public class Component extends JComponent {
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        //Point 
        // Point2D.Double p1 = new Point2D.Double(x, y);
        Point2D.Double p1 = new Point2D.Double(50,150);
        Point2D.Double p2 = new Point2D.Double(150,150);


        //Line 
        // Line2D.Double L1 = Line2D.Double(doubleX1, doubleY1, doubleX2, doubleY2)
        // Line2D.Double L2 = new Line2D.Double(Point2D p1, Point2D p2)
        Line2D.Double L1 = new Line2D.Double(p1,p2);
        Line2D.Double L2 = new Line2D.Double(50,150,150,150);

        //Circle 
        // Ellipse2D.Double(double x, double y, double width, double height) 
        //x and y are the codinate of the point up left of the rectangle that circle is in
        Ellipse2D.Double c1 = new Ellipse2D.Double(140,40, 100, 100);

        //Color
        // g2.setColor(Color.nameofthecolor);
        // Color(int red, int green, int blue)
        //we cant put color on somthing if we want to draw components with different colors each time we need to set the color draw the specific component change the color and draw again 
        // g2.draw(component);
        g2.setColor(Color.black);
        g2.draw(c1);
        g2.setColor(Color.red);
        g2.draw(L1);


        //Tickness of the line 
        // g2.setStroke(new BasicStroke(4.0F));
        //for ticker of tinner line can change the 4 
        //like color if you want different tickness each time you need to change and draw
        g2.setStroke(new BasicStroke(4.0F));

        //Drawing Strings
        // g2.drawString(String s, float x, float y);
        g2.drawString("Parand", 50, 100);

        //Font
        // Font(String name, int style, int size)
        // Font(String font name, int style, int size)
        Font myFont = new Font(“Serif”, Font.BOLD, 36);
        g2.setFont(myFont);

    }
}

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(width, height);
        frame.setSize(300, 400);
        frame.setTitle("title");
        // frame.add(comp)
        frame.setVisible(true);
    }

}





