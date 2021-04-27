import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This program demonstrates how to install an action listener.
 */
public class ButtonViewer {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       JButton button = new JButton("Click me!");
       JButton button1 = new JButton("Click");
       JPanel panel = new JPanel();
       panel.add(button);
       panel.add(button1);
       frame.add(panel);


       ActionListener listener = new ClickListener();
       ActionListener listener1 = new ClickListener();
       button.addActionListener(listener);
       button1.addActionListener(listener1);
       frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);

}
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 500;
    
}

