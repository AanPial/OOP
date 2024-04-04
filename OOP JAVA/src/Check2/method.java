package Check2;

public class method {
    public int x;
    public int y;
    public method(int a,int b)
    {
        x=a;
        y=b;
    }

    public method() {
        x=10;
        y=20;
    }

    public static void main(String[] args) {
        method p;
        p = new method();
        int x=p.x=10;
        int y=p.y=20;
        int r=sum(x,y);
        System.out.println("Result = "+r);
    }
    static int sum(int x,int y)
    {
        return x+y;
    }
    public int sum2()
    {
        return x+y;
    }
}
class pial{
    public static void main(String[] args)
    {
        method p=new method(10,30);
        System.out.println(p.sum2());
    }
}
