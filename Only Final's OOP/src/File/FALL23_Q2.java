package File;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Spring_Q2 {
    public static void main(String[] args) {
        try {
            PrintWriter p = new PrintWriter(new File("output.txt"));
            Scanner sc = new Scanner(new File("input.txt"));
            int count = 0;
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if( (ch >= 'a' && ch <= 'z') && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    ||(ch >= 'A' && ch <= 'Z') && !(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
                        count++;
                    }
                }
            }
            p.println(count);
            p.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

