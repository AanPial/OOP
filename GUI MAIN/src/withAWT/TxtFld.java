package withAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TxtFld implements ActionListener{
    Frame f= new Frame();
    TextField tf1=new TextField();
    TextField tf2=new TextField();
    TextField tf3=new TextField();
    Button b1=new Button("+");
    Button b2=new Button("-");
    TxtFld(){
        frame();
        text();
        button();
    }
    void frame(){
        f.setBounds(50,50,300,300);
        f.setVisible(true);
        f.setLayout(null);
    }
    void text(){
        tf1.setBounds(50, 50, 150, 20);
        f.add(tf1);
        tf2.setBounds(50, 100, 150, 20);
        f.add(tf2);
        tf3.setBounds(50, 150, 150, 20);
        f.add(tf3);
    }
    void button(){
        b1.setBounds(50, 200, 50, 50);
        f.add(b1);
        b2.setBounds(120,200,50,50);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent a){
        String s1=tf1.getText();
        String s2=tf2.getText();
        double x=Double.parseDouble(s1);
        double y=Double.parseDouble(s2);
        double z=0;
        if (a.getSource()==b1){
            z=x+y;
        }
        else if (a.getSource()==b2){
            z=x-y;
        }
        tf3.setText(z+"");
    }
    public static void main(String[] args) {
        new TxtFld();
    }
}
