package Exception;
import java.util.*;

public class TestThrow1 {
    public void check(int x){
        if(x>18){
            System.out.println("Eligible for vote.You may Proceed!");
        }
        else{
            throw new ArithmeticException("You are not eligible for Vote!");
        }
    }

    public static void main(String[] args) {
        TestThrow1 p=new TestThrow1();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int x=s.nextInt();
        p.check(x);
    }
}
