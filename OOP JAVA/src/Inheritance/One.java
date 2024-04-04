package Inheritance;

public class One {
    One(){
        System.out.println("One");
    }
    void show(){
        System.out.println("One-----");
    }
}
class two extends One{
    two(){
        System.out.println("Two");
    }
    void show(){
        System.out.println("two+++++");
    }
    void pr(){
        System.out.println("Nai vai");
    }
}

class test{
    public static void main(String[] args) {
        One p=new two();
        p.show();
        ((two)p).pr();//downcast
    }
}