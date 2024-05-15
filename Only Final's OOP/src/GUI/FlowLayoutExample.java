package GUI;

import java.awt.*;
import java.awt.event.*;
class FlowLayoutExample implements ActionListener{
    Frame frameObj;
    int i =0;

    FlowLayoutExample()  {
        frameObj = new Frame();

        Button b1 = new Button("ADD");
        b1.addActionListener(this);

        frameObj.add(b1);

        frameObj.setLayout(new FlowLayout());
        frameObj.setSize(300, 300);
        frameObj.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        i++;
        frameObj.revalidate();
        frameObj.add(new Label("b"+i));
        frameObj.add(new Button("button "+i));
    }


    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
