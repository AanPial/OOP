package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment_Star {
    public static void main(String[] args) {
        try {
            FileInputStream p=new FileInputStream("a.txt");
            FileOutputStream f=new FileOutputStream("b.txt");
            int i=0;
            while((i=p.read())!=-1){
                f.write(i);
            }
            f.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
