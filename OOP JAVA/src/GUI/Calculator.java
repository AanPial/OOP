package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    JFrame frame=new JFrame();
    JTextField txtfield1=new JTextField();
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JTextField textField2=new JTextField();
    Container c;
    public Calculator(){
        frame();
        txtfield1();
        button();
        frame.setLayout(null);
    }
    public void frame(){
        frame.setBounds(50,50,350,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        c=frame.getContentPane();
        c.setBackground(Color.cyan);
    }
    public void txtfield1(){
        txtfield1.setBounds(50,50,225,50);
        frame.add(txtfield1);

        textField2.setBounds(50,500,225,50);
        frame.add(textField2);
    }
    public void button(){
        b1.setBounds(50,100,50,50);
        b1.setText("1");
        frame.add(b1);

        b2.setBounds(223,100,50,50);
        b2.setText("2");
        frame.add(b2);

        b3.setBounds(50,200,50,50);
        b3.setText("3");
        frame.add(b3);

        b4.setBounds(223,200,50,50);
        b4.setText("4");
        frame.add(b4);

        b5.setBounds(50,300,50,50);
        b5.setText("+");
        frame.add(b5);

        b6.setBounds(223,300,50,50);
        b6.setText("-");
        frame.add(b6);

        b7.setBounds(130,400,50,50);
        b7.setText("=");
        frame.add(b7);
    }
    {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfield1.setText(txtfield1.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfield1.setText(txtfield1.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfield1.setText(txtfield1.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfield1.setText(txtfield1.getText()+"4");
            }
        });
        /*b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //txtfield1.setText(txtfield1.getText()+"+");
                double m=Double.parseDouble(txtfield1.getText());
                //textField2.setText(textField2.getText()+"+");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtfield1.setText(txtfield1.getText()+"-");
            }
        });*/
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1=Integer.parseInt(b7.getText());
                txtfield1.setText(txtfield1.getText()+no1+"");
            }
        });
    }
}
class smain{
    public static void main(String[] args) {
        Calculator f=new Calculator();
    }
}