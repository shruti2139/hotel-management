package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Managerinfo extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new Managerinfo();
    }

    Managerinfo()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.white);
        table.setBackground(new Color(3,45,48));
        panel.add(table);


        try{
            con c =new con();
            String q = "select * from employee where job='Manager'";
            ResultSet resultSet= c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));



        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

        JButton back=new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });

        JLabel label=new JLabel("Name");
        label.setBounds(41,11,70,19);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label1=new JLabel("Age");
        label1.setBounds(159,11,105,20);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        JLabel label2=new JLabel("Gender");
        label2.setBounds(273,11,105,20);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label2);

        JLabel label3=new JLabel("Job");
        label3.setBounds(416,11,105,20);
        label3.setForeground(Color.white);
        label3.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label3);

        JLabel label4=new JLabel("Salary");
        label4.setBounds(536,11,105,20);
        label4.setForeground(Color.white);
        label4.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label4);

        JLabel label5=new JLabel("Phone");
        label5.setBounds(656,11,105,20);
        label5.setForeground(Color.white);
        label5.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label5);

        JLabel label6=new JLabel("Adhaar");
        label6.setBounds(786,11,105,20);
        label6.setForeground(Color.white);
        label6.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label6);

        JLabel labe=new JLabel("Gmail");
        labe.setBounds(896,11,105,20);
        labe.setForeground(Color.white);
        labe.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(labe);



        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
