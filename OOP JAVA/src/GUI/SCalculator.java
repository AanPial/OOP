package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCalculator {
    JFrame frame=new JFrame();
    ImageIcon icon=new ImageIcon(getClass().getResource("img_3.png"));
    Container c;
    JTextField t1=new JTextField();
    JTextField t3=new JTextField();
    JButton b=new JButton();
    JButton t2=new JButton("+");
    JTextField t4=new JTextField();

    public String s;

    public SCalculator(){
        frame();
        textfield();
        button();
        frame.setLayout(null);
    }
    public void frame(){
        frame.setBounds(50,50,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setIconImage(icon.getImage());
        frame.setTitle("Calculator");
        c=frame.getContentPane();
        c.setBackground(Color.GRAY);
    }
    public void textfield(){
        t1.setBounds(50,50,100,50);
        frame.add(t1);
        t3.setBounds(250,50,100,50);
        frame.add(t3);
        t4.setBounds(150,250,100,50);
        frame.add(t4);
    }
    public void button(){
        b.setBounds(150,150,100,50);
        frame.add(b);
        b.setText("=");

        t2.setBounds(200,50,45,50);
        frame.add(t2);

        t2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double m=Double.parseDouble(t1.getText());
                t1.setText(t1.getText()+"+");
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(t2.getText().equals("+")){
                    double m=Double.parseDouble(t1.getText());
                    t4.setText(m+"");
                }
            }
        });
    }
}
class cai{
    public static void main(String[] args) {
        SCalculator f=new SCalculator();
    }
}
