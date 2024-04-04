package Check2;

public class Encapsulation {
    private int x=10;
    public void set(int a)
    {
        x=a;
    }
    public int get()
    {
        return x;
    }
}
class Encapsulation2{
    public static void main(String[]args)
    {
        Encapsulation p=new Encapsulation();
        p.set(15);
        System.out.println(p.get());
    }
}
