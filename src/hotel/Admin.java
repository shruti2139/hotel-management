package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Admin extends JFrame implements ActionListener
{

    JButton add_Emp,add_Room,add_Drive,logout,back;
    Admin()
    {

        add_Emp=new JButton("ADD EMPLOYEE");
        add_Emp.setBounds(250,230,200,30);
        add_Emp.setBackground(Color.white);
        add_Emp.setForeground(Color.black);
        add_Emp.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Emp.addActionListener(this);
        add(add_Emp);

        add_Room=new JButton("ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.black);
        add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Drive=new JButton("ADD DRIVER");
        add_Drive.setBounds(250,530,200,30);
        add_Drive.setBackground(Color.white);
        add_Drive.setForeground(Color.black);
        add_Drive.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Drive.addActionListener(this);
        add(add_Drive);

        logout=new JButton("LOGOUT");
        logout.setBounds(20,700,100,30);
        logout.setBackground(Color.black);
        logout.setForeground(Color.white);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

        back=new JButton("BACK");
        back.setBounds(150,700,95,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("employees.png"));
        Image l11=I1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(l11);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon I2=new ImageIcon(ClassLoader.getSystemResource("roomm.png"));
        Image l12=I2.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(l12);
        JLabel label2=new JLabel(imageIcon2);
        label2.setBounds(70,340,120,120);
        add(label2);

        ImageIcon I3=new ImageIcon(ClassLoader.getSystemResource("driver.png"));
        Image l13=I3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(l13);
        JLabel label3=new JLabel(imageIcon3);
        label3.setBounds(70,500,120,120);
        add(label3);

        ImageIcon I4=new ImageIcon(ClassLoader.getSystemResource("driver.png"));
        Image l14=I4.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon4=new ImageIcon(l14);
        JLabel label4=new JLabel(imageIcon4);
        label4.setBounds(1000,250,400,400);
       // add(label4);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);

    }


    public static void main(String[] args) {
     new Admin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add_Emp)
        {
             new AddEmp();
        }
        else if(e.getSource()==add_Room)
        {
            new AddRoom();

        }
        else if(e.getSource()==add_Drive)
        {
                  new AddDriver();
        }
        else if(e.getSource()==logout)
        {
            System.exit(102);
        }
        else if(e.getSource()==back)
        {
            new Dashboard();
            this.setVisible(false);
        }

    }
}
