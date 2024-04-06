package Abstract;

public abstract class Bike1 {
    Bike1(){
        System.out.println("Bike is created.");
    }
    abstract void run();
    void gearChange(){
        System.out.println("Gear changed");
    }
}
class Honda1 extends Bike1{

    void run() {
        System.out.println("Running safely.");
    }
}
class Test{
    public static void main(String[] args) {
        Bike1 p=new Honda1();
        p.gearChange();
        p.run();
    }
}
