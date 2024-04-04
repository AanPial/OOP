public class T {
    public double weight;
    public int age;

    public double getPrint()
    {
        double p=Math.pow(weight,age);
        return p;
    }
    public T(double weight,int age)
    {
        this.weight=weight;
        this.age=age;
    }
}
