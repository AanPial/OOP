package File;
import java.io.*;
public class CreateFile {
    public static void main(String[] args) {
        try{
            File p=new File("Irfan.txt");
            p.createNewFile();
            System.out.println(p.getAbsolutePath());
            System.out.println(p.canRead());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
