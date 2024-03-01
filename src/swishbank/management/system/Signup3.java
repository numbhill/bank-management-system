package swishbank.management.system;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.server.ExportException;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    // Komponentët----------------------------------------------------------------------------
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formno;

    Signup3(String formno) {

        this.formno = formno;

        // Numri i faqes---------------------------------------------------------------------
        JLabel l1 = new JLabel("Faqja 3");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        // Detaje llogarie-------------------------------------------------------------------
        JLabel l2 = new JLabel("Detaje llogarie");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        // Lloji i llogarisë------------------------------------------------------------------
        JLabel l3 = new JLabel("Lloji i llogarisë:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Llogari Kursimi");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setOpaque(false);
        r1.setForeground(Color.WHITE);
        r1.setBounds(100, 180, 150, 30);
        add(r1);

        r2 = new JRadioButton("Llogari Depozitimi");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setOpaque(false);
        r2.setForeground(Color.WHITE);
        r2.setBounds(350, 180, 300, 30);
        add(r2);

        r3 = new JRadioButton("Llogari e Kursit të tanishëm");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setOpaque(false);
        r3.setForeground(Color.WHITE);
        r3.setBounds(100, 220, 250, 30);
        add(r3);

        r4 = new JRadioButton("Llogari e Depozitës së përsëritur");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setOpaque(false);
        r4.setForeground(Color.WHITE);
        r4.setBounds(350, 220, 250, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        // Detajet e Kartës------------------------------------------------------------------
        JLabel l4 = new JLabel("Detajet e Kartës:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setForeground(Color.WHITE);
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        // Karta-----------------------------------------------------------------------------
        JLabel l5 = new JLabel("16-shifrori i kartës së bankës:");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setForeground(Color.WHITE);
        l5.setBounds(100, 330, 200, 20);
        add(l5);

        // 16-shifrori-----------------------------------------------------------------------
        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setForeground(Color.WHITE);
        l6.setBounds(330, 300, 250, 30);
        add(l6);

        // Detaje----------------------------------------------------------------------------
        JLabel l7 = new JLabel("(Ky numër do të jetë i disponueshëm pasi të keni përfunduar me regjistrimin tuaj)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setForeground(Color.WHITE);
        l7.setBounds(330, 330, 500, 20);
        add(l7);

        // PIN-------------------------------------------------------------------------------
        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setForeground(Color.WHITE);
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        // XXXX------------------------------------------------------------------------------
        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setForeground(Color.WHITE);
        l9.setBounds(330, 370, 200, 30);
        add(l9);

        // 4-shifrori------------------------------------------------------------------------
        JLabel l10 = new JLabel("(Passwordi 4-shifror gjithashtu)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setForeground(Color.WHITE);
        l10.setBounds(100, 400, 200, 20);
        add(l10);

        // Facilitetet e Kartës--------------------------------------------------------------
        JLabel l11 = new JLabel("Facilitetet e Kartës:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setForeground(Color.WHITE);
        l11.setBounds(100, 450, 200, 30);
        add(l11);

        c1 = new JCheckBox("Kart ATM");
        c1.setOpaque(false);
        c1.setForeground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setOpaque(false);
        c2.setForeground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setOpaque(false);
        c3.setForeground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setOpaque(false);
        c4.setForeground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setOpaque(false);
        c5.setForeground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setOpaque(false);
        c6.setForeground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        // Deklarim--------------------------------------------------------------------------
        JCheckBox c7 = new JCheckBox("Unë këtu deklaroj se detajet e mësipërme të futura janë të sakta.", true);
        c7.setOpaque(false);
        c7.setForeground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 20);
        add(c7);

        // Numri i formularit----------------------------------------------------------------
        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        // Numri i formularit----------------------------------------------------------------
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        // Prano-----------------------------------------------------------------------------
        s = new JButton("PRANO");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(new Color(243, 121, 47));
        s.setForeground(Color.WHITE);
        s.setBounds(250, 720, 100, 30);
        s.addActionListener(this);
        add(s);

        // Anullo----------------------------------------------------------------------------
        c = new JButton("ANULLO");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(new Color(243, 121, 47));
        c.setForeground(Color.WHITE);
        c.setBounds(420, 720, 100, 30);
        c.addActionListener(this);
        add(c);

        // Background---------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/swishbanksignup.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 800);
        add(image);

        // Dritarja------------------------------------------------------------------------------
        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if (c1.isSelected()) {
            fac = fac + "ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac + "Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac + "Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac + "EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (c6.isSelected()) {
            fac = fac + "E-Statement";
        }

        try {
            if (e.getSource() == s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    Connn c1 = new Connn();
                    String q1 = "insert into signupthree values('" + formno + "', '" + atype + "','" + cardno + "','" + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number : " + cardno + "\n Pin : " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
