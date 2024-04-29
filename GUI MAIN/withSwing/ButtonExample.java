package withSwing;
import javax.swing.*;
public class ButtonExample {
    JFrame f=new JFrame();
    JButton b=new JButton(new ImageIcon("img.png"));
    ButtonExample(){
        f.setBounds(50,50,500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        b.setBounds(100,100,300, 200);
        f.add(b);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}
