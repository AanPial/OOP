package W3Resource.Inheritance;

public class Animal {
    public void makesound(){
        System.out.println("The animal makes sound.");
    }
}
class Cat extends Animal{
    public void makesound(){
        super.makesound();
        System.out.println("Bark");
    }
}
class Main{
    public static void main(String[]args){
        Cat p=new Cat();
        p.makesound();

    }
}
