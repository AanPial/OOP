package Abstract;

public abstract class Animal {
    String name,color;
    double weigth;
    public Animal(){}
    public Animal(String a,String b,double c){
        name=a;
        color=b;
        weigth=c;
    }
    public void eat(){
        System.out.println(name+" eats");
    }
    public abstract void maksound();
}
class Bird extends Animal{
    Bird(){
        name="Bird";
    }

    @Override
    public void maksound() {
        System.out.println("Chirp");
    }
}
class Tiger extends Animal{
    Tiger(){
        name="Tiger";
    }
    public void maksound() {
        System.out.println("Raaaaaarrrrggghhh");
    }
}
class Test79{
    public static void main(String[] args) {
        Animal p=new Bird();
        p.eat();
        p.maksound();

        Tiger q=new Tiger();
        q.eat();
        q.maksound();
    }
}
