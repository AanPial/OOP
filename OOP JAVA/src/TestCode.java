public class TestCode {

    static int x;

    static {
        x=20;
        System.out.println(x);
    }

    static {
        System.out.println("Hello world!");

    }

}
class p{
    public static void main(String[] args) {
        System.out.println(TestCode.x);
    }
}