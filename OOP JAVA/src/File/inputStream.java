package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class inputStream {
    public static void main(String[] args) {
        try {
            FileInputStream p=new FileInputStream("b.txt");
            int i=0;
            while ((i=p.read())!=-1){
                System.out.print((char)i);
            }
            p.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
