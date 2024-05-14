package GUI;

import javax.swing.*;
import java.awt.*;

public class Border {
    JFrame f=new JFrame();
    JButton b1=new JButton("1");
    JButton b2=new JButton("1");
    JButton b3=new JButton("1");
    JButton b4=new JButton("1");
    JButton b5=new JButton("1");
    Border(){
        f.setSize(500,500);
        f.setLayout(new BorderLayout(10,10));
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        f.add(b1,BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Border();
    }
}
