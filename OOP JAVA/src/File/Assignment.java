package File;

import java.io.*;


public class Assignment {
    public static void main(String[] args) {
        try {
            FileInputStream p = new FileInputStream("a.txt");
            FileOutputStream l = new FileOutputStream("b.txt");

            int i;
            while((i = p.read()) != -1){
                l.write(i);

            }

            p.close();
            l.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}