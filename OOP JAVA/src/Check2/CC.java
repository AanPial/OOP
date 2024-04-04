package Check2;

public class CC {
    static int d;
    public double radius;
    public CC(double radius){
        this.radius=radius;
    }
    public double pp(){
        return radius;
    }
    public static void main(String[]args)
    {
        CC p=new CC(15.5);
        d=13;
        System.out.println(d);
        System.out.println(p.pp());
    }
}
