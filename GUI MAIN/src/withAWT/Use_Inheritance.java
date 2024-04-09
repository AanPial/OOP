package withAWT;

import java.awt.*;

public class Use_Inheritance extends Frame {
    public Use_Inheritance(){
        setLocation(50,50);
        setSize(500,500);
        setVisible(true);
        setTitle("This is our basic AWT");
        button();
        setLayout(null);
    }
    void button(){
        Button b1=new Button();
        b1.setBounds(50,50,100,50);
        add(b1);
        b1.setLabel("Click");
    }

    public static void main(String[] args) {
        Use_Inheritance p=new Use_Inheritance();
    }
}
