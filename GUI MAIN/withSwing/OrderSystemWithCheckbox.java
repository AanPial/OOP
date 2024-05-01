package withSwing;

import javax.swing.*;
import java.awt.event.*;

public class OrderSystemWithCheckbox implements ActionListener {
    JFrame f=new JFrame("Order");
    JLabel l=new JLabel("Food oredering system");
    JCheckBox ch1=new JCheckBox("Pizza @ 100");
    JCheckBox ch2=new JCheckBox("Burger @ 30");
    JCheckBox ch3=new JCheckBox("Tea @ 10");
    JButton b=new JButton("Order");
    OrderSystemWithCheckbox(){
        frame();
        label();
        box();
        button();
    }
    public void button(){
        b.setBounds(100,250,80,30);
        f.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double total=0;
        String s="";
        if(ch1.isSelected()){
            total+=100;
            s+="Pizza : 100\n";
        }
        if(ch2.isSelected()){
            total+=30;
            s+="Burger : 30\n";
        }
        if(ch3.isSelected()){
            total+=10;
            s+="Tea : 10\n";
        }
        String p="-----------------------\n";
        String massage=s+p+"Total : "+total;
        JOptionPane.showMessageDialog(f,massage,"Order",JOptionPane.WARNING_MESSAGE);
    }
    public void box(){
        ch1.setBounds(100,100,150,20);
        f.add(ch1);
        ch2.setBounds(100,150,150,20);
        f.add(ch2);
        ch3.setBounds(100,200,150,20);
        f.add(ch3);
    }
    public void label(){
        l.setBounds(50,50,300,20);
        f.add(l);
    }
    public void frame(){
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new OrderSystemWithCheckbox();
    }
}
