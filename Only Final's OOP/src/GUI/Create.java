package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Create implements ActionListener{
    JFrame f=new JFrame();
    JPanel pn1,pn2,pn3;
    JButton b1,b2,b3,b4;
    JTextField tf1,tf2,tf3;
    Create(){
        frame();
        panel();
        button();
        text();
    }
    public void frame(){
        f.setSize(500,700);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(3,1,20,20));
    }
    public void panel(){
        pn1=new JPanel();
        pn2=new JPanel();
        pn3=new JPanel();
        pn2.setBackground(Color.GRAY);

        f.add(pn1);
        f.add(pn2);
        f.add(pn3);
        pn1.setLayout(new GridLayout(1,3,50,50));
        pn2.setLayout(new FlowLayout());
    }
    public void text(){
        tf1=new JTextField();
        tf1.setSize(50,50);
        tf2=new JTextField();
        tf3=new JTextField();

        pn1.add(tf1);
        pn1.add(tf2);
        pn1.add(tf3);
    }
    public void button(){
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("*");
        b4=new JButton("/");

        pn2.add(b1);
        pn2.add(b2);
        pn2.add(b3);
        pn2.add(b4);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==b1){
                    int x=Integer.parseInt(tf1.getText());
                    int y=Integer.parseInt(tf2.getText());
                    int z=x+y;
                    tf3.setText("= "+z);
                }
            }
        });
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b2){
            int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x-y;
            tf3.setText("= "+z);
        }
        else if (e.getSource()==b3) {
            int x=Integer.parseInt(tf1.getText());
            int y=Integer.parseInt(tf2.getText());
            int z=x*y;
            tf3.setText("= "+z);
        }
        else if (e.getSource()==b4) {
            try {
                int x=Integer.parseInt(tf1.getText());
                int y=Integer.parseInt(tf2.getText());
                int z=x/y;
                tf3.setText("= "+z);
            }
            catch (Exception c){
                tf3.setText("Cannot devided by zero");
            }
        }
    }
    public static void main(String[] args) {
        new Create();
    }
}
