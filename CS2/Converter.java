import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;


public class Converter extends JPanel implements MouseListener {
    private JTextField amount;
    private double amountDouble;// this the amount in the textfield when we change it to a number
    private JComboBox convertFrom;
    private JComboBox convertTo;
    JLabel label;

    public Converter() {
        component();

    }
    public void component(){

        convertFrom = new JComboBox();
        convertFrom.addItem("EUR");
        convertFrom.addItem("USD");
        convertFrom.addItem("GBP");

        convertTo = new JComboBox();
        convertTo.addItem("EUR");
        convertTo.addItem("USD");
        convertTo.addItem("GBP");

        convertFrom.setBorder(new TitledBorder("from"));
        convertTo.setBorder(new TitledBorder("To"));

        JButton button = new JButton("Submit");
        button.addMouseListener(this);

        amount = new JTextField(20);
        label = new JLabel("");

        JPanel textAndbutton = new JPanel();
        textAndbutton.add(amount);
        textAndbutton.add(button);

        JPanel comboBoxes = new JPanel();
        comboBoxes.add(convertFrom);
        comboBoxes.add(convertTo);
        convertFrom.setBorder(new TitledBorder("from"));

        JPanel labePanel = new JPanel();
        labePanel.add(label);

        this.setLayout(new BorderLayout());
        this.add(textAndbutton, BorderLayout.NORTH);
        this.add(comboBoxes, BorderLayout.CENTER);
        this.add(labePanel, BorderLayout.SOUTH);

    }

    @Override
    public void mouseClicked(MouseEvent e){
        double result = -1;// we put the result to -1 so if it wasnt change we know that there is a problem
        // if we couldnt convert the number in the text field to double that means it is
        // String and then we put amountDouble= -1 to know there is a problem
        try {
            amountDouble = Double.parseDouble(amount.getText());
        } catch (NumberFormatException ex) {
            amountDouble = -1;
        }

        if (amount.getText().length() == 0) {// if there is nothing in the text field we do the same with amountDouble
            amountDouble = -1;

        }
        // Put the one that was chosen from the combo boxes to String so we be able to
        // compare them
        String convertFromString = (String) convertFrom.getSelectedItem();
        String convertToString = (String) convertTo.getSelectedItem();
        if (convertFromString.equals("EUR") && convertToString.equals("USD")) {
            result = amountDouble * 1.18;
        }
        if (convertFromString.equals("USD") && convertToString.equals("EUR")) {
            result = amountDouble / 1.18;
        }
        if (convertFromString.equals("EUR") && convertToString.equals("GBP")) {
            result = amountDouble / 1.12;
        }
        if (convertFromString.equals("GBP") && convertToString.equals("EUR")) {
            result = amountDouble * 1.12;
        }
        if (convertFromString.equals("USD") && convertToString.equals("GBP")) {
            result = amountDouble / 1.32;
        }
        if (convertFromString.equals("GBP") && convertToString.equals("USD")) {
            result = amountDouble * 1.32;
        }

        if (amountDouble != -1) {
            if (result != -1) {
                label.setText(String.valueOf(result));
            } else {
                // if the amount of result is -1 that mean user didnt choose different curencies
                label.setText("ERROR!! You should choose different currencies.");
            }
        } else {
            // if amountDouble = -1 means the text in texxtfield is String or empty
            label.setText("Enter the amount you want to be converted.");
        }

    }
    public void mouseReleased(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}


}
