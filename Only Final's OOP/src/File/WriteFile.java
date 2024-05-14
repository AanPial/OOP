package File;
import java.io.*;
public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter f=new FileWriter(new File("a.txt"));
            f.write("Hello World");
            f.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
