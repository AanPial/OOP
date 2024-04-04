package Inheritance;

public class Ractangle {
    public int height;
    public int width;
    public Ractangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int getArea(){
        return height*width;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }
}
class Square extends Ractangle{
    public Square(int x){
        super(x,x);
    }
}
class textEv{
    public static void main(String[]args){
        Ractangle r=new Ractangle(7,5);
        int p=r.getArea();
        int q= r.getPerimeter();
        System.out.println("Area : "+p+"   "+"Perimeter : "+q);
        Square s=new Square(5);
        int p1=s.getArea();
        int q1= s.getPerimeter();
        System.out.println("Area1 : "+p1+"   "+"Perimeter1 : "+q1);
    }
}
