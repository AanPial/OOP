package Interface;

public interface MultiPrintable {
    void print();
}
interface Showable{
    void print();
}

class TestInterface3 implements MultiPrintable, Showable{
    public void print(){System.out.println("Hello");}
    public static void main(String args[]){
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}
