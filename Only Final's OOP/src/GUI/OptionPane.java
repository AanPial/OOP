package GUI;

import javax.swing.*;

public class OptionPane {
    JFrame f=new JFrame();
    OptionPane(){
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        //JOptionPane.showMessageDialog(f,"Hello world","Alert",JOptionPane.WARNING_MESSAGE);
        //String s=JOptionPane.showInputDialog(f,"Enter name : ");
        //System.out.println(s);
    }
    public static void main(String[] args) {
        new OptionPane();
    }
}
