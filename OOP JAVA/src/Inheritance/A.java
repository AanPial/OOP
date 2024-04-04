package Inheritance;

public class A {
    public void show(){
        System.out.println("Bird can fly.");
    }
}
class B extends A{
    public void show(){
        System.out.println("Fish can Swim.");//Method override.
    }

    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
