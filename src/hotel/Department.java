package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {

    public static void main(String[] args) {
        new Department();
    }

    Department()
    {
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,48));
        add(panel);


        JTable table=new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            con c = new con();
            String depart = "select * from department";
            ResultSet resultSet= c.statement.executeQuery(depart);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception E)
        {
            E.printStackTrace();;
        }

        JButton back=new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setVisible(false);
            }
        });



        JLabel label=new JLabel("Department");
        label.setBounds(145,11,105,20);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label);

        JLabel label1=new JLabel("Budget");
        label1.setBounds(431,11,105,20);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(label1);

        setLayout(null);
        setLocation(400,270);
        setSize(700,500);
        setVisible(true);
    }
}
