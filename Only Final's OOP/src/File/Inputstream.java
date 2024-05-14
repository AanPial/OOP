package File;

import java.io.FileInputStream;

public class Inputstream {
    public static void main(String[] args) {
        try {
            FileInputStream p=new FileInputStream("a.txt");
            int i=0;
            while ((i=p.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
