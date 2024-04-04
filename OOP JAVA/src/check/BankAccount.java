package check;

public class BankAccount{
    public String name;
    public int Id;
    public double amount;

    public BankAccount(String name,int Id,double amount){
        this.name=name;
        this.Id=Id;
        this.amount=amount;
    }
    public double add(double x)
    {
        amount=amount+x;
        return amount;
    }
}
