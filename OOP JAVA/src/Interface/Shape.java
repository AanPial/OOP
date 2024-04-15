package Interface;

public interface Shape {
    double getArea();
}
class Rectangle1 implements Shape{
    private double length,width;
    public Rectangle1(double length,double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
class Square1 extends Rectangle1{
    Square1(double x){
        super(x,x);
    }
}
class ShapeTest{
    public static void draw(Shape s){
        System.out.println("drawing over "+s.getArea()+" area");
    }

    public static void main(String[] args) {
        Shape r =new Rectangle1(5,6);
        Shape s= new Square1(3);
        draw(r);
        draw(s);
    }
}