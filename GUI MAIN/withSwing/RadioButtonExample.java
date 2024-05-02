package withSwing;

import javax.swing.*;

public class RadioButtonExample {
    JFrame f=new JFrame();
    JRadioButton b1=new JRadioButton("A) Male");
    JRadioButton b2=new JRadioButton("B) Female");
    RadioButtonExample(){
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        b1.setBounds(75,50,100,30);
        f.add(b1);
        b2.setBounds(75,100,100,30);
        f.add(b2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
