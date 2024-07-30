package hotel;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Room();
    }

    JTable table;
    JButton back;
    Room()
    {
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);




        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("roomm.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);


        table=new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.white);
        panel.add(table);



        try{
            con c=new con();
            String RoomInfo="select * from room";
            ResultSet r=c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(r));
        }

        catch(Exception E)
        {
            E.printStackTrace();
        }


        back=new JButton("BACK");
        back.setBackground(Color.black);;
        back.setBounds(200,500,120,30);
        back.setForeground(Color.white);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        JLabel Room=new JLabel("Room no");
        Room.setBounds(12,15,80,19);
        Room.setForeground(Color.white);
        Room.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Room);


        JLabel availability=new JLabel("Avalability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.white);
        availability.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(availability);

        JLabel Clean=new JLabel("Clean status");
        Clean.setBounds(216,15,150,19);
        Clean.setForeground(Color.white);
        Clean.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Clean);

        JLabel price=new JLabel("Price");
        price.setBounds(330,15,80,19);
        price.setForeground(Color.white);
        price.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(price);

        JLabel Bed=new JLabel("Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(Color.white);
        Bed.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Bed);

        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
