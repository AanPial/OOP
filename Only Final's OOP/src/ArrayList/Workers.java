//Using Comparable<> class
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Workers implements Comparable<Workers>{
    String name;
    double Salary;
    Workers(String x,double y){
        name=x;
        Salary=y;
    }
    public void show(){
        System.out.println("Name : "+name+" Salary: "+Salary);
    }
    public int compareTo(Workers w){
        if(Salary>w.Salary){
            return 1;
        }
        else {
            return -1;
        }
    }
}
class TestWorkers {
    public static void main(String[] args) {
        ArrayList<Workers> p=new ArrayList<>();
        p.add(new Workers("pial",2500.5));
        p.add(new Workers("cdh",4251.5));
        p.add(new Workers("sh",9000));
        p.add(new Workers("jkjl",1000.1));
        p.add(new Workers("al",987));

        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
        System.out.println("\nAfter Ascending(Salary) : ");
        Collections.sort(p);
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
    }
}
