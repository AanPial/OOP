package Exception;

import java.util.Scanner;

public class ExceptionDemo {
    public void UserCheck(int a,int w)throws InvalidUserException{
        if (a<50){
            throw new InvalidUserException("Ineligible for Elderly pension because of age");
        }
        if(w<20){
            throw new InvalidUserException("Ineligible for Elderly pension because of work experience");
        }
    }
    public static void main(String[] args) throws InvalidUserException{
        ExceptionDemo obj = new ExceptionDemo();
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int work_experience = input.nextInt();
        try {
            obj.UserCheck(age, work_experience);
        }
        catch (Exception e){
            System.out.println("Caught the exception");
        }

    }
}
class InvalidUserException extends Exception{
    InvalidUserException(String s){
        super(s);
    }
}