package File;
import java.io.*;

public class PrintWriter_File {
    public static void main(String[] args) {
        try {
            PrintWriter p=new PrintWriter("a.txt");
            p.println("I am writing code in Java....");
            p.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
