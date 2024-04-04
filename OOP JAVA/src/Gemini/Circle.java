package Gemini;

public class Circle {
    double radius;
    double area;
    public Circle()
    {
        radius=1.0;
    }
    public Circle(double x){
        radius=x;
    }

    public double getArea() {
        double area;
        area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[]args)
    {
        Circle q=new Circle();
        Circle p=new Circle(5.5);
        double res= q.getArea();
        double res1=p.getArea();
        System.out.println("Radius = "+res);
        System.out.println("Radius = "+res1);
    }
}
