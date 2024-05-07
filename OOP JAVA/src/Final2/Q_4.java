package Final2;
import javax.swing.*;
import java.awt.event.*;
public class Q_4 implements ActionListener{
    JFrame f=new JFrame();
    JTextField input=new JTextField();
    JTextField output=new JTextField();
    JButton b1=new JButton("Press");
    Q_4(){
        f.setBounds(50,50,300,400);
        f.setLayout(null);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setVisible(true);

        input.setBounds(50,50,200,50);
        f.add(input);

        output.setBounds(50,150,200,50);
        f.add(output);

        b1.setBounds(100,250,100,50);
        f.add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String s=input.getText();
        int count=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ){
                count++;
            }
        }
        output.setText(""+count);
    }
    public static void main(String[] args) {
        new Q_4();
    }
}
