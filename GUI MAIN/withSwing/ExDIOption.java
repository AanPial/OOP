package withSwing;
import javax.swing.*;
public class ExDIOption {
    JFrame f=new JFrame();
    public ExDIOption(){
        JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);
    }
    public static void main(String[] args) {
        new ExDIOption();
    }
}
