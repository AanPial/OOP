package File;
import java.io.*;
import java.util.*;
public class ReadFile {
    public static void main(String[] args) {
        try{
            File f=new File("Irfan.txt");
            f.createNewFile();
            Scanner sc=new Scanner(f);
            while (sc.hasNextLine()){
                String irfan=sc.nextLine();
                System.out.println(irfan);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
