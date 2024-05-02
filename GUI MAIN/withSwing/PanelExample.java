package withSwing;

import javax.swing.*;
import java.awt.*;

public class PanelExample {
    JFrame f=new JFrame();
    JPanel p=new JPanel();
    JButton b1=new JButton("Button 1");
    JButton b2=new JButton("Button 2");
    PanelExample(){
        frame();
        panel();
        button();
    }
    public void button(){
        b1.setBounds(50,20,100,30);
        p.add(b1);
        b1.setBackground(Color.red);
        b1.setForeground(Color.blue);

        b2.setBounds(100,100,100,30);
        p.add(b2);
        b2.setBackground(Color.green);
        b2.setForeground(Color.blue);
    }
    public void panel(){
        p.setBounds(40,80,200,200);
        f.add(p);
        p.setBackground(Color.gray);
        p.setLayout(null);
    }
    public void frame(){
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new PanelExample();
    }
}
