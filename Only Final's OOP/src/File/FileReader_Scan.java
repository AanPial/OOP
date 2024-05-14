package File;
import java.util.*;
import java.io.*;
public class FileReader_Scan {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(new File("a.txt"));
            while (sc.hasNextLine()){
                String s=sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
