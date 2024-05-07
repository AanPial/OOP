package Final2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q_2 {
    public static void main(String[] args) {
        try{
            FileInputStream p=new FileInputStream("a.txt");
            FileOutputStream o=new FileOutputStream("b.txt");
            int i=0;
            while((i=p.read())!=-1){
                if(i == '1' || i == '2' || i == '3' || i == '4' || i == '5' ||
                        i == '6' || i == '7' || i == '8' || i == '9' || i == '0' ){
                    o.write(i);
                }
            }
            o.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
