package Inheritance;

public class Pp {
    int x=10;
    void my(){
        System.out.println("instance method");
    }
    Pp(int x){
        System.out.println("Constructor.");
    }
    static {
        System.out.println("Static");
    }
}
class Cc extends Pp{
    Cc(int x){
        super(x);
    }
    int y=20;
    public static void main(String[] args) {
        Cc p=new Cc(10);
        System.out.println("Main");
    }
}
