package withSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LabelExample implements ActionListener {
    JFrame f= new JFrame("Java Tea");
    JTextField tf= new JTextField();
    Container c;
    JLabel l=new JLabel();
    JButton b=new JButton("Find IP");
    public LabelExample(){
        frame();
        filed();
        label();
        button();
    }
    public void frame(){
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        c=f.getContentPane();
        c.setBackground(Color.cyan);
    }
    public void button(){
        b.setBounds(50,150,95,30);
        f.add(b);
        b.addActionListener(this);
    }
    public void filed(){
        tf.setBounds(50,50, 150,20);
        f.add(tf);
    }
    public void label(){
        l.setBounds(50,100, 250,20);
        f.add(l);
        l.setText("To find");
        l.setForeground(Color.red);
    }
    public void actionPerformed(ActionEvent a){
        try {
            String host=tf.getText();
            String ip=java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of "+host+" is: "+ip);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new LabelExample();
    }
}
