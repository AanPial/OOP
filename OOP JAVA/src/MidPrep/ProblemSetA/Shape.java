package MidPrep.ProblemSetA;

public class Shape {
    public double Height;
    public double length;
    public double base;
    public double radius;

    public Shape(double height,double length,double base,double radius){
        this.Height=height;
        this.length=length;
        this.base=base;
        this.radius=radius;
    }
    public double getArea(double a){
        return a*a;
    }
    public double getArea(double h,double l){
        return h*l;
    }
    public double getArea(int h,double l){
        return 0.5*h*l;
    }
    public double getArea(int a){
        return Math.PI*a*a;
    }
}
