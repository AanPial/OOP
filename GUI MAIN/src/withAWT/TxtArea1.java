package withAWT;

import java.awt.*;

public class TxtArea1 {
    Frame f=new Frame();
    TextArea textArea=new TextArea();
    TxtArea1(){
        frame();
        area();
    }
    void frame(){
        f.setBounds(50,50,400, 400);
        f.setVisible(true);
        f.setLayout(null);
    }
    void area(){
        textArea.setBounds(10, 30, 300, 300);
        f.add(textArea);
        textArea.setText("Welcome To JAVA.");
        textArea.setForeground(Color.red);
        textArea.setBackground(Color.cyan);

    }
    public static void main(String[] args) {
        new TxtArea1();
    }
}
