package Practice;

public abstract class Shape {
    private double a;
    public Shape(double a){
        this.a=a;
    }

    public double getA() {
        return a;
    }

    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape{
    Circle (double a){
        super(a);
    }
    public double area(){
        double r=getA();
        double p=Math.PI*r*r;
        return p;
    }
    public double perimeter(){
        double r=getA();
        double p=2*Math.PI*r;
        return p;
    }
}
class Rectangle extends Shape{
    private double b;
    Rectangle(double a,double b){
        super(a);
        this.b=b;
    }
    public double area(){
        return getA()*b;
    }
    public double perimeter(){
        return 2*(getA()+b);
    }
}
class Square extends Shape{
    private double b;
    Square(double a){
        super(a);
    }
    public double area(){
        return getA()*getA();
    }
    public double perimeter(){
        return 4*getA();
    }
}
class SMain{
    public static void main(String[] args) {
        Shape c,r,s;
        c=new Circle(5.0);
        System.out.println("Circle Area : "+c.area());
        System.out.println("Circle Perimeter : "+c.perimeter());

        r=new Rectangle(4.0,7.0);
        System.out.println("Rectangle Area : "+r.area());
        System.out.println("Rectangle Perimeter : "+r.perimeter());

        s=new Square(4.0);
        System.out.println("Square Area : "+s.area());
        System.out.println("Square Perimeter : "+s.perimeter());
    }
}