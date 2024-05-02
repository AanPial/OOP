package File;
import java.io.*;
import java.util.*;
public class GetFileInfo {
    public static void main(String[] args) {
        try{
            File f=new File("Irfan.txt");
            if(f.exists()){
                System.out.println("File name: "+f.getName());
                System.out.println("Absolute path: "+f.getAbsolutePath());
                System.out.println("Writeable: "+f.canWrite());
                System.out.println("Readable: "+f.canRead());
                System.out.println("File size in bytes "+f.length());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
