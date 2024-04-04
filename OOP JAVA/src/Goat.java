public class Goat {
    public double weight;
    public int age;

    public double getPrice()
    {
        double p=Math.pow(weight,age);
        return p;
    }
    public Goat(double weight,int age)
    {
        this.weight=weight;
        this.age=age;
    }
}
