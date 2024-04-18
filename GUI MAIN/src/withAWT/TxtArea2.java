package withAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TxtArea2 implements ActionListener {
    Frame f=new Frame();
    Label l1=new Label("Words : ");
    Label l2=new Label("Characters : ");
    TextArea TA=new TextArea();
    Button b=new Button("Count words");
    TxtArea2(){
        frame();
        label();
        area();
        button();
    }
    void frame(){
        f.setBounds(50,50,400, 450);
        f.setVisible(true);
        f.setLayout(null);
    }
    void label(){
        l1.setBounds(50, 50, 100, 30);
        f.add(l1);
        l2.setBounds(160, 50, 100, 30);
        f.add(l2);
    }
    void area(){
        TA.setBounds(20, 100, 300, 300);
        f.add(TA);
        TA.setBackground(Color.cyan);
        TA.setForeground(Color.red);
    }
    void button(){
        b.setBounds(100, 400, 100, 30);
        f.add(b);
        b.addActionListener(this);
        b.setBackground(Color.red);
    }
    public void actionPerformed(ActionEvent a){
        String s=TA.getText();
        int n=s.length();
        l2.setText(l2.getText()+""+n);
        String words[]=s.split("\\s");
        int m=words.length;
        l1.setText(l1.getText()+""+m);
    }
    public static void main(String[] args) {
        new TxtArea2();
    }
}
