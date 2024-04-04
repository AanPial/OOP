public class Point2 {
    int x;
    int y;
    public Point2(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Rectangle
{
    Point2 p1,p2,p3,p4;
    public Rectangle(Point2 p1,Point2 p2,Point2 p3,Point2 p4)
    {
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }
    public double checkDiag()
    {
        int a,b,c,d,e,f;
        a=this.p1.x;
        b=this.p1.y;
        c=this.p2.x;
        d=this.p2.y;
        e=this.p3.x;
        f=this.p3.y;
        double ab,ac,cb;
        ab=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
        ac=Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
        cb=Math.sqrt(ab*ab+ac*ac);
        return cb;
    }
    public double checkDiag2()
    {
        int a,b,e,f;
        double dis;
        a=p1.x;
        b=p1.y;
        e=p4.x;
        f=p4.y;
        dis=Math.sqrt((a-e)*(a-e)+(b-f)*(b-f));
        return dis;
    }
    public double checkPeri()
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
    public boolean checkpoint(Point2 q)
    {
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
        System.out.println("//////*"+A1);
        double A2=func(x,y,c,d,e,f);
        System.out.println("//////**"+A2);
        double A3=func(x,y,e,f,g,h);
        System.out.println("//////***"+A3);
        double A4=func(x,y,a,b,g,h);
        System.out.println("//////****"+A4);
        double l,w;
        l=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));//p1 to p2=length
        w=Math.sqrt((a-g)*(a-g)+(b-h)*(b-h));//p1 to p4=width
        double Am=(l*w);
        System.out.println("//////"+Am);
        if (Am==(A1+A2+A3+A4))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public double func(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        double G;
        G=Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
        return G;
    }

}
class Circle1{
    Point2 center;
    double radius;

}
class TestRactangle{
    public static void main(String[]args)
    {
        Point2 p1=new Point2(0,0);
        Point2 p2=new Point2(6,0);
        Point2 p3=new Point2(6,4);
        Point2 p4=new Point2(0,4);

        Rectangle r=new Rectangle(p1,p2,p3,p4);

        double diagnal=r.checkDiag();
        System.out.println("Diagnal = "+diagnal);
        double diagnal2=r.checkDiag2();
        System.out.println("Diagnal = "+diagnal2);
        double peri=r.checkPeri();
        System.out.println("Perimeter : "+peri);
        Point2 q=new Point2(8,2);
        boolean popent=r.checkpoint(q);
        if (popent==true)
        {
            System.out.println("The point is inside the Rectangle");
        }
        else
        {
            System.out.println("The point is outside Rectangle");
        }
        Point2 pp1=new Point2(1,0);
        Point2 pp2=new Point2(2,0);
        Point2 pp3=new Point2(1,5);
        Point2 pp4=new Point2(2,5);

    }
}
