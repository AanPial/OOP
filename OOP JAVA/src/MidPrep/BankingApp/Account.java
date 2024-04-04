package MidPrep.BankingApp;

public class Account {
    private String Name;
    private int Id;
    private double Balance;

    public Account(String Name,int Id,double Balance){
        this.Name=Name;
        this.Id=Id;
        this.Balance=Balance;
    }
    public void setName(String a){
        Name=a;
    }
    public void setId(int a){
        Id=a;
    }
    public void setBalance(double a){
        Balance=a;
    }
    public void deposit(double a){
        Balance=Balance+a;
    }
    public void withdraw(double a){
        Balance=Balance-a;
    }
    public double getBalance(){
        return Balance;
    }
    public String getName(){
        return Name;
    }
    public int getId(){
        return Id;
    }
}
class testAcc{
    public static void main(String[] args) {
        Account p=new Account("Abdullah",22,0.0);

    }

}