package Inheritance;

public class Vehicle {
    protected String brand="Ford";
    public void honk()
    {
        System.out.println("Tut,tut");
    }
}
class car extends Vehicle{
    private String midname="Mustang";
    public static void main(String[]args)
    {
        car mycar=new car();
        System.out.println("Name : "+mycar.brand);
        System.out.println("Mid Name : "+mycar.midname);
        mycar.honk();
    }
}
