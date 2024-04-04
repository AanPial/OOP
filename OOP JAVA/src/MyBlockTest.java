public class MyBlockTest {
    public int x;
    public String name;

    public MyBlockTest(int x,String q)
    {
        name=q;
        this.x=x;
        System.out.println(name);
        System.out.println("Age1 : "+x);
    }
    {
        x=20;
        System.out.println("Age2 : "+x);
    }
    public void m()
    {
        System.out.println("Hello World!");
    }

    public static void main(String []args)
    {
        int p=10;
        String q="Pial";
        MyBlockTest P=new MyBlockTest(p,q);
        P.m();
    }
}
