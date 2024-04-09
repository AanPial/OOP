package withAWT;

import java.awt.*;

public class Use_Associaton {
    Frame f= new Frame();
    Label l=new Label();
    TextField t=new TextField();
    Button b=new Button();
    public Use_Associaton(){
        frame();
        label();
        text();
        button();
    }
    void frame(){
        f.setTitle("Employee info");
        f.setBounds(50,50,400,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.cyan);
    }
    void label(){
        l.setBounds(20, 80, 80, 30);
        f.add(l);
        l.setText("Employee id:");
    }
    void text(){
        t.setBounds(20, 100, 80, 30);
        f.add(t);
    }
    void button(){
        b.setBounds(100, 100, 80, 30);
        f.add(b);
        b.setLabel("Submit");
        b.setBackground(Color.gray);
    }
    public static void main(String[] args) {
        Use_Associaton p=new Use_Associaton();
    }
}
