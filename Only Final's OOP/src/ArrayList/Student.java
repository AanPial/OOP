//Using Copmarator<> class
package ArrayList;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    String name;
    double cg;
    Student(String x,double y){
        name=x;
        cg=y;
    }
    public void show(){
        System.out.println("Name : "+name+" Cg: "+cg);
    }
}
class Sort implements Comparator<Student>{

    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }

    public static void main(String[] args) {
        ArrayList<Student> p=new ArrayList<>();
        p.add(new Student("pial",2.5));
        p.add(new Student("cdh",4.5));
        p.add(new Student("sh",9));
        p.add(new Student("jkjl",0.1));
        p.add(new Student("al",987));

        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
        System.out.println("\nAfter Ascending(name) : ");
        Collections.sort(p,new Sort());
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
        System.out.println("\nAfter decending(cg) : ");
        Collections.sort(p,new Sorrty());
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
    }
}
class Sorrty implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if (s1.cg< s2.cg){
            return 1;
        }
        else {
            return -1;
        }
    }
}
