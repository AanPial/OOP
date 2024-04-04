package Inheritance;

public class Man {
    private int weight;
    public Man(int weight)
    {
        this.weight=weight;
    }
    public void setWeight(int weight){
        if(weight>=50 && weight<=100){
            this.weight=weight;
        }
    }
    public int getWeight(){
        return weight;
    }
    public void show()
    {
        System.out.println("Weight : "+weight);
    }
}
class SuperMan extends Man{
    public int power;
    public SuperMan(int power){
        super(70);
        this.power=power;
    }
    public SuperMan(int power,int weight){
        super(weight);
        this.power=power;
    }
    public void show(){
        super.show();
        System.out.println("Power : "+power);
    }
    public void show(String abc){
        System.out.println(abc);
    }
    public static void main(String[] args) {
        SuperMan p=new SuperMan(150);
        p.show();
        SuperMan q=new SuperMan(50,60);
        q.show("Lion");
    }
}
