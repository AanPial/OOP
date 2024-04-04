package Inheritance;

public class Parent {
    public int pv=10;
    public void parentMethod(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    public int cv=5;
    public void childMethod(){
        parentMethod();
        System.out.println("In child : "+cv+" In parent"+pv);
    }
}
class Inheritance{
    public static void main(String[] args) {
        Child p=new Child();
        p.parentMethod();
        p.childMethod();
        System.out.println("PV="+p.pv+" CV="+p.cv);
    }

}
