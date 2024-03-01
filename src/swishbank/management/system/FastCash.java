package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/atm.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        b1 = new JButton("1000 Lek");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(243,121,47));
        b1.setBounds(450,235,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("2000 Lek");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(243,121,47));
        b2.setBounds(687,235,150,35);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("5000 Lek");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(243,121,47));
        b3.setBounds(450,295,150,35);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("10000 Lek");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(243,121,47));
        b4.setBounds(687,295,150,35);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("20000 Lek");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(243,121,47));
        b5.setBounds(450,360,150,35);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("50000 Lek");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(243,121,47));
        b6.setBounds(687,360,150,35);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("KTHEHU");
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
        if (e.getSource()==b7) {
            setVisible(false);
            new main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Connn c = new Connn();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Balancë e pamjaftueshme");
                    return;
                }

                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, amount+"Lekë u debituan me sukses");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}