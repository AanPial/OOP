package File;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountLIne {
    public static void main(String[] args) {
        try {
            int c=0;
            Scanner sc=new Scanner(new File("a.txt"));
            PrintWriter p=new PrintWriter(new File("b.txt"));
            while (sc.hasNextLine()){
                c++;
                String s=sc.nextLine();
                p.println(s);
            }
            System.out.println(c);
            p.close();
            sc.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
