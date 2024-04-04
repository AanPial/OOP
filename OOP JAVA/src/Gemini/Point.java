package Gemini;

public class Point {
    private int x;
    private int y;

    public Point()
    {
        //no arguments uses defaults.
    }
    {
        x=0;
        y=0;
    }
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void set(int a)
    {
        x=a;
    }
    public void set1(int b)
    {
        y=b;
    }
    public int get()
    {
        return x;
    }
    public int get1()
    {
        return y;
    }
    public static void main(String[]args)
    {
        Point p=new Point();
        Point q=new Point(2,1);
        System.out.println("Point 1: (" + p.get() + ", " + p.get1() + ")");
        System.out.println("Point 2: (" + q.get() + ", " + q.get1() + ")");
    }

}
