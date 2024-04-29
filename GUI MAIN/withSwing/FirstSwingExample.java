package withSwing;
import javax.swing.*;
public class FirstSwingExample {
    JFrame f=new JFrame("First");
    JButton b=new JButton("Click");
    FirstSwingExample(){
        frame();
        button();
    }
    void frame(){
        f.setSize(400,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    void button(){
        b.setBounds(130,100,100, 40);
        f.add(b);
    }

    public static void main(String[] args) {
        new FirstSwingExample();
    }
}
