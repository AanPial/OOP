package Gemini;

public class Student {
    public String name;
    public int roll;
    public int age;
    public Student(String name,int roll,int age){
        this.name=name;
        this.roll=roll;
        this.age=age;
    }
    public void show(int q){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        System.out.println("new age = "+q);
    }
    public static void main(String[]args){
        Student p=new Student("Pial",210663,23);
        p.show(24);
    }
}
