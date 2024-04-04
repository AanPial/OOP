package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AfterFrame implements ActionListener {
    JFrame x=new JFrame();
    ImageIcon icon=new ImageIcon(getClass().getResource("img_2.png"));
    Container c;

    JLabel label=new JLabel("Username : ");
    JTextField tx1=new JTextField();
    JLabel label1=new JLabel();
    JPasswordField pass=new JPasswordField();
    JButton b=new JButton();


    AfterFrame(){
        Frame();
        label();
        tx1();
        pass();
        b();
        x.setLayout(null);
    }
    public void Frame(){
        x.setBounds(50,50,400,400);
        x.setVisible(true);
        x.setTitle("Massanger");
        x.setIconImage(icon.getImage());
        x.setDefaultCloseOperation(x.EXIT_ON_CLOSE);
        x.setResizable(true);
        c=x.getContentPane();
        c.setBackground(Color.white);
    }
    public void label(){
        label.setBounds(50,50,100,50);
        x.add(label);
        label1.setBounds(50,100,100,50);
        x.add(label1);
        label1.setText("Password : ");
    }
    public void tx1(){
        tx1.setBounds(120,65,100,25);
        x.add(tx1);
    }
    public void pass(){
        pass.setBounds(120,115,100,25);
        x.add(pass);
    }
    public void b(){
        b.setBounds(120,165,100,25);
        b.setText("Login");
        x.add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(tx1.getText().equals("aanpial")&& pass.getText().equals("12345")){
            System.out.println("Logged In");
        }
        else {
            System.out.println("Invalid Password or Username.");
        }
    }

}
class pain{
    public static void main(String[] args) {
        AfterFrame f=new AfterFrame();
    }
}
