package Inheritance;

public class Cons {
    String name;
    int age;
    double bal;
    public Cons(String name,int age,double bal)
    {
        this.name=name;
        this.age=age;
        this.bal=bal;
    }
}
class checkCons extends Cons{
    public checkCons(String pial, int i, double v) {
        super(pial, i, v);
    }

    public static void main(String[] args) {
        checkCons p=new checkCons("pial",10,2.5);
        System.out.println(p.name+" "+p.age);
    }
}
