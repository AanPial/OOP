package GUI;

import javax.swing.*;
import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        JFrame x=new JFrame();
        x.setDefaultCloseOperation(x.EXIT_ON_CLOSE);
        x.setSize(500,500);
        x.setLocation(100,200);
        x.setVisible(true);
        x.setResizable(false);
        x.setLocationRelativeTo(null);
    }
}
