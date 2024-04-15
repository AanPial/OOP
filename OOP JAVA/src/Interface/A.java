package Interface;

public interface A {
    public int p();
    public int q();
}
interface B{
    public int x();
    public int y();
}
abstract class C implements A,B{
    public abstract int Z();
}
class D extends C{
    @Override
    public int p() {
        System.out.println("P");
        return 0;
    }

    @Override
    public int q() {
        System.out.println("Q");
        return 0;
    }

    @Override
    public int x() {
        System.out.println("X");
        return 0;
    }

    @Override
    public int y() {
        System.out.println("Y");
        return 0;
    }

    @Override
    public int Z() {
        System.out.println("Z");
        return 0;
    }

    public static void main(String[] args) {
        C p=new D();
        p.p();
        p.q();
        p.x();
        p.y();
        p.Z();
    }
}
