package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;

    JButton b1, b2;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("SHKRUANI SHUMËN QË DONI TË DEPOZITONI:");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 12));
        label1.setBounds(450,235,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(243,121,47));
        textField.setForeground(Color.WHITE);
        textField.setBounds(450,295,150,35);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOZITO");
        b1.setBounds(687,360,150,35);
        b1.setBackground(new Color(243,121,47));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("KTHEHU");
        b2.setBounds(687,420,150,35);
        b2.setBackground(new Color(243,121,47));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Ju lutem shkruani shumën që doni të depozitoni");
                }else {
                    Connn c = new Connn();
                    c.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,amount+" Lek u depozituan me sukses");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if (e.getSource()==b2){
                setVisible(false);
                new main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
