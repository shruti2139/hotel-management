package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception()
    {
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1238,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);


        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);


        JButton btnNCF=new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setForeground(Color.white);
        btnNCF.setBackground(Color.black);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                        new NewCustomer();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });



        JButton btnRoom=new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setForeground(Color.white);
        btnRoom.setBackground(Color.black);
        panel1.add(btnRoom);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                   new Room();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnDept=new JButton("Department");
        btnDept.setBounds(30,110,200,30);
        btnDept.setForeground(Color.white);
        btnDept.setBackground(Color.black);
        panel1.add(btnDept);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    new Department();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnEmp=new JButton("All Empplyee Info");
        btnEmp.setBounds(30,140,200,30);
        btnEmp.setForeground(Color.white);
        btnEmp.setBackground(Color.black);
        panel1.add(btnEmp);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                      new Employee();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCi=new JButton("Customer info");
        btnCi.setBounds(30,190,200,30);
        btnCi.setForeground(Color.white);
        btnCi.setBackground(Color.black);
        panel1.add(btnCi);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                      new CustomerInfo();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnMi=new JButton("Manager Info");
        btnMi.setBounds(30,230,200,30);
        btnMi.setForeground(Color.white);
        btnMi.setBackground(Color.black);
        panel1.add(btnMi);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Managerinfo();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnCo=new JButton("Check Out");
        btnCo.setBounds(30,270,200,30);
        btnCo.setForeground(Color.white);
        btnCo.setBackground(Color.black);
        panel1.add(btnCo);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                     new CheckOut();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnUci=new JButton("Update CheckIn Details");
        btnUci.setBounds(30,310,200,30);
        btnUci.setForeground(Color.white);
        btnUci.setBackground(Color.black);
        panel1.add(btnUci);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Checkin();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC=new JButton("Update Room Status");
        btnUC.setBounds(30,350,200,30);
        btnUC.setForeground(Color.white);
        btnUC.setBackground(Color.black);
        panel1.add(btnUC);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                      new UpdateRoom();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnPS=new JButton("Pick up Service");
        btnPS.setBounds(30,390,200,30);
        btnPS.setForeground(Color.white);
        btnPS.setBackground(Color.black);
        panel1.add(btnPS);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Pickup();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton btnSr=new JButton("Search Room");
        btnSr.setBounds(30,430,200,30);
        btnSr.setForeground(Color.white);
        btnSr.setBackground(Color.black);
        panel1.add(btnSr);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                     new Search();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton logout=new JButton("LOGOUT");
        logout.setBounds(30,470,95,30);
        logout.setForeground(Color.white);
        logout.setBackground(Color.black);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    System.exit(500);
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        JButton back=new JButton("Back");
        back.setBounds(140,470,95,30);
        back.setForeground(Color.white);
        back.setBackground(Color.black);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    setVisible(false);
                    new Dashboard();
                }
                catch(Exception E)
                {
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }
    public static void main(String args[])

    {
        new Reception();
    }

}
