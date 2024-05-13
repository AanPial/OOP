package Exception;

import java.util.Scanner;

public class CustomException {
    public void check(int x)throws InvalidAgeException{
        if(x>18){
            System.out.println("Eligible for vote.You may Proceed!");
        }
        else{
            throw new InvalidAgeException("You are not Eligible");
        }
    }
    public static void main(String[] args) throws InvalidAgeException{
        CustomException p=new CustomException();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int x=s.nextInt();
        p.check(x);
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
