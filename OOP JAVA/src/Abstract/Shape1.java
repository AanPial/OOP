package Abstract;

public abstract class Shape1 {
    abstract void draw();
}
class Rectangle1 extends Shape1{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle1 extends Shape1{
    void draw(){
        System.out.println("Drawing Circle");
    }
}
class main1{
    public static void main(String [] args){
        Shape1 r,c;
        r=new Rectangle1();
        r.draw();
        c=new Circle1();
        c.draw();
    }
}
