import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;


import java.awt.event.*;


// import javax.swing.*;
// import javax.swing.event.MouseInputListener;

// import java.awt.Graphics;
// import java.awt.Graphics2D;
// import java.awt.geom.Ellipse2D;

public class Circle extends JPanel implements MouseListener {
    private int count =0;
    public Circle(){
        JButton button = new JButton("button");
        JPanel panel = new JPanel();
        panel.add(button);
        button.addMouseListener(this);
        add(panel);
    }
    public void mouseClicked(MouseEvent event){
        count++;
        System.out.println("button was clicked:" + count);
    }
    public void mousePressed(MouseEvent event){}
    public void mouseReleased(MouseEvent event){}
    public void mouseEntered(MouseEvent event){}
    public void mouseExited(MouseEvent event){}

    

    
}
