package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

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
        label1 = new JLabel("MIRËSEVINI NË ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label1.setBounds(290, 115, 450, 40);
        add(label1);

        // Numri i Kartës-------------------------------------------------------------------------
        label2 = new JLabel("Card No: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 20));
        label2.setForeground(Color.WHITE);
        label2.setBounds(225,170,375,30);
        add(label2);

        textField = new JTextField(15);
        textField.setBounds(315,170,230,30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        // PIN-i-----------------------------------------------------------------------------------
        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 20));
        label3.setForeground(Color.WHITE);
        label3.setBounds(268,230,375,30);
        add(label3);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(315, 230, 230,30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        // Butoni për Sign In-----------------------------------------------------------------------
        button1 = new JButton("FUTU");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.BLUE);
        button1.setBounds(315,280,100,30);
        button1.addActionListener(this);
        add(button1);

        // Butoni për Clear--------------------------------------------------------------------------
        button2 = new JButton("FSHI");
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setForeground(Color.RED);
        button2.setBounds(445,280,100,30);
        button2.addActionListener(this);
        add(button2);

        // Butoni për Sign Up-------------------------------------------------------------------------
        button3 = new JButton("REGJISTROHU");
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setForeground(Color.GREEN);
        button3.setBounds(315,330,230,30);
        button3.addActionListener(this);
        add(button3);

        // Background----------------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/swishbanklogin.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 450);
        add(image);

        // Dritarja-------------------------------------------------------------------------------------
        setLayout(null);
        setSize(850, 450);
        setLocation(350,200);
        setUndecorated(true);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1){
                Connn c = new Connn();
                String cardno = textField.getText();
                String pin = passwordField.getText();
                String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Numri i kartës ose PIN-i i gabuar!");
                }


            }else if (e.getSource() == button2){
                textField.setText("");
                passwordField.setText("");
            }else if (e.getSource() == button3){
                new Signup();
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
