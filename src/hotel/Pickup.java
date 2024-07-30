package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {
        new Pickup();
    }

    Pickup()
    {

        JPanel panel=new JPanel();
        panel.setBounds(5,5,790,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label=new JLabel("PICK-UP SERVICE");
        label.setBounds(90,11,160,25);
        label.setForeground(Color.white);
        label.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(label);

        JLabel toc=new JLabel("Type of Car");
        toc.setBounds(32,97,120,25);
        toc.setForeground(Color.white);
        toc.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(toc);

        Choice c=new Choice();
        c.setBounds(193,97,150,25);
        panel.add(c);

        try
        {
            con C=new con();
            ResultSet resultSet=C.statement.executeQuery("select * from driver");
            while(resultSet.next())
            {
                c.add(resultSet.getString("company"));
            }
        }
        catch(Exception E)
        {
            E.printStackTrace();
        }

        JTable table=new JTable();
        table.setBounds(18,233,800,250);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try
        {

            con C=new con();
            String q="select * from driver";
            ResultSet resultSet=C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        JLabel name=new JLabel("Name");
        name.setBounds(24,208,46,14);
        name.setForeground(Color.white);
        panel.add(name);

        JLabel age=new JLabel("Age");
        age.setBounds(165,208,46,14);
        age.setForeground(Color.white);
        panel.add(age);

        JLabel gender=new JLabel("Gender");
        gender.setBounds(302,208,46,14);
        gender.setForeground(Color.white);
        panel.add(gender);

        JLabel company=new JLabel("Company");
        company.setBounds(432,208,55,14);
        company.setForeground(Color.white);
        panel.add(company);

        JLabel available=new JLabel("Available");
        available.setBounds(566,208,55,14);
        available.setForeground(Color.white);
        panel.add(available);

        JLabel location=new JLabel("Location");
        location.setBounds(690,208,55,14);
        location.setForeground(Color.white);
        panel.add(location);


        JButton displ=new JButton("Display");
        displ.setBounds(200,500,120,30);
        displ.setBackground(Color.BLACK);
        displ.setForeground(Color.white);
        displ.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                String q="select * from driver where company='"+c.getSelectedItem()+"'";
                                                try
                                                {
                                                    con c=new con();
                                                    ResultSet resultSet=c.statement.executeQuery(q);
                                                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                                                }
                                                catch (Exception E)
                                                {
                                                    E.printStackTrace();
                                                }
                                            }
                                        });
        panel.add(displ);

        JButton Back=new JButton("Back");
        Back.setBounds(420,500,120,30);
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.white);
        panel.add(Back);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setLayout(null);
        setSize(800,600);
        setLocation(500,100);
        setVisible(true);
    }
}
