package withSwing;
import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample2 implements ActionListener{
    JFrame f=new JFrame("Password Field Example");
    JFrame f2=new JFrame("Your Account");
    JTextField tf=new JTextField();
    JLabel l1=new JLabel("Username : ");
    JLabel l2=new JLabel("Password : ");
    JLabel l4=new JLabel("Username : ");
    JLabel l5=new JLabel("Password : ");
    final JLabel l3=new JLabel();
    JPasswordField pf=new JPasswordField();
    JButton b=new JButton("Login");
    JButton b2=new JButton("Back");
    PasswordFieldExample2(){
        frame();
        field();
        label();
        button();
    }
    public void button(){
        b.setBounds(100,120, 80,30);
        f.add(b);
        b.addActionListener(this);

        b2.setBounds(100,120, 80,30);
        f2.add(b2);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b)
        {
            f2.setVisible(true);
            f.setVisible(false);
        } else if (e.getSource()==b2)
        {
            f2.setVisible(false);
            f.setVisible(true);
        }
        l4.setText("Username : "+tf.getText());
        l5.setText("Password : "+new String(pf.getPassword()));
    }
    public void frame(){
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        f2.setBounds(400,50,300,300);
        f2.setLayout(null);
        f2.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void label(){
        l1.setBounds(20,20, 80,30);
        f.add(l1);
        l2.setBounds(20,75, 80,30);
        f.add(l2);
        l3.setBounds(20,150, 200,50);
        f.add(l3);

        l4.setBounds(20,20, 200,30);
        f2.add(l4);
        l5.setBounds(20,75, 200,30);
        f2.add(l5);
    }
    public void field(){
        tf.setBounds(100,20, 100,30);
        f.add(tf);
        pf.setBounds(100,75,100,30);
        f.add(pf);
    }
    public static void main(String[] args) {
        new PasswordFieldExample2();
    }
}
