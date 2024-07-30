package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Checkin extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    JTextField textField7;

    Checkin()
    {


        JPanel panel=new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);


        ImageIcon imageIcon=new ImageIcon((ClassLoader.getSystemResource("update.png")));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


        JLabel label1=new JLabel("Check-In Details");
        label1.setBounds(124,11,222,25);
        label1.setFont(new Font("Tahoma",Font.BOLD,20));
        label1.setForeground(Color.white);
        panel.add(label1);

        JLabel label2=new JLabel("ID");
        label2.setBounds(25,88,46,14);
        label2.setFont(new Font("Tahoma",Font.PLAIN,14));
        label2.setForeground(Color.white);
        panel.add(label2);

        Choice c=new Choice();
        c.setBounds(248,85,140,20);
        panel.add(c);


        try{
            con C=new con();
            ResultSet resultSet=C.statement.executeQuery("select * from customer");
            while(resultSet.next())
            {
                c.add(resultSet.getString("number"));
            }
        }




        catch(Exception E)
        {
            E.printStackTrace();
        }


        JLabel label3=new JLabel("Room Number :");
        label3.setBounds(25,129,107,14);
        label3.setFont(new Font("Tahoma",Font.PLAIN,14));
        label3.setForeground(Color.white);
        panel.add(label3);

        JLabel label4=new JLabel("Name :");
        label4.setBounds(25,174,97,14);
        label4.setFont(new Font("Tahoma",Font.PLAIN,14));
        label4.setForeground(Color.white);
        panel.add(label4);

        JTextField textField=new JTextField();
        textField.setBounds(248,129,140,20);
        panel.add(textField);

        JTextField textField1=new JTextField();
        textField1.setBounds(248,174,140,20);
        panel.add(textField1);

        JLabel label5=new JLabel("Checked-in :");
        label5.setBounds(25,216,107,14);
        label5.setFont(new Font("Tahoma",Font.PLAIN,14));
        label5.setForeground(Color.white);
        panel.add(label5);

        JTextField textField2=new JTextField();
        textField2.setBounds(248,216,140,20);
        panel.add(textField2);

        JLabel label6=new JLabel("Amount Paid(RS) :");
        label6.setBounds(25,261,150,14);
        label6.setFont(new Font("Tahoma",Font.PLAIN,14));
        label6.setForeground(Color.white);
        panel.add(label6);

        JTextField textField3=new JTextField();
        textField3.setBounds(248,261,140,20);
        panel.add(textField3);

        JLabel label7=new JLabel("Pending Amount(RS) :");
        label7.setBounds(25,302,150,14);
        label7.setFont(new Font("Tahoma",Font.PLAIN,14));
        label7.setForeground(Color.white);
        panel.add(label7);

        JTextField textField4=new JTextField();
        textField4.setBounds(248,302,140,20);
        panel.add(textField4);

        JButton update=new JButton("Update");
        update.setBounds(56,378,89,23);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.white);
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                try
                {
                    con C=new con();
                    String q=c.getSelectedItem();

                   String room= textField.getText();
                   String name= textField1.getText();
                   String check=textField2.getText();
                   String amount=textField3.getText();

                   C.statement.executeUpdate("update customer set room = '"+room+"', name ='"+name+"',check_in_time ='"+check+"', deposit='"+amount+"' where number ='"+q+"'");

                   JOptionPane.showMessageDialog(null,"Updated Successfully");
                   setVisible(false);

                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton back=new JButton("Back");
        back.setBounds(168,378,89,23);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.white);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        panel.add(back);

        JButton check=new JButton("Check");
        check.setBounds(281,378,89,23);
        check.setBackground(Color.black);
        check.setForeground(Color.WHITE);
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id=c.getSelectedItem();
                String q="select * from customer where number='"+id+"'";
                try{
                    con c=new con();
                    ResultSet resultSet=c.statement.executeQuery(q);

                    while (resultSet.next())
                    {
                        textField.setText(resultSet.getString("room"));
                        textField1.setText(resultSet.getString("name"));
                        textField2.setText(resultSet.getString("check_in_time"));
                        textField3.setText(resultSet.getString("deposit"));

                    }
                    ResultSet resultSet1=c.statement.executeQuery("select * from room where roomNumber = '"+textField.getText()+"'");

                    while(resultSet1.next())
                    {
                        String price=resultSet1.getString("price");
                        int amountPaid=Integer.parseInt(price) - Integer.getInteger(textField3.getText());
                        textField7.setText(""+amountPaid);
                    }
                }
                catch (Exception E)
                {
                    E.printStackTrace();
                }
            }
        });


        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Checkin();
    }
}
