public class TestBankAccount {
    public static void main(String[]args)
    {
        BankAccount p=new BankAccount("Pial",19,90000);
        System.out.println("Current Balance : ");
        System.out.println("Name : "+p.name);
        System.out.println("ID : "+p.id);
        System.out.println("Balance : "+p.balance);
        System.out.println("Serial no : "+p.serial);

        p.dep(10000);
        getp(p);

        p.withdraw(50000);
        p.disp();
    }
    static void getp(BankAccount x)
    {
        System.out.println("\nAfter deposite : ");
        System.out.println("Name : "+x.name);
        System.out.println("ID : "+x.id);
        System.out.println("Balance : "+x.balance);
        System.out.println("Serial no : "+x.serial);
    }
}
