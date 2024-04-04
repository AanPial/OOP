package Gemini;

public class Car {
    String make;
    String model;
    int year;
    public Car()
    {
        make="Generic";
        model="Sedan";
        year=2024;
    }
    public void printDetails()
    {
        System.out.println("Make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }
    public static void main(String[]args)
    {
        Car p=new Car();

        System.out.println("Before printDetails : ");
        System.out.println("Make : "+p.make);
        System.out.println("Model : "+p.model);
        System.out.println("Year : "+p.year);

        System.out.println("\nAfter printDetails : ");
        p.printDetails();
    }
}
