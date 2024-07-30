package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5;
    JComboBox c1,c2;
    JButton b1,b2;
    AddDriver()
    {
        JPanel p=new JPanel();
        p.setBounds(5,5,890,490);
        p.setBackground(new Color(3,45,48));
        p.setLayout(null);
        add(p);

        JLabel l=new JLabel("ADD DRIVER");
        l.setBounds(194,10,200,22);
        l.setForeground(Color.white);
        l.setFont(new Font("Tahoma",Font.BOLD,22));
        p.add(l);


        JLabel name=new JLabel("NAME");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        name.setForeground(Color.white);
        p.add(name);

        t1=new JTextField();
        t1.setBounds(174,70,156,20);
        t1.setForeground(Color.white);
        t1.setFont(new Font("Tahoma",Font.BOLD,14));
        t1.setBackground(new Color(16,108,115));
        p.add(t1);

        JLabel age=new JLabel("AGE");
        age.setBounds(64,120,102,22);
        age.setFont(new Font("Tahoma", Font.BOLD,14));
        age.setForeground(Color.white);
        p.add(age);

        t2=new JTextField();
        t2.setBounds(174,120,156,20);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Tahoma",Font.BOLD,14));
        t2.setBackground(new Color(16,108,115));
        p.add(t2);

        JLabel gender=new JLabel("Gender");
        gender.setBounds(64,160,102,22);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        gender.setForeground(Color.white);
        p.add(gender);

        c1=new JComboBox(new String[]{"MALE","FEMALE"});
        c1.setBounds(176,160,154,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.white);
        c1.setBackground(new Color(16,108,115));
        p.add(c1);


        JLabel carC=new JLabel("Car");
        carC.setBounds(64,200,102,22);
        carC.setFont(new Font("Tahoma", Font.BOLD,14));
        carC.setForeground(Color.white);
        p.add(carC);

        t3=new JTextField();
        t3.setBounds(174,200,156,20);
        t3.setForeground(Color.white);
        t3.setFont(new Font("Tahoma",Font.BOLD,14));
        t3.setBackground(new Color(16,108,115));
        p.add(t3);


        JLabel avail=new JLabel("AVAIALABLE");
        avail.setBounds(64,240,102,22);
        avail.setFont(new Font("Tahoma", Font.BOLD,14));
        avail.setForeground(Color.white);
        p.add(avail);

        c2=new JComboBox(new String[]{"Yes","No"});
        c2.setBounds(176,240,154,20);
        c2.setFont(new Font("Tahoma",Font.BOLD,14));
        c2.setForeground(Color.white);
        c2.setBackground(new Color(16,108,115));
        p.add(c2);



        JLabel location=new JLabel("LOCATION");
        location.setBounds(64,280,102,22);
        location.setFont(new Font("Tahoma", Font.BOLD,14));
        location.setForeground(Color.white);
        p.add(location);

        t4=new JTextField();
        t4.setBounds(174,280,156,20);
        t4.setForeground(Color.white);
        t4.setFont(new Font("Tahoma",Font.BOLD,14));
        t4.setBackground(new Color(16,108,115));
        p.add(t4);

        b1=new JButton("ADD");
        b1.setBounds(64,380,111,33);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        p.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(190,380,111,33);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        p.add(b2);


        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddDriver();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {

            String name=t1.getText();
            String age=t2.getText();
            String gender=(String) c1.getSelectedItem();
            String company=t3.getText();
            String location=t4.getText();
            String available=(String) c2.getSelectedItem();







            try{
                con c=new con();
                String q="insert into driver values('"+name+"','"+age+"','"+gender+"','"+company+"','"+available+"','"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY");
                setVisible(false);
            }
            catch(Exception E)
            {
                E.printStackTrace();
            }

        }
        else {
            setVisible(false);

        }
    }
}
