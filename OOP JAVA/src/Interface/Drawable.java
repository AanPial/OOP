package Interface;

public interface Drawable {
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
class TestDrawable{
    public static void main(String[] args) {
        Drawable r,c;
        r=new Rectangle();
        c=new Circle();
        r.draw();
        c.draw();
    }
}
