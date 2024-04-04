package MidPrep;

public class Animal {
    private int age;
    private double weight;
    public double computePrice(double c){
        return -1.0;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public int getAge(){
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
class Goat extends Animal{
    public double computePrice(double c){
        double p;
        double weight=getWeight();
        double age=getAge();
        double w=weight*weight/age;
        p=Math.pow(w,c);
        return p;
    }
}
class Sheep extends Animal{
    private double b;
    public Sheep(double b){
        this.b=b;
    }
    public double computePrice(double c) {
        double p;
        double weight = getWeight();
        double age = getAge();
        double w = (weight * weight) / (age + b);
        p = Math.pow(w, c);
        return p;
    }
}
class Avg{
    public  static void main(String[]args){
        Animal g=new Goat();
        Animal s=new Sheep(8.6);
        g.setAge(2);
        g.setWeight(15.0);
        double a=g.computePrice(0.59);
        System.out.println("Goat Price : "+a);

        s.setAge(3);
        s.setWeight(37);
        double b=s.computePrice(0.34);
        System.out.println("Sheep Price : "+b);

        double avg=(a+b)/2;
        System.out.println("Average price : "+avg);
    }
}
