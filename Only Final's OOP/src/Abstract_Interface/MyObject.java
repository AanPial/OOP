package Abstract_Interface;

public abstract class MyObject {
    private double r;
    public MyObject(double r){
        this.r=r;
    }
    public double getR(){return r;}
    public abstract double findVolume();
}
class Sphere extends MyObject{
    public Sphere(double a){
        super(a);
    }
    @Override
    public double findVolume() {
        double v;
        v=(4/3)*Math.PI*Math.pow(getR(),3);
        return v;
    }
}
class Cylinder extends MyObject{
    private double h;
    Cylinder(double r,double h){
        super(r);
        this.h=h;
    }
    public double getH(){
        return h;
    }
    public double findVolume(){
        double v;
        v=Math.PI*Math.pow(getR(),2)*h;
        return v;
    }
}
class Cone extends MyObject{
    double h;
    Cone(double r,double h){
        super(r);
        this.h=h;
    }



    public double findVolume() {
        double v;
        v=(1/3)*Math.PI*Math.pow(getR(),2)*h;
        return v;
    }
}
class TMyobj{
    public static void main(String[] args) {
        MyObject a,b,c,d,e;
        a=new Sphere(2.5);
        b=new Cone(1.9,8.9);
        c=new Cylinder(1.5,6.5);
        d=new Cone(2.7,5.7);
        e=new Sphere(3.5);
        System.out.println(a.findVolume()+ b.findVolume()+ c.findVolume()+ d.findVolume()+ e.findVolume());
    }
}
