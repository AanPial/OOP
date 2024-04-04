package Inheritance;

public class Manager1 extends Employee1{
    public String department;
    public Manager1(String department)
    {
        super("Mahmud",5550.55f);
        this.department=department;
    }
    public void show()
    {
        super.show();
        System.out.println(" "+department);
    }
    public static void main(String[]args){
        Manager1 p=new Manager1("CSE");
        p.show();
    }
}
