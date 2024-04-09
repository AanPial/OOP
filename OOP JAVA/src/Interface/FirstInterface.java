package Interface;

public interface FirstInterface {
    void method();
}
interface SecondInterface{
    public void other();
}
class FSDemo implements FirstInterface,SecondInterface{
    @Override
    public void method() {
        System.out.println("Some Text");
    }

    @Override
    public void other() {
        System.out.println("Other Text");
    }
}
class TestFinterface {
    public static void main(String[] args) {
        FirstInterface s;
        s=new FSDemo();
        s.method();
        SecondInterface f;
        f=new FSDemo();
        f.other();
        FSDemo fs=new FSDemo();
        fs.method();
        fs.other();
    }
}
