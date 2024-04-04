import java.util.Random;

public class BankAccount {
    public String name;
    public int id;
    public double balance;
    public String serial;

    public BankAccount(String name,int id,double balance)
    {
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    {
        serial=new Random().nextInt(1000)+"";
    }
    public void dep(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount)
    {
        balance=balance-amount;
    }
    public void disp()
    {
        System.out.println("\nAfter Withdrawel : ");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Balance : "+balance);
        System.out.println("Serial no : "+serial);
    }
}
