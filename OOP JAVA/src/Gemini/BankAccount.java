package Gemini;

public class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;

    public BankAccount()
    {
        customerName="Pial";
        accountNumber=0+"";
        balance=0.0;
    }
    public BankAccount(String customerName,String accountNumber,double balance)
    {
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public double deposit(double amount)
    {
        balance = balance+amount;
        return balance;
    }
    public double withdraw(double amount)
    {
        balance=balance-amount;
        return balance;
    }
    public String getDetails()
    {
        String str;
        return str="Name: "+customerName+" Id: "+accountNumber+" Balance : "+balance;
    }
    public void set1(String customerName)
    {
        customerName=customerName;
    }
    public void set2(String accountNumber)
    {
        accountNumber=accountNumber;
    }
    public void set3(double balance)
    {
        balance=balance;
    }
    public String get1()
    {
        return customerName;
    }
    public String get2()
    {
        return accountNumber;
    }
    public double get3()
    {
        return balance;
    }
}
class Main{
    public static void main(String[]args)
    {
        BankAccount p=new BankAccount("Pial vai",123+"",150000);
        System.out.println("After deposit : "+p.deposit(50000));
        System.out.println("After withdraw : "+p.withdraw(10000));
        System.out.println("Details : "+p.getDetails());
        System.out.println("Details : "+p.get1());
        System.out.println("Details : "+p.get2());
        System.out.println("Details : "+p.get3());
    }
}
