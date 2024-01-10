package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    // Komponentët--------------------------------------------------------------------------------
    JLabel label1, label2, label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton button1, button2, button3;

    // Konstruktori i klasës Login-----------------------------------------------------------------
    Login(){
        super("SWISH BANK");

        // Mirësevini-----------------------------------------------------------------------------
        label1 = new JLabel("MIRËSEVINI NË SWISH ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label1.setBounds(250, 105, 450, 40);
        add(label1);

        // Numri i Kartës-------------------------------------------------------------------------
        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 20));
        label2.setForeground(Color.WHITE);
        label2.setBounds(235,170,375,30);
        add(label2);

        textField = new JTextField(15);
        textField.setBounds(325,170,230,30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        // PIN-i-----------------------------------------------------------------------------------
        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label3.setBounds(278,230,375,30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325, 230, 230,30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        // Butoni për Sign In-----------------------------------------------------------------------
        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.BLUE);
        button1.setBounds(325,280,100,30);
        button1.addActionListener(this);
        add(button1);

        // Butoni për Clear--------------------------------------------------------------------------
        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setForeground(Color.RED);
        button2.setBounds(455,280,100,30);
        button2.addActionListener(this);
        add(button2);

        // Butoni për Sign Up-------------------------------------------------------------------------
        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setForeground(Color.GREEN);
        button3.setBounds(325,330,230,30);
        button3.addActionListener(this);
        add(button3);

        // Background----------------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/loginbg.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 450);
        add(image);

        // Dritarja-------------------------------------------------------------------------------------
        setLayout(null);
        setSize(850, 480);
        setLocation(350,200);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Logjika e klikimeve të butonave--------------------------------------------------------------
        try{
            if (e.getSource() == button1){

            }else if (e.getSource() == button2) {
                textField.setText("");
                passwordField.setText("");
            } else if (e.getSource() == button3) {

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) { new Login(); }
}
