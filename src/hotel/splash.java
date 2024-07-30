package hotel;

import javax.swing.*;

public class splash extends JFrame {
    public static void main(String args[])
    {
          new splash();
    }

    public splash() {
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("splash (1).gif"));
        JLabel label=new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);
        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

    }
}
