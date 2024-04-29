package withSwing;

import java.awt.*;
import javax.swing.*;
public class Hello {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame"); //Creating the top level container
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 100);
        JPanel p = new JPanel();
        p.setBackground(Color.cyan); //Setting the background color of the panel
        JButton b = new JButton("Click here"); //Create a JButton object
        b.setBackground(Color.red); //SetButton color
        b.setForeground(Color.BLUE); //Setting the text color of the button
        p.add(b); //add button to panel
        f.setContentPane(p); //add panel to frame
        f.setVisible(true);
    }
}