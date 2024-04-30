package withSwing;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxExample  {
    JFrame f= new JFrame();
    JCheckBox c1=new JCheckBox("C++");
    JCheckBox c2=new JCheckBox("C");
    JLabel l=new JLabel();
    public CheckBoxExample(){
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        c1.setBounds(150,100, 50,50);
        f.add(c1);
        c2.setBounds(150,150, 50,50);
        f.add(c2);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==1 && e.getSource()== c1){
                    l.setText("C++ is checked");
                }
                else {
                    l.setText("C++ is unchecked");
                }
            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()==1 && e.getSource()== c2){
                    l.setText("C is checked");
                }
                else {
                    l.setText("C is unchecked");
                }
            }
        });

        l.setHorizontalAlignment(JLabel.CENTER);
        l.setSize(400,100);
        f.add(l);
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}
