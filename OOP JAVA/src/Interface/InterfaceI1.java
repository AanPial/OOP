package Interface;

public interface InterfaceI1 {
    void methodA();
}
interface InterfaceI2{
    void methodB();
}
class InterfaceTest implements InterfaceI1,InterfaceI2{
    @Override
    public void methodA() {
        System.out.println("A");
    }

    @Override
    public void methodB() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        InterfaceTest x= new InterfaceTest();
        x.methodA();
        x.methodB();
    }
}
