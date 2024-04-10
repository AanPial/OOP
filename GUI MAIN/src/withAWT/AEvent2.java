package withAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AEvent2 {
    Frame f=new Frame();
    TextField tf=new TextField();
    Button b=new Button();
    AEvent2(){
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
    }
    Outer o=new Outer(this);

    public static void main(String[] args) {
        new AEvent();
    }
}
class Outer implements ActionListener{
    AEvent2 obj;
    Outer(AEvent2 obj){
        this.obj=obj;
    }
    public void actionPerformed(ActionEvent e){
        obj.tf.setText("welcome");
    }
}
