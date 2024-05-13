package Abstract_Interface;

public abstract class Animal {
    public void sleep(){
        System.out.println("Zzz");
    }
    public abstract void sound();
}
class taba extends Animal{
    public void sound(){
        System.out.println("Gwak! Gwak!");
    }
}
class TAnimal{
    public static void main(String[] args) {
        Animal s;
        s=new taba();
        s.sleep();
        s.sound();
    }
}
