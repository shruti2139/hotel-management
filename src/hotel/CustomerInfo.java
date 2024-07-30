package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new CustomerInfo();
    }

    CustomerInfo(){

        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(10,48,900,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            con c =new con();
            String q = "select * from Customer";
            ResultSet resultSet= c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));



        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

        JLabel id=new JLabel("ID");
        id.setBounds(31,11,46,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(id);

        JLabel Number=new JLabel("Number");
        Number.setBounds(150,11,60,14);
        Number.setForeground(Color.white);
         Number.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Number);

        JLabel name=new JLabel("Name");
        name.setBounds(270,11,46,14);
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(name);


        JLabel gender=new JLabel("Gender");
        gender.setBounds(360,11,60,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(gender);

        JLabel Country=new JLabel("Country");
        Country.setBounds(480,11,60,14);
        Country.setForeground(Color.white);
        Country.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Country);

        JLabel Room=new JLabel("Room");
        Room.setBounds(600,11,46,14);
        Room.setForeground(Color.white);
        Room.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Room);

        JLabel Deposit=new JLabel("Deposit");
        Deposit.setBounds(800,11,60,14);
        Deposit.setForeground(Color.white);
        Deposit.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Deposit);

        JLabel Time=new JLabel("time");
        Time.setBounds(680,11,50,14);
        Time.setForeground(Color.white);
        Time.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(Time);

        JButton back=new JButton("BACK");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });





        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
}
