package Gemini.Ct;

public class Goat {
    double weight;
    int age;
    public Goat(double weight,int age) {
        this.weight=weight;
        this.age=age;
    }
    public double getPrice(){
        double p;
        p=Math.pow(weight,age);
        return p;
    }
}
class Test{
    public static void main(String[] args) {
        Goat [] arr=new Goat[3];
        arr[0]=new Goat(12.5,5);
        arr[1]=new Goat(12.3,3);
        arr[2]=new Goat(10.1,2);

        double total=0.0;
        for (int i=0;i<arr.length;i++){
            total=total+arr[i].getPrice();
        }
        System.out.println("Total Price = "+total);
    }
}
