package Static;

public class one {
    static int a=10;
    one (){
        System.out.println("k tmi");
    }
    public void earth(){
        System.out.println("Ami vai pial");
    }
    public void gg(){
        this.earth();
    }
    static void world(){
        System.out.println("Hello world"+a);
        a=20;
    }
    {
        System.out.println(" apple");
    }
    static {

        System.out.println("Voldemort");
    }
    public static void main(String[] args) {
        System.out.println(a);
        world();
        System.out.println(a);
        one p=new one();
        p.gg();
    }
    static {
        System.out.println("Hi my friend.");
    }
    {
        System.out.println("Irfan");
    }
    static {
        System.out.println("Xiao");
    }

}