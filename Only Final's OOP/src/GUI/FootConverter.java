package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootConverter implements ActionListener {
    JFrame f=new JFrame();
    JLabel l1,l2;
    JTextField tf1,tf2;
    JButton b=new JButton("Convert");
    FootConverter(){
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        l1=new JLabel("Foot");
        l1.setBounds(20,10,100,100);
        f.add(l1);
        tf1=new JTextField();
        tf1.setBounds(100,30,100,50);
        f.add(tf1);
        b.setBounds(100,80,100,50);
        f.add(b);
        tf2=new JTextField();
        tf2.setBounds(100,140,100,50);
        f.add(tf2);
        l2=new JLabel("inch");
        l2.setBounds(20,140,100,50);
        f.add(l2);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double x=Double.parseDouble(tf1.getText());
        double y=x*12;
        tf2.setText(y+"");
    }
    public static void main(String[] args) {
        new FootConverter();
    }
}
