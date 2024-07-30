package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1)
        {
             String Q="select * from room where bedtype='"+ch1.getSelectedItem()+"'";
             String Q1="select * from room where availability = 'Available' And bedtype='"+ch1.getSelectedItem()+"'";
             try
             {
                 con c=new con();
                 ResultSet resultSet=c.statement.executeQuery(Q);
                 table.setModel(DbUtils.resultSetToTableModel(resultSet));


                 if(checkBox.isSelected())
                 {
                     ResultSet resultSet1=c.statement.executeQuery(Q1);
                     table.setModel(DbUtils.resultSetToTableModel(resultSet1));

                 }

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

    JCheckBox checkBox;
    JRadioButton r1,r2;
    Choice ch1;
    JButton b1,b2;
    JTable table;

    public static void main(String[] args) {
        new Search();
    }


    Search()
    {
        JPanel panel=new JPanel();
        panel.setBackground(new Color(3,45,48));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);


        JLabel searchForRoom=new JLabel("Search for Room");
        searchForRoom.setBounds(250,11,186,31);
        searchForRoom.setForeground(Color.white);
        searchForRoom.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(searchForRoom);

        JLabel rbd=new JLabel("bed type");
        rbd.setBounds(50,73,120,20);
        rbd.setForeground(Color.white);
        rbd.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbd);


        JLabel number=new JLabel("Room no");
        number.setBounds(23,162,100,20);
        number.setForeground(Color.white);
        number.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(number);

        JLabel avail=new JLabel("Availability");
        avail.setBounds(175,162,150,20);
        avail.setForeground(Color.white);
        avail.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(avail);

        JLabel price=new JLabel("Price");
        price.setBounds(458,162,100,20);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel status=new JLabel("Status");
        status.setBounds(306,162,100,20);
        status.setForeground(Color.white);
        status.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(status);

        JLabel bt=new JLabel("Bed Type");
        bt.setBounds(580,162,100,20);
        bt.setForeground(Color.white);
        bt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bt);









        checkBox=new JCheckBox("Only display available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.white);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        ch1=new Choice();
        ch1.add("Single Bed");
        ch1.add("Double Bed");
        ch1.setBounds(170,70,120,20);
        panel.add(ch1);

        table=new JTable();
        table.setBounds(0,187,700,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);

        try{
            con c =new con();
            String q="select * from room";
            ResultSet resultSet=c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));


        }
        catch(Exception E)
        {
            E.printStackTrace();
        }


        b1=new JButton("SEARCH");
        b1.setBounds(200,400,120,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        panel.add(b1);

        b2=new JButton("BACK");
        b2.setBounds(380,400,120,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        b2.addActionListener(this);
        panel.add(b2);


        setLayout(null);
        setLocation(500,200);
        setSize(700,500);
        setVisible(true);
    }
}
