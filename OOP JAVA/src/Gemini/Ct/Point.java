package Gemini.Ct;
public class Point {
    public int x;
    public int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Rectangle1
{
    Point p1,p2,p3,p4;
    public Rectangle1(Point p1,Point p2,Point p3,Point p4)
    {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }

    public double checkDiagonal()
    {
        int a,b,e,f;
        a=p1.x;
        b=p1.y;
        e=p2.x;
        f=p2.y;
        return Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
    }
    public double checkPerimeter()
    {
        int a,b,c,d,e,f;
        a=this.p1.x;
        b=this.p1.y;
        c=this.p2.x;
        d=this.p2.y;
        e=this.p3.x;
        f=this.p3.y;
        double l,w,pery;
        l=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        w=Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
        pery=2*(l+w);
        return pery;
    }
    public int PointInsideRectangle(Point q){
        int a,b,c,d,e,f,g,h;
        a=this.p1.x;
        b=this.p1.y;
        c=this.p2.x;
        d=this.p2.y;
        e=this.p3.x;
        f=this.p3.y;
        g=this.p4.x;
        h=this.p4.y;
        int x= q.x;
        int y= q.y;
        double A1=func(x,y,a,b,c,d);
        double A2=func(x,y,c,d,e,f);
        double A3=func(x,y,e,f,g,h);
        double A4=func(x,y,a,b,g,h);
        double l,w;
        l=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));//p1 to p2=length
        w=Math.sqrt((a-g)*(a-g)+(b-h)*(b-h));//p1 to p4=width
        double Am=(l*w);
        if (Am==(A1+A2+A3+A4))
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public double func(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        double G;
        G=Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
        return G;
    }
    public void RectangleInsideRectangle(Rectangle1 r){
        int x1=PointInsideRectangle(r.p1);
        int x2=PointInsideRectangle(r.p2);
        int x3=PointInsideRectangle(r.p3);
        int x4=PointInsideRectangle(r.p4);
        if(x1==1 && x2==1 && x3==1 && x4==1)
        {
            System.out.println("Rectangle is inside rectangle.");
        }
        else
        {
            System.out.println("Rectangle is NOT inside rectangle.");
        }
    }
}
class TestRectangle
{
    public static void main(String[]args)
    {
        Point p1=new Point(0,0);
        Point p2=new Point(4,0);
        Point p3=new Point(4,4);
        Point p4=new Point(0,4);
        Rectangle1 r=new Rectangle1(p1,p2,p3,p4);
        System.out.println("Diagonal = "+r.checkDiagonal());
        System.out.println("Perimeter = "+r.checkPerimeter());
        Point q=new Point(5,4);
        int x=r.PointInsideRectangle(q);
        if(x==1)
        {
            System.out.println("The Point is inside the rectangle.");
        }
        else
        {
            System.out.println(("The point is outside the rectangle."));
        }
        Point q1=new Point(1,1);
        Point q2=new Point(9,3);
        Point q3=new Point(3,4);
        Point q4=new Point(2,10);
        Rectangle1 R=new Rectangle1(q1,q2,q3,q4);
        r.RectangleInsideRectangle(R);
    }
}
