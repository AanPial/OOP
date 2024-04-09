package Interface;

public interface Printable {
    void print();//by default... public abstract void print();
}
class A6 implements Printable{
    public void print(){
        System.out.println("Hello");
    }
}
class A7main{
    public static void main(String[] args) {
        Printable p=new A6();
        p.print();
    }
}
