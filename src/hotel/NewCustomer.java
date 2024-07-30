package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new NewCustomer();
    }

    JTextField t1,t2,t3,t4;
    JComboBox c1;
    JRadioButton r1,r2;
    Choice ch1;
    JLabel date;
    JButton add,back;

    NewCustomer()
    {


        JPanel panel=new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("customer.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imglabel=new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel name=new JLabel("NEW CUSTOMER FORM");
        name.setBounds(118,11,260,53);
        name.setFont(new Font("Tahoma",Font.BOLD,20));
        name.setForeground(Color.white);
        panel.add(name);

        JLabel id=new JLabel("ID :");
        id.setBounds(35,76,200,14);
        id.setForeground(Color.white);
        id.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(id);

        c1=new JComboBox(new String[] {"Passport", "Aadhar card", " Voter Card","Driving licensce"});
        c1.setBounds(271,73,150,20);
        c1.setBackground(new Color(3,45,48));
        c1.setForeground(Color.white);
        c1.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(c1);

        JLabel Num=new JLabel("Number :");
        Num.setBounds(35,111,200,14);
        Num.setForeground(Color.white);
        Num.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(Num);

        t1=new JTextField();
        t1.setBounds(271,111,150,20);
        panel.add(t1);

        JLabel labname=new JLabel("Name :");
        labname.setBounds(35,151,200,14);
        labname.setForeground(Color.white);
        labname.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(labname);

        t2=new JTextField();
        t2.setBounds(271,151,150,20);
        panel.add(t2);

        JLabel gender=new JLabel("Gender :");
        gender.setBounds(35,191,200,14);
        gender.setForeground(Color.white);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(gender);

        r1=new JRadioButton("MALE");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.white);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        panel.add(r1);

        r2=new JRadioButton("FEMALE");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.white);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,100,12);
        panel.add(r2);

        JLabel country=new JLabel("Country :");
        country.setBounds(35,231,200,14);
        country.setForeground(Color.white);
        country.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(country);

        t3=new JTextField();
        t3.setBounds(271,231,150,20);
        panel.add(t3);

        JLabel room=new JLabel("Alocated room number");
        room.setBounds(35,274,200,14);
        room.setForeground(Color.white);
        room.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(room);

        ch1=new Choice();
        try {
            con c =new con();
            ResultSet resultSet=c.statement.executeQuery("select * from room");
            while(resultSet.next())
            {
                ch1.add(resultSet.getString("room no.: "));

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        ch1.setBounds(271,274,150,20);
        ch1.setFont(new Font("Tahoma",Font.BOLD,14));
        ch1.setForeground(Color.white);
        ch1.setBackground(new Color(3,45,48));
        panel.add(ch1);


        JLabel check=new JLabel("Checked-In");
        check.setBounds(35,316,200,14);
        check.setForeground(Color.white);
        check.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(check);

        Date date1=new Date();


        date=new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setForeground(Color.white);
        date.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(date);

        JLabel deposit=new JLabel("Deposit :");
        deposit.setBounds(35,359,200,14);
        deposit.setForeground(Color.white);
        deposit.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(deposit);

        t4=new JTextField();
        t4.setBounds(271,359,150,20);
        panel.add(t4);

        add=new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.white);
        add.setBackground(Color.black);
        add.addActionListener(this);
        panel.add(add);

        back=new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        back.addActionListener(this);
        panel.add(back);


        setLocation(500,150);
        setLayout(null);
        setSize(850,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==add)
        {
            con c=new con();
            String radioBtn=null;
            if(r1.isSelected())
            {
                radioBtn="Male";
            }
            else if(r2.isSelected())
            {
                radioBtn="Female";
            }
            String s1=(String)c1.getSelectedItem();
            String s2=t1.getText();
            String s3=t2.getText();
            String s4=radioBtn;
            String s5=t3.getText();
            String s6=ch1.getSelectedItem();
            String s7=date.getText();
            String s8=t4.getText();



            try{
                String q="insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                String q1="update room set availability='Occupied' where roomNumber="+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);

                JOptionPane.showMessageDialog(null,"success");


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
