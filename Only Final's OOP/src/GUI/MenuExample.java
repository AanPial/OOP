package GUI;

import javax.swing.*;

public class MenuExample {
    JFrame f=new JFrame();
    JMenu m1=new JMenu("Menu");
    JMenu m2=new JMenu("Sub Menu");
    JMenuBar mb=new JMenuBar();
    JMenuItem i1, i2, i3, i4, i5;

    MenuExample(){
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");
        i4=new JMenuItem("Item 4");
        i5=new JMenuItem("Item 5");

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(m2);
        m2.add(i4);
        m2.add(i5);
        mb.add(m1);
        f.setJMenuBar(mb);

    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
