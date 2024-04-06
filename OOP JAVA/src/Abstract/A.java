package Abstract;

public interface A {
    void a();
    abstract void b();
    void c();
}
abstract class B implements A{
    public void a(){
        System.out.println("I am A");
    }
}
class C extends B{
    public void b(){
        System.out.println("I am B");
    }

    public void c() {
        System.out.println("I am C");
    }
}
class Test69{
    public static void main(String[] args) {
        A p=new C();
        p.a();
        p.b();
        p.c();

        B q=new C();
        q.a();
        q.b();
        q.c();

        C r=new C();
        r.a();
        r.b();
        r.c();
    }
}
