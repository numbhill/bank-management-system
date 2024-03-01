package swishbank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    // Komponentët----------------------------------------------------------------------------
    JButton next;
    JTextField textName, textFname, textEmail, textAdd, textCity, textPcode, textState;
    JDateChooser dateChooser;
    JRadioButton r1, r2, s1, s2, s3;

    // Gjenerimi i një numri random-----------------------------------------------------------
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    // Konstruktori i klasës Signup-----------------------------------------------------------
    Signup(){
        super("SWISH BANK - APLIKIM");

        // Numri i aplikimit------------------------------------------------------------------
        JLabel label1 = new JLabel("FORMULAR APLIKIMI No." + first);
        label1.setFont(new Font("Railway", Font.BOLD, 38));
        label1.setForeground(Color.WHITE);
        label1.setBounds(170,20,600,40);
        add(label1);

        // Numri i faqes-----------------------------------------------------------------------
        JLabel label2 =new JLabel("Faqja e parë");
        label2.setFont(new Font("Railway", Font.BOLD, 22));
        label2.setForeground(Color.WHITE);
        label2.setBounds(435,70,600,30);
        add(label2);

        // Të Dhënat Personale------------------------------------------------------------------
        JLabel label3 =new JLabel("Të Dhënat Personale");
        label3.setFont(new Font("Railway", Font.BOLD, 22));
        label3.setForeground(Color.WHITE);
        label3.setBounds(380,95,600,30);
        add(label3);

        // Emri----------------------------------------------------------------------------------
        JLabel labelName = new JLabel("Emri: ");
        labelName.setFont(new Font("Railway", Font.BOLD, 20));
        labelName.setForeground(Color.WHITE);
        labelName.setBounds(100,150,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Railway", Font.BOLD, 14));
        textName.setBounds(300,150,400,30);
        add(textName);

        // Atësia--------------------------------------------------------------------------------
        JLabel labelfName = new JLabel("Atësia: ");
        labelfName.setFont(new Font("Railway", Font.BOLD, 20));
        labelfName.setForeground(Color.WHITE);
        labelfName.setBounds(100,200,100,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Railway", Font.BOLD, 14));
        textFname.setBounds(300,200,400,30);
        add(textFname);

        // Ditëlindja----------------------------------------------------------------------------
        JLabel DOB = new JLabel("Ditëlindja: ");
        DOB.setFont(new Font("Railway", Font.BOLD, 20));
        DOB.setForeground(Color.WHITE);
        DOB.setBounds(100,250,130,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105,105));
        dateChooser.setBounds(300,250,400,30);
        add(dateChooser);

        // Gjinia--------------------------------------------------------------------------------
        JLabel labelG = new JLabel("Gjinia: ");
        labelG.setFont(new Font("Railway", Font.BOLD, 20));
        labelG.setForeground(Color.WHITE);
        labelG.setBounds(100,300,130,30);
        add(labelG);

        r1 = new JRadioButton("Mashkull");
        r1.setFont(new Font("Railway", Font.BOLD, 14));
        r1.setOpaque(false);
        r1.setForeground(Color.WHITE);
        r1.setBounds(400,300, 90,30);
        add(r1);

        r2 = new JRadioButton("Femër");
        r2.setFont(new Font("Railway", Font.BOLD, 14));
        r2.setOpaque(false);
        r2.setForeground(Color.WHITE);
        r2.setBounds(515,300, 90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        // Email----------------------------------------------------------------------------------
        JLabel labelEmail = new JLabel("Email: ");
        labelEmail.setFont(new Font("Railway", Font.BOLD, 20));
        labelEmail.setForeground(Color.WHITE);
        labelEmail.setBounds(100,350,130,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Railway", Font.BOLD, 14));
        textEmail.setBounds(300,350,400,30);
        add(textEmail);

        // Statusi--------------------------------------------------------------------------------
        JLabel labelStatus = new JLabel("Statusi: ");
        labelStatus.setFont(new Font("Railway", Font.BOLD, 20));
        labelStatus.setForeground(Color.WHITE);
        labelStatus.setBounds(100,400,130,30);
        add(labelStatus);

        s1 = new JRadioButton("Beqar");
        s1.setFont(new Font("Railway", Font.BOLD, 14));
        s1.setOpaque(false);
        s1.setForeground(Color.WHITE);
        s1.setBounds(350,400, 90,30);
        add(s1);

        s2 = new JRadioButton("Martuar");
        s2.setFont(new Font("Railway", Font.BOLD, 14));
        s2.setOpaque(false);
        s2.setForeground(Color.WHITE);
        s2.setBounds(450,400, 90,30);
        add(s2);

        s3 = new JRadioButton("Divorcuar");
        s3.setFont(new Font("Railway", Font.BOLD, 14));
        s3.setOpaque(false);
        s3.setForeground(Color.WHITE);
        s3.setBounds(550,400, 100,30);
        add(s3);

        ButtonGroup buttonGroupS = new ButtonGroup();
        buttonGroupS.add(s1);
        buttonGroupS.add(s2);
        buttonGroupS.add(s3);

        // Adresa-------------------------------------------------------------------------------
        JLabel labelAdd = new JLabel("Adresa: ");
        labelAdd.setFont(new Font("Railway", Font.BOLD, 20));
        labelAdd.setForeground(Color.WHITE);
        labelAdd.setBounds(100,450,130,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Railway", Font.BOLD, 14));
        textAdd.setBounds(300,450,400,30);
        add(textAdd);

        // Qyteti-------------------------------------------------------------------------------
        JLabel labelCity = new JLabel("Qyteti: ");
        labelCity.setFont(new Font("Railway", Font.BOLD, 20));
        labelCity.setForeground(Color.WHITE);
        labelCity.setBounds(100,500,130,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Railway", Font.BOLD, 14));
        textCity.setBounds(300,500,400,30);
        add(textCity);

        // Kodi Postar--------------------------------------------------------------------------
        JLabel labelPC = new JLabel("Kodi Postar: ");
        labelPC.setFont(new Font("Railway", Font.BOLD, 20));
        labelPC.setForeground(Color.WHITE);
        labelPC.setBounds(100,550,130,30);
        add(labelPC);

        textPcode = new JTextField();
        textPcode.setFont(new Font("Railway", Font.BOLD, 14));
        textPcode.setBounds(300,550,400,30);
        add(textPcode);

        // Shteti-------------------------------------------------------------------------------
        JLabel labelState = new JLabel("Shteti: ");
        labelState.setFont(new Font("Railway", Font.BOLD, 20));
        labelState.setForeground(Color.WHITE);
        labelState.setBounds(100,600,130,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Railway", Font.BOLD, 14));
        textState.setBounds(300,600,400,30);
        add(textState);

        // Butoni për faqen tjetër--------------------------------------------------------------
        next = new JButton("Faqja Tjetër ->");
        next.setFont(new Font("Railway", Font.BOLD, 14));

        next.setForeground(Color.BLACK);
        next.setBounds(565,670,135,30);
        next.addActionListener(this);
        add(next);

        // Background---------------------------------------------------------------------------
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/swishbanksignup.png"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 850, 800);
        add(image);

        // Dritarja------------------------------------------------------------------------------
        setLayout(null);
        setSize(850,800);
        setLocation(350,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Marrja e të dhënave nga inputet & radio butonat---------------------------------------
        // Numri i faqes-------------------------------------------------------------------------
        String formno = first;
        // Emri----------------------------------------------------------------------------------
        String name = textName.getText();
        // Atësia--------------------------------------------------------------------------------
        String fname = textFname.getText();
        // Ditëlindja----------------------------------------------------------------------------
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        // Gjinia--------------------------------------------------------------------------------
        String gender = null;
        if (r1.isSelected()){
            gender = "Mashkull";
        } else if (r2.isSelected()) {
            gender = "Femër";
        }
        // Email---------------------------------------------------------------------------------
        String email = textEmail.getText();
        // Status--------------------------------------------------------------------------------
        String status = null;
        if (s1.isSelected()){
            status = "Beqar";
        } else if (s2.isSelected()) {
            status = "Martuar";
        } else if (s3.isSelected()) {
            status = "Divorcuar";
        }
        // Adresa--------------------------------------------------------------------------------
        String address = textAdd.getText();
        // Qyteti--------------------------------------------------------------------------------
        String city = textCity.getText();
        // Kodi Postar---------------------------------------------------------------------------
        String postcode = textPcode.getText();
        // Shteti--------------------------------------------------------------------------------
        String state = textState.getText();

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"', '"+address+"', '"+city+"', '"+state+"' )";
                c.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
