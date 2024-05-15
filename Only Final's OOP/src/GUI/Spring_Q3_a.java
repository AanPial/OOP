package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spring_Q3_a {
    JFrame f=new JFrame();
    JPanel p1,p2;
    JButton b1=new JButton("Click");
    int c=0;
    Spring_Q3_a(){
        f.setSize(500,500);
        f.setLayout(new GridLayout(2,1));
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);

        p1=new JPanel();
        p2=new JPanel();
        f.add(p1);
        f.add(p2);
        p1.setBackground(Color.cyan);
        p2.setBackground(Color.gray);
        p2.add(b1);
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout(FlowLayout.CENTER));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c++;
                p1.add(new JLabel("b"+c+""));
                p1.add(new JButton("button"+c+""));
                f.revalidate();
            }
        });

    }
    public static void main(String[] args) {
        new Spring_Q3_a();
    }
}
