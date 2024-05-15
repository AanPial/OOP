package Abstract_Interface;

// Interface A
interface A {
    int p();
    int q();
}

// Interface B
interface B {
    int x();
    int y();
}

// Abstract class C
abstract class C implements A, B {
    abstract int z();
    @Override
    public int p() {
        System.out.println("Method p() from class D");
        return 0;
    }

    @Override
    public int q() {
        System.out.println("Method q() from class D");
        return 0;
    }

    @Override
    public int x() {
        System.out.println("Method x() from class D");
        return 0;
    }

    @Override
    public int y() {
        System.out.println("Method y() from class D");
        return 0;
    }

}

class D extends C {

    @Override
    int z() {
        System.out.println("Method z() from class D");
        return 0;
    }
}

class TA{
    public static void main(String[] args) {
        D d = new D();
        d.p();
        d.q();
        d.x();
        d.y();
        d.z();
    }
}
