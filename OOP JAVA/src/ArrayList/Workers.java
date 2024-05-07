package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Workers implements Comparable<Workers>{
    String name;
    double salary;
    public Workers(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public int compareTo(Workers s){
        return name.compareTo(s.name);
    }
}
class testWorker{
    public static void main(String[] args) {
        Workers w1=new Workers("ppl",245);
        Workers w2=new Workers("ppa",5000);
        Workers w3=new Workers("pps",200);
        ArrayList<Workers>p=new ArrayList<>();
        p.add(w1);
        p.add(w2);
        p.add(w3);
        for (Workers x:p){
            show(x);
        }
        System.out.println("After : ");
        Collections.sort(p);
        for (Workers x:p){
            show(x);
        }
    }
    public static void show(Workers p){
        System.out.println("Name : "+p.name+", Salary : "+ p.salary);
    }
}
