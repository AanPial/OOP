package File;

import java.io.File;

public class newFile {
    public static void main(String[] args) {
        try{
            File f=new File("a.txt");
            System.out.println(f.exists());
            f.createNewFile();
            System.out.println(f.exists());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
