package Static;

public class Goat {
    public double weigth;
    public int age;
    public Goat(double weigth,int age){
        this.weigth=weigth;
        this.age=age;
    }
    public double getPrice(){
        double p;
        p=Math.pow(weigth,age);
        return p;
    }
}
class TestGoat{
    public static void main(String[] args) {
        Goat g1=new Goat(12.5,5);
        Goat g2=new Goat(12.3,3);
        Goat g3=new Goat(10.1,2);
        double a,b,c;
        a= g1.getPrice();
        b=g2.getPrice();
        c= g3.getPrice();
        double total=0.0;

        total=a+b+c;

        System.out.println("Total Price : "+total);
    }
}
