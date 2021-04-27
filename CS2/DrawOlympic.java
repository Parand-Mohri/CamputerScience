import javax.swing.*;
public class DrawOlympic
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame();
         
        final int height = 400;
        final int width = 500;
        frame.setSize(width, height);
        frame.setTitle("Olympic rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Olympic yo = new Olympic();
        MouseComponent2 yo = new MouseComponent2();


        frame.add(yo);
        frame.setVisible(true);
        
    }

}
