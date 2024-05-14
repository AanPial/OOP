package File;
import java.util.*;
import java.io.*;
public class Assignment {
    public static void main(String[] args) {
        try {
             Scanner sc=new Scanner(new File("a.txt"));
             PrintWriter f=new PrintWriter("b.txt");
             while (sc.hasNextLine()){
                 String s=sc.nextLine();
                 f.println(s);
             }
             f.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
