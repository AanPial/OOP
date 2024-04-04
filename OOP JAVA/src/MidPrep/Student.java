package MidPrep;

public class Student {
    public int Id;
    public String name;
    public double gpa;
    public Student(String name,int Id,double cgpa){
        this.name=name;
        this.Id=Id;
        this.gpa=cgpa;
    }
    public void updateId(int a){
        this.Id=a;
    }
    public void updateGpa(double gpa){
        this.gpa=gpa;
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student s1=new Student("Sohel",2,3.5);
        Student s2=new Student("Sakil",5,2.7);
        System.out.println("Before Update : ");
        show(s1);
        show(s2);
        System.out.println("===========================");
        System.out.println("After Update : ");
        s1.updateGpa(2.9);
        s2.updateId(6);
        show(s1);
        show(s2);
    }
    static void show(Student s){
        System.out.println("Name : "+s.name);
        System.out.println("ID : "+s.Id);
        System.out.println("GPA : "+s.gpa);
    }
}
