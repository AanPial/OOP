package ArrayList;
import java.lang.*;
import java.util.*;

public class Student1 implements Comparable<Student1>{
    String name;
    int age;
    int rollno;
    Student1(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println("Name : "+name+" ,Roll : "+rollno+" ,Age : "+age);
    }
    public int compareTo(Student1 q){
        if (age>q.age){
            return 1;
        }
        else if(age<q.age){
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
class TestStudent1{
    public static void main(String[] args) {
        ArrayList<Student1> p=new ArrayList<>();
        p.add(new Student1(101,"Vijay",23));
        p.add(new Student1(106,"Ajay",27));
        p.add(new Student1(105,"Jai",21));
        System.out.println("Before : ");
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
        System.out.println("After : ");
        Collections.sort(p);
        for (int i=0;i<p.size();i++){
            p.get(i).show();
        }
        Collections.sort(p);
    }
}
