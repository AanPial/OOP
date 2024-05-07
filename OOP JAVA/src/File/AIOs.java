package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AIOs {
    public static void main(String[] args) {
        try{
            FileInputStream p=new FileInputStream("a.txt");
            FileOutputStream o=new FileOutputStream("b.txt");
            int i=0;
            while((i=p.read())!=-1){
                o.write(i);
            }
            o.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
