package withSwing;
import javax.swing.*;
import java.awt.event.*;
public class TextAreaExample {
    JFrame f=new JFrame("Conter");
    JLabel l1=new JLabel();
    JLabel l2=new JLabel();
    JTextArea a=new JTextArea();
    JButton b=new JButton("Count Words");
    TextAreaExample(){
        frame();
        label();
        area();
        button();
    }
    public void button(){
        b.setBounds(100,300,120,30);
        f.add(b);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text=a.getText();
                String words[]=text.split("\\s");
                l1.setText("Words: "+words.length);
                l2.setText("Characters: "+text.length());
            }
        });
    }
    public void area(){
        a.setBounds(20,75,250,200);
        f.add(a);
    }
    public void label(){
        l1.setBounds(50,25,100,30);
        f.add(l1);
        l1.setText("Words : ");
        l2.setBounds(160,25,100,30);
        f.add(l2);
        l2.setText("Characters : ");
    }
    public void frame(){
        f.setBounds(50,50,450,450);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
}
