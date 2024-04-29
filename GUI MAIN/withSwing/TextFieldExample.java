package withSwing;
import javax.swing.*;
import java.awt.event.*;
public class TextFieldExample implements ActionListener{
    JFrame f= new JFrame("SumSub");
    JTextField tf1=new JTextField();
    JTextField tf2=new JTextField();
    JTextField tf3=new JTextField();
    JButton b1=new JButton("+");
    JButton b2=new JButton("-");
    TextFieldExample(){
        frame();
        field();
        button();
    }

    public void frame(){
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public void button(){
        b1.setBounds(50,200,50,50);
        f.add(b1);
        b2.setBounds(120,200,50,50);
        f.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double x=Double.parseDouble(tf1.getText());
        double y=Double.parseDouble(tf2.getText());
        if(e.getSource()==b1){
            tf3.setText(x+y+"");
        }
        else if(e.getSource()==b2){
            tf3.setText(x-y+"");
        }

    }
    public void field(){
        tf1.setBounds(50,50,150,20);
        f.add(tf1);
        tf2.setBounds(50,100,150,20);
        f.add(tf2);
        tf3.setBounds(50,150,150,20);
        f.add(tf3);
        tf3.setEditable(false);
    }

    public static void main(String[] args) {
        new TextFieldExample();
    }
}
