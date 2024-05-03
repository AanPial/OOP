package ArrayList;

import java.util.*;

public class Student {
    private String name;
    private int id;
    private double gpa;
    public Student(String name,int id,double gpa){
        this.name=name;
        this.id=id;
        this.gpa=gpa;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public double getGpa() {
        return gpa;
    }
    public void show(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("GPA : "+gpa);
    }
}
class demo{
    public static void main(String[] args) {
        Student p1=new Student("Pial",101,2.7);
        Student p2=new Student("Irfan",102,3.12);
        Student p3=new Student("Arafat",201,3.73);
        Student p4=new Student("Mahdi",305,3.5);
        Student p5=new Student("Ankun",111,3.6);

        ArrayList<Student> irfan=new ArrayList<Student>();
        irfan.add(p2);
        irfan.add(p3);
        irfan.add(p1);
        irfan.add(p4);
        irfan.add(p5);
        System.out.println("Before : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }
        irfan.remove(2);
        System.out.println("\n\nafter 1st update : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }
        irfan.add(3,p5);
        System.out.println("\n\nafter 2nd update : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }
        Collections.sort(irfan,new Sorting());
        System.out.println("\n\nafter sorted by ID : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }

        Collections.sort(irfan,new Sorting2());
        System.out.println("\n\nafter sorted by GPA : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }
        Collections.sort(irfan,new Sorting3());
        System.out.println("\n\nafter sorted by name : ");
        for(int i=0;i<irfan.size();i++){
            irfan.get(i).show();
        }
    }
}
class Sorting implements Comparator<Student> {
    public int compare(Student p1,Student p2){
        if (p1.getId()>p2.getId()){
            return 1;
        }
        else if (p1.getId()<p2.getId()){
            return -1;
        }
        return 0;
    }
}
class Sorting2 implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        if (s2.getGpa()>s1.getGpa()){
            return 1;
        }
        else if (s2.getGpa()<s1.getGpa()){
            return -1;
        }
        return 0;
    }
}
class Sorting3 implements Comparator<Student>{
    public int compare(Student p,Student l){
        return p.getName().compareTo(l.getName());
    }
}
