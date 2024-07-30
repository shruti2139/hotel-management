package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddRoom extends JFrame implements ActionListener {

    JTextField t2,t4;
    JComboBox t3,t5,t6;

    JButton b1,b2;
    AddRoom()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,45,48));
        //panel.setForeground();
        panel.setLayout(null);
        add(panel);

        JLabel label=new JLabel("ADD ROOM");
        label.setBounds(194,10,160,22);
        label.setFont(new Font("Tahoma",Font.BOLD,15));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel label2=new JLabel("Room number");
        label2.setBounds(64,70,152,22);
        label2.setFont(new Font("Tahoma",Font.ITALIC,15));
        label2.setForeground(Color.white);
        panel.add(label2);


        t2=new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,15));
        t2.setForeground(Color.white);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel label3=new JLabel("Availability");
        label3.setBounds(64,110,152,22);
        label3.setFont(new Font("Tahoma",Font.ITALIC,15));
        label3.setForeground(Color.white);
        panel.add(label3);

        t3=new JComboBox(new String[] {"Available","Occupied"});
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,15));
        t3.setForeground(Color.white);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel label4=new JLabel("Price");
        label4.setBounds(64,150,152,22);
        label4.setFont(new Font("Tahoma",Font.ITALIC,15));
        label4.setForeground(Color.white);
        panel.add(label4);

        t4=new JTextField();
        t4.setBounds(200,150,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,15));
        t4.setForeground(Color.white);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel label5=new JLabel("Cleaning Status");
        label5.setBounds(64,190,152,22);
        label5.setFont(new Font("Tahoma",Font.ITALIC,15));
        label5.setForeground(Color.white);
        panel.add(label5);

        t5=new JComboBox(new String[] {"Clean","Dirty"});
        t5.setBounds(200,190,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN,15));
        t5.setForeground(Color.white);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel label6=new JLabel("Bed Type");
        label6.setBounds(64,230,152,22);
        label6.setFont(new Font("Tahoma",Font.ITALIC,15));
        label6.setForeground(Color.white);
        panel.add(label6);

        t6=new JComboBox(new String[] {"Single","Double"});
        t6.setBounds(200,230,156,20);
        t6.setFont(new Font("Tahoma",Font.PLAIN,15));
        t6.setForeground(Color.white);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        b1=new JButton("Add");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        panel.add(b1);


        b2=new JButton("Back");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        panel.add(b2);

 /*       ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("roomser.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel lab=new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);*/











        setUndecorated(false);
        setLocation(20,200);
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddRoom();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {
            try{
                con c=new con();
                String room=t2.getText();
                String ava=(String) t3.getSelectedItem();
                String status=(String) t5.getSelectedItem();
                String price=t4.getText();
                String type=(String) t6.getSelectedItem();


                String q= "insert into room values('"+room+"','"+ava+"','"+status+"','"+price+"','"+type+"')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null,"SuccessFully added");
                this.setVisible(false);


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
