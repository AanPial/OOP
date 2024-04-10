package withAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent3 {
    Frame f=new Frame();
    TextField tf=new TextField();
    Button b=new Button();
    AEvent3(){
        frame();
        textfield();
        button();
    }
    public void frame(){
        f.setBounds(50,50,300,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.CYAN);
    }
    public void textfield(){
        tf.setBounds(60,50,170,20);
        f.add(tf);
    }
    public void button(){
        b.setBounds(100,120,80,30);
        f.add(b);
        b.setBackground(Color.gray);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome");
            }
        });
        b.setLabel("Click");
    }

    public static void main(String[] args) {
        new AEvent3();
    }
}