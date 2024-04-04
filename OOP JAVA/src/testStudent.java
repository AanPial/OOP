public class testStudent {
    public static void main(String[]args)
    {
        Student p1=new Student();
        p1.name="Sohel";
        p1.ID=2;
        p1.gpa=3.5;
        Student p2=new Student();
        p2.name="Sakil";
        p2.ID=5;
        p2.gpa=2.7;
        System.out.println("#####Before update : ");
        print(p1);
        print(p2);
        p1.updateGpa(2.9);
        p2.updateID(6);
        System.out.println("#####After update : ");
        p1.display();
        p2.display();

    }
    public static void print(Student n)
    {
        System.out.println("Name : "+n.name);
        System.out.println("ID : "+n.ID);
        System.out.println("GPA : "+n.gpa);
    }
}
