package MidPrep;

public class Hello {
     int x;
    double y;
    public Hello(int x,double y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
class Hi extends Hello{
    Hi(int a,double b){
        super(a,b);
    }
    public void hello (){
        double t=x+y;
    }
}
class testuu{
    public static void main(String[] args) {
        Hello p=new Hello(10,5.5);
        Hi q=new Hi(5,5);
        System.out.println(p.x);
        System.out.println(q.x);
    }
}
