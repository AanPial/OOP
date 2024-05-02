package withSwing;

import javax.swing.*;
import java.awt.*;

public class Border3 {
    JFrame f=new JFrame();
    JButton b1=new JButton("East");
    JButton b2=new JButton("West");
    JButton b3=new JButton("North");
    JButton b4=new JButton("South");
    JButton b5=new JButton("Center");
    Border3(){
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
    }
    public static void main(String[] args) {
        new Border3();
    }
}