package withSwing;
import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample implements ActionListener{
    JFrame f=new JFrame("Password Field Example");
    JTextField tf=new JTextField();
    JLabel l1=new JLabel("Username : ");
    JLabel l2=new JLabel("Password : ");
    final JLabel l3=new JLabel();
    JPasswordField pf=new JPasswordField();
    JButton b=new JButton("Login");
    PasswordFieldExample(){
        frame();
        field();
        label();
        button();
    }
    public void button(){
        b.setBounds(100,120, 80,30);
        f.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        l3.setText("Username : "+tf.getText()+";Password : "+new String(pf.getPassword()));
    }
    public void frame(){
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void label(){
        l1.setBounds(20,20, 80,30);
        f.add(l1);
        l2.setBounds(20,75, 80,30);
        f.add(l2);
        l3.setBounds(20,150, 200,50);
        f.add(l3);
    }
    public void field(){
        tf.setBounds(100,20, 100,30);
        f.add(tf);
        pf.setBounds(100,75,100,30);
        f.add(pf);
    }
    public static void main(String[] args) {
        new PasswordFieldExample();
    }
}
