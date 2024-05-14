package ArrayList;
import java.util.ArrayList;

public class Nur {
    Nur(String s){
        ArrayList<Character>p=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            p.add(s.charAt(i));
        }
        if(p.size()>3)
        {
            p.set(2,'z');
        }
        for (int i=0;i<p.size();i++){
            System.out.print(p.get(i));
        }
    }
    public static void main(String[] args) {
        new Nur("Nur Alam vai");
    }

}
