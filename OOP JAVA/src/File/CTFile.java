package File;
import java.io.*;
import java.util.*;
public class CTFile {
    public static void main(String[] args) throws IOException {
        File f=new File("input.txt");
        f.createNewFile();
        Scanner p=new Scanner(f);
        int sum=0;
        while (p.hasNextLine()){
            String st;
            st=p.nextLine();
            if(ist(st)==true){
                int x=Integer.parseInt(st);
                sum = sum + x;
            }
        }
        System.out.println(sum);
        p.close();
        File f2=new File("output.txt");
        f2.createNewFile();
        FileWriter k=new FileWriter("output.txt");
        k.write(sum+"");
        k.close();
    }
    public static boolean ist(String st){
        try{
            int x=Integer.parseInt(st);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
