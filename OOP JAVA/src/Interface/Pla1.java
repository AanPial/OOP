package Interface;

public interface Pla1 {
    void show();
}
interface pla2 extends Pla1{
    void print();
}
class DemoPla implements pla2{
    public void show(){
        System.out.println("Hi");
    }
    public void print(){
        System.out.println("Hello");
    }
}
class TestPla{
    public static void main(String[] args) {
        DemoPla p=new DemoPla();
        p.show();
        p.print();
    }
}
