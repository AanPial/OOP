package Abstract;

public abstract class Shape {
    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape{
    public double area(){
        double a=getA();
        double r=Math.PI*a*a;
        return r;
    }
    public double perimeter(){
        double a=getA();
        double p=2*Math.PI*a;
        return p;
    }
}

class Rectangle extends Shape{
    double b;
    public Rectangle(double b){
        this.b=b;
    }
    public double area(){
        double a=getA();
        double r=a*b;
        return r;
    }
    public double perimeter(){
        double a=getA();
        double p=2*(a+b);
        return p;
    }
}

class Square extends Shape{
    public double area(){
        double a=getA();
        double r=a*a;
        return r;
    }
    public double perimeter(){
        double a=getA();
        double p=4*a;
        return p;
    }
}
class main{
    public static void main(String[] args) {
        Shape cr,sqr;
        cr=new Circle();
        sqr=new Square();
        Rectangle rct=new Rectangle(7.0);
        cr.setA(5.0);
        System.out.println("Area of the Circle : "+cr.area());
        System.out.println("Perimeter of the Circle : "+cr.perimeter());
        System.out.println("");
        rct.setA(5.0);
        System.out.println("Area of the rectangle : "+rct.area());
        System.out.println("Perimeter of the rectangle : "+rct.perimeter());
        System.out.println("");
        sqr.setA(5.0);
        System.out.println("Area of the square : "+sqr.area());
        System.out.println("Perimeter of the square : "+sqr.perimeter());
        System.out.println("");
    }
}
