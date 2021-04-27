import javax.swing.JFrame;

public class LoginViewer{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(400, 150);
        frame.setTitle("convert money");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setTitle("Login");
        Login login = new Login();
        frame.add(login);

        frame.setVisible(true);
    }
}