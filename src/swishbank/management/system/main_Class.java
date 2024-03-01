package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        b1 = new JButton("DEPOZITO");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(243,121,47));
        b1.setBounds(450,235,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("TËRHIQ");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(243,121,47));
        b2.setBounds(687,235,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("TËRHIQ SHPEJT");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(243,121,47));
        b3.setBounds(450,295,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("PRINTO FATURË");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(243,121,47));
        b4.setBounds(687,360,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("NDRYSHO PIN");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(243,121,47));
        b5.setBounds(450,360,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCA");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(243,121,47));
        b6.setBounds(687,295,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("DIL");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(243,121,47));
        b7.setBounds(687,420,150,35);
        b7.addActionListener(this);
        l3.add(b7);

        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
        }
    }

    public static void main(String[] args) {
        new main_Class("");
    }
}