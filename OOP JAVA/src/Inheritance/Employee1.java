package Inheritance;

public class Employee1 {
    public String name;
    public float salary;

    public Employee1(String name,float salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public void show()
    {
        System.out.print(name+" "+salary);
    }
}
