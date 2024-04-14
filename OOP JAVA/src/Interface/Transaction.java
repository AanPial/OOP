package Interface;

public interface Transaction {
    public void give();
    public void recieve();
}
abstract class Payment implements Transaction{
    double amount;
    String currency="BDT";

    @Override
    public void give() {
        amount=amount+getCharge()+getTax();
        System.out.println(currency+" "+amount+" is paid.");
    }

    @Override
    public void recieve() {
        System.out.println("[Nothing to receive.]");
    }
    public abstract double getCharge();
    public double getTax(){
        return amount*.156;
    }
}
class CashPay extends Payment{
    CashPay(double a){
        amount=a;
    }

    @Override
    public double getCharge() {
        return 0;
    }
}
class CreditCardPay extends Payment{
    CreditCardPay(double a){
        amount=a;
    }

    @Override
    public double getCharge() {
        return amount*(.025);
    }
}
class CheckPay extends Payment{
    CheckPay(double a){
        amount=a;
    }

    @Override
    public double getCharge() {
        return 10;
    }
}
class Tmain{
    public static void main(String[] args) {
        Payment csh=new CashPay(100);
        csh.give();
        Payment crdt=new CreditCardPay(100);
        crdt.give();
        Payment chk=new CheckPay(100);
        chk.give();
    }
}
