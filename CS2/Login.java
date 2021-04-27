import javax.swing.*;
import javax.swing.event.MouseInputListener;



import java.awt.BorderLayout;
import java.awt.event.*;

public class Login extends JPanel implements MouseListener {
    private JTextField username;
    private JTextField password;
    private static String[] usernames = { "ParandMohri", "ArdibeheshtMohri" };
    private static String[] passwords = { "ParandMohri", "123456789" };
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    int count = 0;// count how many time user tried to login
    int check = -1;// check if the first "if statement" was executed if so dont execute the second
                   // one

    public Login() {
        JButton button = new JButton("Submit");
        button.addMouseListener(this);

        username = new JTextField(20);
        password = new JTextField(20);

        usernameLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(usernameLabel);
        usernamePanel.add(username);

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(passwordLabel);
        passwordPanel.add(password);

        this.setLayout(new BorderLayout());
        this.add(usernamePanel, BorderLayout.NORTH);
        this.add(passwordPanel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        count++;// each time listener call that mean the button was clicked and the user tried
                // to login
        for (int i = 0; i < usernames.length; i++) {
            if (username.getText().toLowerCase().equals(usernames[i].toLowerCase())
                    && password.getText().equals(passwords[i])) {
                check = 1;
                JOptionPane.showMessageDialog(null, "Welcome", "Sucsessful Loging", JOptionPane.INFORMATION_MESSAGE);

            }
        }
        if (check == -1 && count <= 3) { // if check = -1 that mean username or password was wrong so we print a warning
            JOptionPane.showMessageDialog(null,
                    "Username or password is wrong!\n Your remaning chances:  " + (4 - count), "Warning!",
                    JOptionPane.WARNING_MESSAGE);
        }

        if (count > 3) {
            JOptionPane.showMessageDialog(null, "To many wrong!", "ERROR!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}


}
