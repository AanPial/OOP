package withAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent implements ActionListener{
    Frame f=new Frame();
    TextField tf=new TextField();
    Button b=new Button();
    AEvent(){
        frame();
        textfield();
        button();
    }
    public void frame(){
        f.setBounds(50,50,300,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void textfield(){
        tf.setBounds(60,50,170,20);
        f.add(tf);
    }
    public void button(){
        b.setBounds(100,120,80,30);
        f.add(b);
        b.setLabel("Click");
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        AEvent e=new AEvent();
    }
}
