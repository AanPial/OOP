package Inheritance;

public class Empolyee {
    public String name="Mahmud";
    public float salary=5000;
    public void show()
    {
        System.out.print(name+" "+salary);
    }
}
class Manager extends Empolyee{
    public String dep="Engineering";
    public void show()
    {
        super.show();
        System.out.println(" "+dep);
    }

    public static void main(String[] args) {
        Manager p=new Manager();
        p.show();
    }
}
