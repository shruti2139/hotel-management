package hotel;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField textField1;
    JPasswordField passwordField1;
    JButton button1;
    JButton button2;


    Login()
    {
        JLabel label1=new JLabel("Username");
        label1.setBounds(40,20,100,30);
        label1.setFont(new Font("Tahoma", Font.BOLD,16));
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2=new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma", Font.BOLD,16));
        label2.setForeground(Color.WHITE);
        add(label2);

        textField1=new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(Color.WHITE);
        setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(new Color(26,104,110));
        add(textField1);

        passwordField1=new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(26,104,110));
        add(passwordField1);


        button1=new JButton("Login");
        button1.setBounds(40,140,120,30);
        button1.setFont((new Font("serif",Font.PLAIN,15)));
        button1.setBackground(Color.black);
        button1.setForeground(Color.white);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("Cancel");
        button2.setBounds(180,140,120,30);
        button2.setFont((new Font("serif",Font.PLAIN,15)));
        button2.setBackground(Color.black);
        button2.setForeground(Color.white);
        button2.addActionListener(this);
        add(button2);


        getContentPane().setBackground(Color.black);
        setLayout(null);
        setLocation(400,270);
        setSize(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==button1){

            try{
                con c=new con();
                String user=textField1.getText();
                String pass=passwordField1.getText();


                String q="select * from login where username = '"+user+"'and password = '"+pass+"'";
                ResultSet resultSet=c.statement.executeQuery(q);

                if(resultSet.next())
                {
                    new Dashboard();
                    setVisible(false);
                }
                else {
                    JOptionPane.showMessageDialog(null,"invalid");
                }
            }
            catch(Exception E)
            {
                E.printStackTrace();
            }

        }
        else {
            System.exit(102);
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }


}
