package Interface;

public interface Animal {
    public void sound();
    public void sleep();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bark!Bark!");
    }
    public void sleep(){
        System.out.println("Zzz");
    }
}
class Degesh{
    public static void main(String[]args){
        Dog p=new Dog();
        p.sleep();
        p.sound();
    }
}
