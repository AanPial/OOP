package File;

import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fo=new FileOutputStream("a.txt");
            String s="Hello world\n how areu";
            fo.write(s.getBytes());
            fo.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
