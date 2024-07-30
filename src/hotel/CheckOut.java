package hotel;

import javax.management.relation.RelationSupport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    CheckOut()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,790,390);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label=new JLabel("Check-Out");
        label.setBounds(100,20,100,30);
        label.setFont(new Font("Tahoma",Font.PLAIN,20));
        label.setForeground(Color.white);
        panel.add(label);

        JLabel label1=new JLabel("Customer Id");
        label1.setBounds(30,80,100,30);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        label1.setForeground(Color.white);
        panel.add(label1);

        Choice customer=new Choice();
        customer.setBounds(200,80,150,25);
        panel.add(customer);

        JLabel label2=new JLabel("Room number");
        label2.setBounds(30,130,200,30);
        label2.setFont(new Font("Tahoma",Font.PLAIN,20));
        label2.setForeground(Color.white);
        panel.add(label2);

        JLabel label3=new JLabel();
        label3.setBounds(200,20,100,30);
        label3.setFont(new Font("Tahoma",Font.PLAIN,20));
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel label4=new JLabel("Check-In Time");
        label4.setBounds(30,180,200,30);
        label4.setFont(new Font("Tahoma",Font.PLAIN,20));
        label4.setForeground(Color.white);
        panel.add(label4);


        JLabel label5=new JLabel();
        label5.setBounds(200,20,100,30);
        label5.setFont(new Font("Tahoma",Font.PLAIN,20));
        label5.setForeground(Color.white);
        panel.add(label5);

        JLabel label6=new JLabel("Check-Out Time ");
        label6.setBounds(30,230,200,30);
        label6.setFont(new Font("Tahoma",Font.PLAIN,20));
        label6.setForeground(Color.white);
        panel.add(label6);

        Date date=new Date();


        JLabel label7=new JLabel(""+date);
        label7.setBounds(200,230,500,30);
        label7.setFont(new Font("Tahoma",Font.PLAIN,20));
        label7.setForeground(Color.white);
        panel.add(label7);

        try{
            con c=new con();
            ResultSet resultSet=c.statement.executeQuery("select * from customer");
            while(resultSet.next())
            {
                customer.add(resultSet.getString("number"));
            }
        }

        catch(Exception E)
        {
            E.printStackTrace();
        }


        JButton checkOut=new JButton("Check-Out");
        checkOut.setBounds(30,300,120,30);
        checkOut.setForeground(Color.white);
        checkOut.setBackground(Color.black);
        panel.add(checkOut);
        checkOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    con cv=new con();
                    cv.statement.executeUpdate("delete from customer where number= '"+customer.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability = ' Available ' where roomNumber = '"+label2.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        JButton check=new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setForeground(Color.white);
        check.setBackground(Color.black);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                con c=new con();
                try
                {
                    ResultSet resultSet=c.statement.executeQuery("select * from customer where number='"+customer.getSelectedItem()+"'");
                    while (resultSet.next())
                    {
                        label.setText(resultSet.getString("room"));
                        label1.setText(resultSet.getString("check_in_time"));
                    }
                }
                catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back=new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });




        setLayout(null);
        setSize(800,400);
        setLocation(500,210);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckOut();
    }
}

