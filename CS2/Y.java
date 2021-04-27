import javax.swing.JFrame;

public class Y{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle circle = new Circle();
        frame.add(circle);
        frame.setVisible(true);
    }
}
    