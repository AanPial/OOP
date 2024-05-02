package File;
import java.io.*;
import java.util.*;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            Scanner p=new Scanner(System.in);
            FileWriter w=new FileWriter("Irfan.txt");
            int i,n;
            System.out.print("Enter limit : ");
            n=p.nextInt();
            for(i=1;i<=n;i++){
                String irf=p.next();
                w.write(irf+"\n");
            }
            w.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
