package withSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    JFrame f=new JFrame();
    JTextField tf=new JTextField();
    JButton b=new JButton();
    public ActionListenerExample(){
        f.setBounds(50,50,300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        tf.setBounds(50,50,150,20);
        f.add(tf);
        b.setBounds(50,100,150,20);
        f.add(b);
        b.addActionListener(this);
        f.setLayout(null);
        b.setText("Click");
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome to Java");
    }

    public static void main(String[] args) {
        ActionListenerExample f=new ActionListenerExample();
    }
}
