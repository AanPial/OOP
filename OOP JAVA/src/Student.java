public class Student {
    public int ID=20;
    public String name;
    public double gpa;

    public void updateID(int x)
    {
        ID=x;
    }
    public void updateGpa(double y) {
        gpa = y;
    }
    public void display()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+ID);
        System.out.println("GPA : "+gpa);
    }
}
