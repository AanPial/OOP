package Inheritance;

public class Cat {
    public int x=10;
    public int y=20;
    public void show ()
    {
        System.out.println(x+" "+y);
    }
}
class Rat extends Cat{
    public int z=30;

    public static void main(String[] args) {
        Rat p=new Rat();
        p.show();
        System.out.println(p.x+" "+p.y+" "+p.z);
    }
}
