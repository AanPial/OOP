package ArrayList;
import java.util.*;
public class Ar1 {
    public static void main(String[] args) {
        ArrayList<Integer>p=new ArrayList<>();
        p.add(10);
        p.add(12);
        p.add(5);
        p.add(7);
        p.add(2);
        System.out.println("Normal : ");
        for (int x:p){
            System.out.print(x+" ");
        }
        System.out.println("\nAfter remove : ");
        p.remove(2);
        for(int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
        System.out.println("\nAfter Adding at 1 no index : ");
        p.set(0,100);
        for(int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
        System.out.println("\nSorting Ascending : ");
        Collections.sort(p);
        for(int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
        System.out.println("\nSorting Descending : ");
        Collections.sort(p,Collections.reverseOrder());
        for(int i=0;i<p.size();i++){
            System.out.print(p.get(i)+" ");
        }
    }
}
