package Inheritance;

public class bhicle {
    public String name;
    bhicle(String name){
        System.out.println("Vehicle is useful.");
    }
}
class bike extends bhicle{
    bike(){
        super("");
        System.out.println("car is important");
    }
    public static void main(String[]args){
        bike p=new bike();
    }
}
