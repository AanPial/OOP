package MidPrep;

public class BankAccount {
    public String name;
    private String account_id;
    private double balance;
    BankAccount(String name,double balance, String gender){
        this.name=name;
        this.balance=balance;
        this.account_id=gender+"-"+name;
    }
    public String getAccount_id(){
        return account_id;
    }
    public double getBalance(){
        return balance;
    }
    public double updateBalance(double a){
        if (balance>a){
            balance=balance-a;
            return balance;
        }
        else {
            return 0;
        }
    }
}
class Test{
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Mr.Rahman",1000,"Male");
        System.out.println("Account id:"+b.getAccount_id());
        System.out.println("balance before:"+b.getBalance());
        b.updateBalance(2000.0);
    }
}