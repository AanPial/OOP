public class Cake {
    protected String name;
    protected double rate;
    public Cake(String n, double r)
    {
        name = n;
        rate = r;
    }
    public double calcPrice(){
        System.out.println("Print the calculated price.");
        return 0.0;
    }
    public void printDetails(){
        System.out.println("Prints the detail.");
    }
}
class OrderCake extends Cake{
    double weight;
    public OrderCake(String n, double r, double w){
        super(n, r);
        weight = w;
    }
    public double calcPrice(){
        double p;
        p=rate * weight;
        return p;
    }
    public void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Rate : "+rate);
        System.out.println("Weight : "+weight);
        System.out.println("Total Price : "+calcPrice());
    }
}
class ReadymadeCake extends Cake{
    int quantity;
    public ReadymadeCake(String n, double r, int q){
        super(n, r);
        quantity = q;
    }
    public double calcPrice(){
        double p;
        p=rate * quantity ;
        return p;
    }
    public void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Rate : "+rate);
        System.out.println("Quantity : "+quantity);
        System.out.println("Total Price : "+calcPrice());
    }
}
class SMain {
    public static void main(String[] args) {
        Cake []cake=new Cake[3];
        cake[0]=new OrderCake("OrderCake",150.0,3);
        cake[1]=new OrderCake("OrderCake",150.0,3);
        cake[2]=new ReadymadeCake("ReadymadeCake",200.0,2);

        for (int i = 0; i < cake.length; i++) {
            cake[i].printDetails();
        }
    }
}
