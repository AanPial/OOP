package ArrayList;
import java.util.*;
public class Arr1 {
    public static void main(String[] args) {
        ArrayList<Double>p=new ArrayList<>();
        for (int i=1;i<10;i++){
            p.add(i+0.0);
        }
        p.remove(3);
        for (double x:p){
            System.out.println(x);
        }
        Collections.sort(p,new sort());
        for (double x:p){
            System.out.print(" "+x);
        }
    }
}
class sort implements Comparator<Double>{

    public int compare(Double o1, Double o2) {
        if (o2>o1){
            return 1;
        }
        else {
            return -1;
        }
    }
}
