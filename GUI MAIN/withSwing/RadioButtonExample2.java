package withSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample2 implements ActionListener {
    JFrame f=new JFrame();
    JRadioButton b1=new JRadioButton("A) Male");
    JRadioButton b2=new JRadioButton("B) Female");
    ButtonGroup bg=new ButtonGroup();
    RadioButtonExample2(){
        frame();
        button();
    }
    public void frame() {
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void button(){
        b1.setBounds(75,50,100,30);
        f.add(b1);
        b2.setBounds(75,100,100,30);
        f.add(b2);
        bg.add(b1);
        bg.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (b1.isSelected()){
            JOptionPane.showMessageDialog(f,"You are male");
        } else if (b2.isSelected()) {
            JOptionPane.showMessageDialog(f,"You are female");
        }
    }

    public static void main(String[] args) {
        new RadioButtonExample2();
    }
}
