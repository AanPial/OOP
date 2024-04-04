package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Plus {
    JFrame frame=new JFrame();
    JTextField txtfield1=new JTextField();
    JTextField txtfield2=new JTextField();
    JButton b1=new JButton();
    JButton b2=new JButton("-");
    JTextField textField3=new JTextField();
    ImageIcon icon=new ImageIcon(getClass().getResource("img_1.png"));
    Container c;
    public Plus(){
        frame();
        txtfield();
        button();
    }
    public void frame(){
        frame.setBounds(50,50,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setIconImage(icon.getImage());
        c=frame.getContentPane();
        c.setBackground(Color.cyan);
        frame.setLayout(null);
    }
    public void txtfield(){
        txtfield1.setBounds(100,50,50,50);
        frame.add(txtfield1);
        txtfield2.setBounds(300,50,50,50);
        frame.add(txtfield2);
        textField3.setBounds(175,300,100,50);
        frame.add(textField3);
    }
    public void button(){
        b1.setBounds(100,200,50,50);
        frame.add(b1);
        b1.setText("+");

        b2.setBounds(300,200,50,50);
        frame.add(b2);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1=Integer.parseInt(txtfield1.getText());
                int no2=Integer.parseInt(txtfield2.getText());
                textField3.setText(no1+no2+"");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int no1=Integer.parseInt(txtfield1.getText());
                int no2=Integer.parseInt(txtfield2.getText());
                textField3.setText(no1-no2+"");
            }
        });
    }
}
class Train{
    public static void main(String[] args) {
        Plus f=new Plus();
    }
}
