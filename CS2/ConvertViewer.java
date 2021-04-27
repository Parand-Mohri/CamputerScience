import javax.swing.*;


public class ConvertViewer{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(400, 150);
        frame.setTitle("Convert money");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Converter converter = new Converter();
        frame.add(converter);
        frame.setVisible(true);
    }
}