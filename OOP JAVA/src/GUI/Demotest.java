package GUI;

import javax.swing.*;
import java.awt.*;

public class Demotest {
    JFrame x=new JFrame();
    ImageIcon icon=new ImageIcon(getClass().getResource("img.png"));
    private Container l;
    public Demotest(){
        x.setBounds(200,300,500,500);
        x.setVisible(true);
        x.setDefaultCloseOperation(x.EXIT_ON_CLOSE);
        x.setResizable(false);
        x.setTitle("Default Practice");
        x.setIconImage(icon.getImage());
        l=x.getContentPane();
        l.setBackground(Color.yellow);
    }
}
class main{
    public static void main(String[] args) {
        Demotest f=new Demotest();
    }
}
