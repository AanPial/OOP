package check;
import java.util.*;
public class TestBankAccount {
    public static void main(String[]args)
    {
        Scanner q=new Scanner(System.in);
        BankAccount p=new BankAccount("Shahin",210663,150000);
        System.out.print("Enter amount : ");
        double z= q.nextDouble();
        double x=p.add(z);
        show(p,x);
    }
    static void show(BankAccount p,double x)
    {
        System.out.println("Name : "+p.name);
        System.out.println("ID : "+p.Id);
        System.out.println("New amount : "+x);
    }
}
