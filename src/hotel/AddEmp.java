package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class AddEmp extends JFrame implements ActionListener {


    JTextField nameText,nameText1,nameText2,nameText3,nameText4,nameText5;
    JRadioButton r1,r2,r3;
    JComboBox c1,c2,c3;
    JButton b1,b2;
AddEmp()
{


    JPanel p1=new JPanel();
    p1.setBounds(5,5,890,490);
    p1.setLayout(null);
    p1.setBackground(new Color(3,45,48));
    add(p1);

    JLabel name=new JLabel("Name");
    name.setBounds(60,30,150,27);
    name.setFont(new Font("serif",Font.BOLD,17));
    name.setForeground(Color.white);
    p1.add(name);

    nameText=new JTextField();
    nameText.setBounds(200,30,150,27);
    nameText.setBackground(new Color(16,108,115));
    nameText.setFont(new Font("Tahome",Font.BOLD,14));
    nameText.setForeground(Color.white);
    p1.add(nameText);


    JLabel Age=new JLabel("Age");
    Age.setBounds(60,80,150,27);
    Age.setFont(new Font("serif",Font.BOLD,17));
    Age.setForeground(Color.white);
    p1.add(Age);

    nameText1=new JTextField();
    nameText1.setBounds(200,80,150,27);
    nameText1.setBackground(new Color(16,108,115));
    nameText1.setFont(new Font("Tahome",Font.BOLD,14));
    nameText1.setForeground(Color.white);
    p1.add(nameText1);

    JLabel Gender=new JLabel("Gender");
    Gender.setBounds(60,110,150,27);
    Gender.setFont(new Font("serif",Font.BOLD,17));
    Gender.setForeground(Color.white);
    p1.add(Gender);

    r1=new JRadioButton("MALE");
    r1.setBounds(200,130,100,27);
    r1.setBackground(new Color(3,45,48));
    r1.setFont(new Font("Tahoma",Font.BOLD,14));
    r1.setForeground(Color.white);
    p1.add(r1);
    r2=new JRadioButton("FEMALE");
    r2.setBounds(280,130,100,27);
    r2.setBackground(new Color(3,45,48));
    r2.setFont(new Font("Tahoma",Font.BOLD,14));
    r2.setForeground(Color.white);
    p1.add(r2);

    JLabel job=new JLabel("Job");
    job.setBounds(60,170,150,27);
    job.setFont(new Font("serif",Font.BOLD,17));
    job.setForeground(Color.white);
    p1.add(job);

    c1=new JComboBox(new String[]{"Front Desk","HouseKeeping","Kitchen Staff","Room Service","Manager","Accountant","Chef"});
    c1.setBackground(new Color(16,108,115));
    c1.setBounds(200,170,150,30);
    c1.setFont(new Font("Tahoma",Font.BOLD,14));
    c1.setForeground(Color.white);
    p1.add(c1);

    JLabel Salary=new JLabel("Salary");
    Salary.setBounds(60,220,150,27);
    Salary.setFont(new Font("serif",Font.BOLD,17));
    Salary.setForeground(Color.white);
    p1.add(Salary);

    nameText2=new JTextField();
    nameText2.setBounds(200,220,150,27);
    nameText2.setBackground(new Color(16,108,115));
    nameText2.setFont(new Font("Tahome",Font.BOLD,14));
    nameText2.setForeground(Color.white);
    p1.add(nameText2);

    JLabel phone=new JLabel("Phone");
    phone.setBounds(60,270,150,27);
    phone.setFont(new Font("serif",Font.BOLD,17));
    phone.setForeground(Color.white);
    p1.add(phone);

    nameText3=new JTextField();
    nameText3.setBounds(200,270,150,27);
    nameText3.setBackground(new Color(16,108,115));
    nameText3.setFont(new Font("Tahome",Font.BOLD,14));
    nameText3.setForeground(Color.white);
    p1.add(nameText3);

    JLabel Adar=new JLabel("Adhhaar");
    Adar.setBounds(60,320,150,27);
    Adar.setFont(new Font("serif",Font.BOLD,17));
    Adar.setForeground(Color.white);
    p1.add(Adar);

    nameText4=new JTextField();
    nameText4.setBounds(200,320,150,27);
    nameText4.setBackground(new Color(16,108,115));
    nameText4.setFont(new Font("Tahome",Font.BOLD,14));
    nameText4.setForeground(Color.white);
    p1.add(nameText4);


    JLabel Email=new JLabel("Email");
    Email.setBounds(60,370,150,27);
    Email.setFont(new Font("serif",Font.BOLD,17));
    Email.setForeground(Color.white);
    p1.add(Email);

    nameText5=new JTextField();
    nameText5.setBounds(200,370,150,27);
    nameText5.setBackground(new Color(16,108,115));
    nameText5.setFont(new Font("Tahome",Font.BOLD,14));
    nameText5.setForeground(Color.white);
    p1.add(nameText5);

    JLabel AED=new JLabel("ADD EMPLOYEE DETAILS");
    AED.setBounds(450,24,445,35);
    AED.setFont(new Font("Tahoma", Font.BOLD,31));
    AED.setForeground(Color.white);
    p1.add(AED);

    b1=new JButton("ADD");
    b1.setBounds(200,420,100,30);
    b1.setBackground(Color.black);
    b1.setForeground(Color.white);
    b1.addActionListener(this);
    p1.add(b1);

    b2=new JButton("BACK");
    b2.setBounds(350,420,100,30);
    b2.setBackground(Color.black);
    b2.setForeground(Color.white);
    b2.addActionListener(this);
    p1.add(b2);


    setLocation(60,160);
    setLayout(null);
    setSize(900,500);
    setVisible(true);

}
    public static void main(String[] args) {

    new AddEmp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource()==b1)
    {
        String name=nameText.getText();
        String age=nameText1.getText();
        String salary=nameText2.getText();
        String phone=nameText3.getText();
        String email=nameText4.getText();
        String adar=nameText5.getText();
        String job=(String) c1.getSelectedItem();
        String gender=null;
        if(r1.isSelected())
        {
            gender="MALE";
        }
        else if(r2.isSelected())
        {
            gender="FEMLAE";
        }





        try{
            con c=new con();
            String q="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+adar+"')";
            c.statement.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"ADDED SUCCESSFULLY");
            setVisible(false);
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
