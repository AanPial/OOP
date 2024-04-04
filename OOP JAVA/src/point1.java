public class point1 {
    int x;
    int y;
    public point1(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Cyfy{
    double radius;

    public Cyfy(double r)
    {
        radius=r;
    }
    public int hisab(point1 p1,point1 p2)
    {
        int a,b,c,d;
        double distance;
        a=p1.x;
        b=p1.y;
        c=p2.x;
        d= p2.y;
        distance=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        if (distance>radius)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
class test
{
    public static void main(String[]args)
    {
        point1 p1=new point1(0,0);
        point1 p2=new point1(2,2);
        double r=1;
        Cyfy c=new Cyfy(r);
        int x= c.hisab(p1,p2);
        if (x==1)
        {
            System.out.println("The point is outside of circle");
        }
        else
        {
            System.out.println("The point is inside the circle");
        }
    }
}