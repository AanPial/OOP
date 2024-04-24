package withSwing;

import javax.swing.*;
import java.awt.event.*;
public class Ex1  {
    JFrame f=new JFrame();
    JTextField tf=new JTextField();
    JButton b=new JButton();
    public Ex1(){
        f.setBounds(50,50,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        tf.setBounds(50,50,150,20);
        f.add(tf);
        b.setBounds(50,100,150,20);
        f.add(b);
        f.setLayout(null);
        b.setText("Click");
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello world");
            }
        });
    }

    public static void main(String[] args) {
        Ex1 f=new Ex1();
    }
}