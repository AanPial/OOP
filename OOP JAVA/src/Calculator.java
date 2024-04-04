import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Calculator {
    JFrame frame=new JFrame("Simple Calculator");
    JTextField field1=new JTextField();
    JTextField field2=new JTextField();
    JTextField field3=new JTextField();
    JButton b1=new JButton("1");
    JButton b2=new JButton("2");
    JButton b3=new JButton("3");
    JButton b4=new JButton("4");
    JButton b5=new JButton("5");
    JButton b6=new JButton("6");
    JButton b7=new JButton("7");
    JButton b8=new JButton("8");
    JButton b9=new JButton("9");
    JButton b0=new JButton("0");
    JButton plus=new JButton("+");
    JButton minus=new JButton("-");
    JButton prod=new JButton("*");
    JButton div=new JButton("/");
    JButton equal=new JButton("ANS");
    JButton cancel=new JButton("Cancel");
    JButton Dot=new JButton(".");
    ImageIcon icon=new ImageIcon(getClass().getResource("img.png"));
    ImageIcon eqn=new ImageIcon(getClass().getResource("img_1.png"));
    Container c,a;

    public String s;
    public double x;
    public Calculator(){
        frame();
        textfield();
        button();
        abutton();
    }
    public void frame(){
        frame.setBounds(50,50,480,700);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setIconImage(icon.getImage());
        c=frame.getContentPane();
        c.setBackground(Color.darkGray);
    }
    public void textfield(){
        field1.setBounds(50,50,350,50);
        frame.add(field1);
        field2.setBounds(50,550,350,50);
        frame.add(field2);
        field3.setBounds(50,600,350,50);
        frame.add(field3);
    }
    public void button(){
        b1.setBounds(50,120,50,50);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"1");
                field3.setText(field3.getText()+"1");
            }
        });

        b2.setBounds(150,120,50,50);
        frame.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"2");
                field3.setText(field3.getText()+"2");
            }
        });

        b3.setBounds(250,120,50,50);
        frame.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"3");
                field3.setText(field3.getText()+"3");
            }
        });

        b4.setBounds(350,120,50,50);
        frame.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"4");
                field3.setText(field3.getText()+"4");
            }
        });

        b5.setBounds(50,220,50,50);
        frame.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"5");
                field3.setText(field3.getText()+"5");
            }
        });

        b6.setBounds(150,220,50,50);
        frame.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"6");
                field3.setText(field3.getText()+"6");
            }
        });

        b7.setBounds(250,220,50,50);
        frame.add(b7);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"7");
                field3.setText(field3.getText()+"7");
            }
        });

        b8.setBounds(350,220,50,50);
        frame.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"8");
                field3.setText(field3.getText()+"8");
            }
        });

        b9.setBounds(50,320,50,50);
        frame.add(b9);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"9");
                field3.setText(field3.getText()+"9");
            }
        });

        b0.setBounds(350,320,50,50);
        frame.add(b0);
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+"0");
                field3.setText(field3.getText()+"0");
            }
        });

        Dot.setBounds(200,500,50,50);
        frame.add(Dot);
        Dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText(field1.getText()+".");
                field3.setText(field3.getText()+".");
            }
        });

    }
    public void abutton(){
        plus.setBounds(50,400,50,50);
        frame.add(plus);
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n=Double.parseDouble(field1.getText());
                x=n;
                field2.setText("+"+n);
                field1.setText(field1.getText()+"+");
                field3.setText("");
                s="+";
            }
        });

        minus.setBounds(150,400,50,50);
        frame.add(minus);
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n=Double.parseDouble(field1.getText());
                x=n;
                field2.setText("-"+n);
                field1.setText(field1.getText()+"-");
                field3.setText("");
                s="-";
            }
        });

        prod.setBounds(250,400,50,50);
        frame.add(prod);
        prod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n=Double.parseDouble(field1.getText());
                x=n;
                field2.setText("*"+n);
                field1.setText(field1.getText()+"*");
                field3.setText("");
                s="*";
            }
        });

        div.setBounds(350,400,50,50);
        frame.add(div);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n=Double.parseDouble(field1.getText());
                x=n;
                field2.setText("/"+n);
                field1.setText(field1.getText()+"/");
                field3.setText("");
                s="/";
            }
        });

        cancel.setBounds(300,500,100,50);
        cancel.setBackground(Color.red.darker());
        frame.add(cancel);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field1.setText("");
                field3.setText("");
                field2.setText("");
            }
        });

        equal.setBounds(50,500,100,50);
        frame.add(equal);
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Objects.equals(s, "+")){
                    double n=Double.parseDouble(field3.getText());
                    field2.setText(n+x+"");
                }
                else if(Objects.equals(s, "-"))
                {
                    double n=Double.parseDouble(field3.getText());
                    field2.setText(x-n+"");
                }
                else if(Objects.equals(s, "*"))
                {
                    double n=Double.parseDouble(field3.getText());
                    field2.setText(x*n+"");
                }
                else if(Objects.equals(s, "/"))
                {
                    double n=Double.parseDouble(field3.getText());
                    field2.setText(x/n+"");
                }
            }
        });
    }
}
class Cmain{
    public static void main(String[] args) {
        new Calculator();
    }
}