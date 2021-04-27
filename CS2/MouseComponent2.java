import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MouseComponent2 extends JComponent {
    private int x = 20;
    private int y = 20;

    public MouseComponent2() {
        class MousePressListener implements MouseListener {
            public void mousePressed(MouseEvent event) {
                x = event.getX();
                y = event.getY();
                repaint();
            }

            public void mouseReleased(MouseEvent event) {
            }

            public void mouseClicked(MouseEvent event) {
            }

            public void mouseEntered(MouseEvent event) {
            }

            public void mouseExited(MouseEvent event) {
            }
        }
        MouseListener listener = new MousePressListener();
        addMouseListener(listener);
    }
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Parand", x, y);

    }

}
