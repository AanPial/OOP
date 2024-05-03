package withSwing;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class simplHishb {
    JFrame f=new JFrame("sp");
    JTextField tf=new  JTextField();
    JTextField tf2=new  JTextField();
    JTextField tf3=new  JTextField();
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    public simplHishb(){
       frame();
       f.add(tf,BorderLayout.NORTH);
       f.add(tf2,BorderLayout.CENTER);
       f.add(tf3,BorderLayout.SOUTH);
       f.add(b1,BorderLayout.EAST);
       f.add(b2,BorderLayout.WEST);

       b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               double x=Double.parseDouble(tf.getText());
               double y=Double.parseDouble(tf3.getText());
               double z=x+y;
               tf2.setText(z+"");
           }
       });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double x=Double.parseDouble(tf.getText());
                double y=Double.parseDouble(tf3.getText());
                double z=x-y;
                tf2.setText(z+"");
            }
        });
    }
    public void frame(){
        f.setSize(300,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout(20,20));
    }
    public static void main(String[] args) {
        new simplHishb();
    }
}
