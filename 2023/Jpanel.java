import java.awt.*;
import javax.swing.*;

class JpanelE1 extends JFrame
{
        JpanelE1()
        {
            JPanel panel = new JPanel();
            panel.setBounds(40,80,200,200);
            panel.setBackground(Color.red);
            JButton b1 = new JButton("Button1");
            b1.setBackground(Color.blue);
            b1.setBounds(50,100,80,30);

            JButton b2 = new JButton("Button2");

            panel.add(b1);
            panel.add(b2);
            add(panel);
            setSize(400,400);
            setVisible(true);
            setLayout(null);
        }
        public static void main(String[] args) {
            new JpanelE1();
        }
}
