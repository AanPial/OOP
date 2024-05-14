package File;

import java.io.FileOutputStream;

public class Outputstream {
    public static void main(String[] args) {
        try {
            FileOutputStream f=new FileOutputStream("a.txt");
            String s="Hello Bangladesh";
            byte []b=s.getBytes();
            f.write(b);
            f.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
