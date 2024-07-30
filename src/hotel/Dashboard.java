package hotel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton addd,rec;
    Dashboard()
    {
        super("HOTEL MANAGEMENT SYSTEM");

        rec=new JButton("ADMIN");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        addd=new JButton("RECEPTION");
        addd.setBounds(880,510,140,30);
        addd.setFont(new Font("Tahoma",Font.BOLD,15));
        addd.setBackground(new Color(255,98,0));
        addd.setForeground(Color.WHITE);
        addd.addActionListener(this);
        add(addd);

        ImageIcon imr=new ImageIcon(ClassLoader.getSystemResource("Reception.png"));
        Image i3=imr.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(i3);
        JLabel labelr=new JLabel(imageIcon);
        labelr.setBounds(850,300,200,195);
        add(labelr);


        ImageIcon ima=new ImageIcon(ClassLoader.getSystemResource("admin.jpg"));
        Image i2=ima.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcona=new ImageIcon(i2);
        JLabel labela=new JLabel(imageIcona);
        labela.setBounds(400,300,200,195);
        add(labela);



        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("Dashboard.gif"));
        Image i1=im.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcond=new ImageIcon(i1);
        JLabel labeld=new JLabel(imageIcond);
        labeld.setBounds(0,0,1950,1090);
        add(labeld);


        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Dashboard();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==addd)
        {
            new Reception();
            setVisible(false);
        }
        else {
 new LoginT();
 setVisible(false);
        }
    }
}
