package swishbank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    // Komponentët----------------------------------------------------------------------------
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("SWISH BANK - APLIKIM");

        JLabel l1 = new JLabel("Faqja 2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setForeground(Color.WHITE);
        l1.setBounds(435,70,600,30);
        add(l1);

        JLabel l2 = new JLabel("Detaje shtesë");
        l2.setFont(new Font("Raleway", Font.BOLD,22));
        l2.setForeground(Color.WHITE);
        l2.setBounds(380,95,600,30);
        add(l2);

        JLabel l3 = new JLabel("Feja :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setForeground(Color.WHITE);
        l3.setBounds(100,150,100,30);
        add(l3);

        String religion[] = {"Katolik","Musliman","Ortodoks","Tjetër"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(300,150,400,30);
        add(comboBox);

        JLabel l4 = new JLabel("Kategori : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setForeground(Color.WHITE);
        l4.setBounds(100,200,100,30);
        add(l4);

        String Category [] = {"Student","Punëtor","Biznes","Pensionist","Tjetër"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,200,400,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Të ardhurat mujore : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setForeground(Color.WHITE);
        l5.setBounds(100,250,200,30);
        add(l5);

        String income [] = {"Null","<40,000 Lekë","60,000 Lekë", "80,000 Lekë", "<=1,00,000 Lekë",">1,00,000 Lekë"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,250,400,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Edukimi : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setForeground(Color.WHITE);
        l6.setBounds(100,300,130,30);
        add(l6);

        String educational [] = {"Padiplomuar","Diplomuar","Doktraturë","Tjetër"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,300, 400,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Puna : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setForeground(Color.WHITE);
        l7.setBounds(100,350,130,30);
        add(l7);

        String Occupation [] = {"Punësuar","Vetëpunësuar","Biznes","Tjetër"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,350,400,30);
        add(comboBox5);

        JLabel l10 = new JLabel("Qytetar Maxhoren : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setForeground(Color.WHITE);
        l10.setBounds(100,400,250,30);
        add(l10);

        r1 = new JRadioButton("Po");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setOpaque(false);
        r1.setForeground(Color.WHITE);
        r1.setBounds(350,400,100,30);
        add(r1);
        r2 = new JRadioButton("Jo");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setOpaque(false);
        r2.setForeground(Color.WHITE);
        r2.setBounds(460,400,100,30);
        add(r2);

        JLabel l11 = new JLabel("Llogari eksistuese : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setForeground(Color.WHITE);
        l11.setBounds(100,450,250,30);
        add(l11);

        e1 = new JRadioButton("Po");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setOpaque(false);
        e1.setForeground(Color.WHITE);
        e1.setBounds(350,450,100,30);
        add(e1);
        e2 = new JRadioButton("Jo");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setOpaque(false);
        e2.setForeground(Color.WHITE);
        e2.setBounds(460,450,100,30);
        add(e2);

        next = new JButton("Faqja Tjetër ->");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,135,30);
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
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Po";
        } else if (r2.isSelected()) {
            scitizen ="Jo";
        }
        String eAccount = " ";
        if ((r1.isSelected())){
            eAccount = "Po";
        } else if (r2.isSelected()) {
            eAccount ="Jo";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Plotësoni të gjitha fushat!");
            }else {
                Connn c = new Connn();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+scitizen+"','"+eAccount+"')";
                c.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");
    }
}