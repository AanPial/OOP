package withSwing;

import javax.swing.*;
import java.awt.*;

public class Border2 {
    JFrame f=new JFrame();
    JButton b1=new JButton("East");
    JButton b2=new JButton("West");
    JButton b3=new JButton("North");
    JButton b4=new JButton("South");
    JButton b5=new JButton("Center");
    Border2(){
        f.setSize(300, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        f.setLayout(new BorderLayout(20,30));

        f.add(b1, BorderLayout.EAST);
        f.add(b2,BorderLayout.WEST);
        f.add(b3,BorderLayout.NORTH);
        f.add(b4,BorderLayout.SOUTH);
        f.add(b5,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new Border2();
    }
}
