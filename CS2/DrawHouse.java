import javax.swing.*;
public class DrawHouse {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        final int height = 300;
        final int width = 400;
        frame.setSize(width, height);
        frame.setTitle("House");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        House body = new House ();
        frame.add(body);
        frame.setVisible(true);
    }   
}
