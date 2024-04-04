package Inheritance;

public class E {
    E(){
        System.out.println("I am E");
    }
}
class F extends E{
    F(){
        System.out.println("I am F");
    }
}
class G extends F{
    G(){
        System.out.println("I am G");
    }
}
class caaling{
    public static void main(String[] args) {
        E p=new G();
    }
}
