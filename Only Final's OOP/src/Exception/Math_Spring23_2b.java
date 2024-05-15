package Exception;

public class Math_Spring23_2b {
    public int divide(int a, int b) throws DivbyZero{
        if (b==0){
            throw new DivbyZero("The denometor can not be zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Math_Spring23_2b m =new Math_Spring23_2b();

        int n=4;
        int d=0;
        System.out.println(m.divide(n,d));
        
    }
}
class DivbyZero extends ArithmeticException{
    public DivbyZero(String s){
        super(s);
    }
}